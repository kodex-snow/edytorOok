package kot.kotsnow.ookEditor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTagHandler implements HtmlTagsRegex {

	private Pattern pattern;
	private Matcher matcher;

	public HtmlTagHandler(){

	}

	public String addEditable(String text){
		text = text.replaceAll("<head> <\\head>", "<head> <script type=\"text/javascript\" src=\"handleCaretPosition.js\"> <\\head>");
		return text.replaceAll("<body contenteditable=\"true\">","<body contenteditable=\"true\" id=\"editableContent");
	}

	public String deleteAllHtmlTags(String textToDeleteTags){

		StringBuilder text = new StringBuilder(textToDeleteTags);
		text = deleteKeywordTags(text);
		for(int tag =0;tag<HTMLTAGS.length;tag++){
			deleteTag(text, HTMLTAGS[tag]);
		}
		return text.toString();
	}



	public StringBuilder deleteKeywordTags(StringBuilder text){
		text = deleteTag(text, KEYWORD_OPEN);
		text = deleteTag(text, KEYWORD_CLOSE);
		return text;
	}

	private StringBuilder deleteTag(StringBuilder text, String tag){

		pattern=Pattern.compile(tag);
		matcher = pattern.matcher(text);

		while(matcher.find()){
			text.delete(matcher.start(), matcher.end());
			matcher = pattern.matcher(text);
		}

		return text;
	}
}
