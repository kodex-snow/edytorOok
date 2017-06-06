package kot.kotsnow.ookEditor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SyntaxHighlighter {

	private StringBuilder text;

	private Matcher matcher;
	private Pattern pattern;

	private final String KEYWORD_REGEX = "((Ook)[/!/.] (Ook)[/!/./?])|((Ook)[/?] (Ook)[/!/.])";

	private Style style;
	private HtmlTagHandler htmlTagHandler;

	private static SyntaxHighlighter INSTANCE;


    public static SyntaxHighlighter getInstance(){
        if(INSTANCE==null)
            INSTANCE = new SyntaxHighlighter();
        return INSTANCE;
    }


	private SyntaxHighlighter(){

		text= new StringBuilder();
		pattern = Pattern.compile(KEYWORD_REGEX);
		htmlTagHandler = HtmlTagHandler.getInstance();
		style = Style.getInstance();


	}

	public String highlight(String textFromEditor){

		text = new StringBuilder(textFromEditor);

		text = htmlTagHandler.deleteKeywordTags(text);
		colorWords();

		return text.toString();
	}

	private void colorWords(){

		String openKeywordTag = style.getOpenTagKeyword();
		String closeKeywordTag = style.getCloseTagKeyword();
		int position=0;

		matcher = pattern.matcher(text);

		while(position<text.length()){
			try{

			if(matcher.find(position)){
				text.insert(matcher.start(),openKeywordTag);
				text.insert(matcher.end()+openKeywordTag.length(), closeKeywordTag);
				position=matcher.end()+closeKeywordTag.length()+openKeywordTag.length();
				matcher = pattern.matcher(text);
			} else{
				break;
			}

			} catch(Exception e){

				e.printStackTrace();
			}
		}
	}

}
