package kot.kotsnow.ookEditor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SyntaxHighlighter {

	StringBuilder text;

	String openTagStyle="<p style=\"color:red\">";
	String closeTagStyle="</p\">";

	Pattern pattern;
	Matcher matcher;

	String keywordRegex = "Ook([\\!\\.]\\s+Ook[\\!\\?\\.])|([\\?]\\s+Ook[\\!\\.])";

	public SyntaxHighlighter(){
		pattern=Pattern.compile(keywordRegex);
	}

	public String highlight(String textFromEditor){

		text = new StringBuilder(textFromEditor);
		deleteOpenTags();
		deleteCloseTags();

		return text.toString();
	}

	private void colorWords(){
		matcher.find();

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


	public static void main(){

	}

}
