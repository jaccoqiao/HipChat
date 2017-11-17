package hipchat;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
    
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import hipchat.Message;
import hipchat.MessageParser;

public class MessageParserTest
{
    private static final String TEST_URL = "https://twitter.com/jdorfman/status/430511497475670016";
    private static final String TEST_PAGE_TITLE = "test page title";
    private static final String TEST_HTML = "<html><head><title>" + TEST_PAGE_TITLE + "</title></head><html>";

    @Test
    public void testMessageParser() throws Exception
    {
        String input = "@Bob @John (success) such a cool feature; " + TEST_URL;
        Message msg = parser.parse(input);
        List<String> mentions = msg.getMentions();
        List<String> emoticons = msg.getEmoticons();
        List<Message.Link> links = msg.getLinks();

        assertEquals(2, mentions.size());
        assertEquals("Bob", mentions.get(0));
        assertEquals("John", mentions.get(1));
        assertEquals(1, emoticons.size());
        assertEquals("success", emoticons.get(0));
        assertEquals(1, links.size());
        verifyLink(links.get(0));
    }

    @Test
    public void testParseMentions() throws Exception
    {
        String input = "@Bob@John you around?";
        Message msg = parser.parse(input);
        List<String> mentions = msg.getMentions();
        assertEquals(2, mentions.size());
        assertEquals("Bob", mentions.get(0));
        assertEquals("John", mentions.get(1));
    }

    @Test
    public void testParseEmoticons() throws Exception
    {
        String input = "Good morning! (success)(coffeeeeeeeeeeeee)";
        Message msg = parser.parse(input);
        List<String> emoticons = msg.getEmoticons();
        assertEquals(1, emoticons.size());
        assertEquals("success", emoticons.get(0));
    }

    @Test
    public void testParseUrl() throws Exception
    {
        Message msg = parser.parse("such a cool feature; " + TEST_URL + " " + TEST_URL);
        List<Message.Link> links = msg.getLinks();
        assertEquals(2, links.size());
        for (Message.Link link : links)
        {
            verifyLink(link);
        }
    }

    private void verifyLink(Message.Link link)
    {
        assertEquals(TEST_URL, link.getUrl());
        assertEquals(TEST_PAGE_TITLE, link.getTitle());
    }

    @Before
    public void setUp()
    {
        parser = new MessageParser();
        parser.restTemplate = mock(RestTemplate.class);
        when(parser.restTemplate.getForObject(TEST_URL, String.class)).thenReturn(TEST_HTML);
    }

    private MessageParser parser;
}
