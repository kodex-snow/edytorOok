package kot.kotsnow.ookEditor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SyntaxHighlighter {

	private StringBuilder text;

	private String openTagStyle="<p style=\"color:red\">";
	private String closeTagStyle="</p>";

	private Matcher matcher;
	private Pattern pattern;

	private final String KEYWORD_REGEX = "((Ook)[/!/.] (Ook)[/!/./?])|((Ook)[/?] (Ook)[/!/.])";

	public SyntaxHighlighter(){
		text= new StringBuilder();
		pattern = Pattern.compile(KEYWORD_REGEX);
	}

	public String highlight(String textFromEditor){

		text = new StringBuilder(textFromEditor);
		deleteOpenTags();
		deleteCloseTags();
		colorWords();

		return text.toString();
	}

	private void colorWords(){

		matcher = pattern.matcher(text);
		int position=0;
		while(position<text.length()){
			try{
			matcher.find(position);
			text.insert(matcher.start(),openTagStyle);
			text.insert(matcher.end()+openTagStyle.length(), closeTagStyle);
			position=matcher.end()+closeTagStyle.length()+openTagStyle.length();
			} catch(Exception e){
				position++;
			}

		}


	}

	private void deleteOpenTags(){

		int index=text.indexOf(openTagStyle);

		while(index!=-1){
			text.delete(index, index+openTagStyle.length());
			index=text.indexOf(openTagStyle);
		};

	}

	private void deleteCloseTags(){

		int index=text.indexOf(closeTagStyle);

		while(index!=-1){
			text.delete(index, index+closeTagStyle.length());
			index=text.indexOf(closeTagStyle);
		};

	}


	public static void main(String[] args){

	SyntaxHighlighter h = new SyntaxHighlighter();
	System.out.println(h.highlight("Ook! Ook! dfdgd Ook? Ook.?"));
	System.out.println(h.pattern.toString());
	}

}
