// Generated from /Users/qiaoyize/eclipse-workspace/HipChat/src/main/antlr4/Msg.g4 by ANTLR 4.5.3
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MsgParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MsgVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MsgParser#messageBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageBody(MsgParser.MessageBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#at}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt(MsgParser.AtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#emot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmot(MsgParser.EmotContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#alphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphanumeric(MsgParser.AlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(MsgParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(MsgParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#uri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUri(MsgParser.UriContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheme(MsgParser.SchemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(MsgParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(MsgParser.HostnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#hostnumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostnumber(MsgParser.HostnumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(MsgParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(MsgParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(MsgParser.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogin(MsgParser.LoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(MsgParser.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrag(MsgParser.FragContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(MsgParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#search}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch(MsgParser.SearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link MsgParser#searchparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchparameter(MsgParser.SearchparameterContext ctx);
}