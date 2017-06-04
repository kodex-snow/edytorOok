package kot.kotsnow.ookEditor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SyntaxHighlighter {

	StringBuilder text;
	int position=0;
	char characterAtPosition=' ';

	Pattern pattern;
	Matcher matcher;

	public String colorSyntax(String textFromEditor){

		text = new StringBuilder(textFromEditor);

		return text.toString();
	}


}
