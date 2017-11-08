// Generated from /Users/qiaoyize/eclipse-workspace/HipChat/src/main/antlr4/Msg.g4 by ANTLR 4.5.3
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MsgParser}.
 */
public interface MsgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MsgParser#messageBody}.
	 * @param ctx the parse tree
	 */
	void enterMessageBody(MsgParser.MessageBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#messageBody}.
	 * @param ctx the parse tree
	 */
	void exitMessageBody(MsgParser.MessageBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#at}.
	 * @param ctx the parse tree
	 */
	void enterAt(MsgParser.AtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#at}.
	 * @param ctx the parse tree
	 */
	void exitAt(MsgParser.AtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#emot}.
	 * @param ctx the parse tree
	 */
	void enterEmot(MsgParser.EmotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#emot}.
	 * @param ctx the parse tree
	 */
	void exitEmot(MsgParser.EmotContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(MsgParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(MsgParser.AlphanumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(MsgParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(MsgParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(MsgParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(MsgParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#uri}.
	 * @param ctx the parse tree
	 */
	void enterUri(MsgParser.UriContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#uri}.
	 * @param ctx the parse tree
	 */
	void exitUri(MsgParser.UriContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(MsgParser.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(MsgParser.SchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(MsgParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(MsgParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(MsgParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(MsgParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#hostnumber}.
	 * @param ctx the parse tree
	 */
	void enterHostnumber(MsgParser.HostnumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#hostnumber}.
	 * @param ctx the parse tree
	 */
	void exitHostnumber(MsgParser.HostnumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(MsgParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(MsgParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(MsgParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(MsgParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(MsgParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(MsgParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#login}.
	 * @param ctx the parse tree
	 */
	void enterLogin(MsgParser.LoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#login}.
	 * @param ctx the parse tree
	 */
	void exitLogin(MsgParser.LoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(MsgParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(MsgParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#frag}.
	 * @param ctx the parse tree
	 */
	void enterFrag(MsgParser.FragContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#frag}.
	 * @param ctx the parse tree
	 */
	void exitFrag(MsgParser.FragContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(MsgParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(MsgParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#search}.
	 * @param ctx the parse tree
	 */
	void enterSearch(MsgParser.SearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#search}.
	 * @param ctx the parse tree
	 */
	void exitSearch(MsgParser.SearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link MsgParser#searchparameter}.
	 * @param ctx the parse tree
	 */
	void enterSearchparameter(MsgParser.SearchparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MsgParser#searchparameter}.
	 * @param ctx the parse tree
	 */
	void exitSearchparameter(MsgParser.SearchparameterContext ctx);
}