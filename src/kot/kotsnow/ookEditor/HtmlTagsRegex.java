package kot.kotsnow.ookEditor;

public interface HtmlTagsRegex {

	String TAG_OPEN_REGEX="<[^>]*>";
	String TAG_CLOSE_REGEX="</[^>]*>";

	String KEYWORD_OPEN_REGEX="<span[^>]*>";
	String KEYWORD_CLOSE_REGEX="</span>";

	String[] HTMLTAGS_REGEX ={TAG_OPEN_REGEX, TAG_CLOSE_REGEX};
}
