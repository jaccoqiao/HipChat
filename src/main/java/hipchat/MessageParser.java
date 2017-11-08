package hipchat;

import generated.MsgLexer;
import generated.MsgParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * <h1>HipChat MessageParser</h1>
 * This MessageParser implements the functions to parse the following data from the input message string:
 * Mentions, Emoticons and Links.
 * <p>
 * The parsing rules are defined in a ANTLR gramma file: /src/main/antlr4/Msg.g4. The input message
 * string will be parsed by the ANTLR parser generated from the gramma file. The Message object will be
 * constructed from the parsed messageBodyContext. Then the Message object will be serialized to a JSON object
 * by the server framework Spring Boot Web Starter and returned to the client.
 *
 * @author Yize Qiao
 * @since 2017-11-12
 */
@RestController
public class MessageParser
{
    @RequestMapping("/parse")
    public Message parse(@RequestBody String input) throws IOException
    {
        ANTLRInputStream inputStream = new ANTLRInputStream(new ByteArrayInputStream(input.getBytes()));
        MsgLexer lexer = new MsgLexer(inputStream);
        MsgParser parser = new MsgParser(new CommonTokenStream(lexer));
        MsgParser.MessageBodyContext messageBodyContext = parser.messageBody();
        Message message = new Message();
        messageBodyContext.at().forEach(at -> message.getMentions().add(at.WORD().getText()));
        messageBodyContext.emot()
                          .stream()
                          .map(emot -> emot.alphanumeric().getText())
                          .filter(text -> text.length() <= 15)
                          .forEach(text -> message.getEmoticons().add(text));
        messageBodyContext.url().forEach(url -> message.getLinks().add(buildLink(url.getText())));

        return message;
    }

    private Message.Link buildLink(String url)
    {
        String html = restTemplate.getForObject(url, String.class);
        return new Message.Link(url, getTitle(html));
    }

    private String getTitle(String html)
    {
        return html.substring(html.indexOf("<title>") + 7, html.indexOf("</title>"));
    }

    RestTemplate restTemplate = new RestTemplate();
}