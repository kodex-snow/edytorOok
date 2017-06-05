package kot.kotsnow.ookEditor;

public interface HtmlTagsRegex {

	String HTML_OPEN = "<html[^>]*>";
	String HTML_CLOSE="</html>";

	String HEAD_OPEN="<head[^>]*>";
	String HEAD_CLOSE="</head>";

	String BODY_OPEN="<body[^>]*>";
	String BODY_CLOSE="</body>";

	String PARAGRAPH_OPEN="<p[^>]*>";
	String PARAGRAPH_CLOSE="</p>";

	String FONT_OPEN="<font[^>]*>";
	String FONT_CLOSE="</font>";

	String KEYWORD_OPEN="<span[^>]*>";
	String KEYWORD_CLOSE="</span>";

	String SCRIPT_OPEN="<script[^>]*>";
	String SCRIPT_CLOSE="</script>";

	String[] HTMLTAGS ={HTML_OPEN,HTML_CLOSE,HEAD_OPEN,HEAD_CLOSE,BODY_OPEN,BODY_CLOSE,
			PARAGRAPH_OPEN,PARAGRAPH_CLOSE, FONT_OPEN, FONT_CLOSE, KEYWORD_OPEN,KEYWORD_CLOSE};
}
