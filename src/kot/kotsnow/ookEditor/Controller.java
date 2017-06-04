package kot.kotsnow.ookEditor;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.HTMLEditor;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class Controller
{
	@FXML
	private HTMLEditor htmlEditor;

	@FXML
	private MenuItem open;

	@FXML
	private AnchorPane aPane;

	private SyntaxHighlighter syntaxHighlighter;

	public Controller(){
		syntaxHighlighter = new SyntaxHighlighter();
	}

	public void initialize(){

		try {

			htmlEditor.lookup(".top-toolbar").setManaged(false);
		    htmlEditor.lookup(".top-toolbar").setVisible(false);

		    htmlEditor.lookup(".bottom-toolbar").setManaged(false);
		    htmlEditor.lookup(".bottom-toolbar").setVisible(false);


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public void open(){
		FileChooser chooser = new FileChooser();
	    chooser.setTitle("Open File");
	    chooser.showOpenDialog(getWindow());

	}


	public void save(){

	}

	public void checkText(){
		htmlEditor.setHtmlText(syntaxHighlighter.highlight(htmlEditor.getHtmlText()));

	}
	private Window getWindow (){
		return htmlEditor.getScene().getWindow();

	}
}
