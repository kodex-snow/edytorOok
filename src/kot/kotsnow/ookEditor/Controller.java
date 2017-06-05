package kot.kotsnow.ookEditor;

import java.io.File;
import java.io.IOException;

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
	private MenuItem save;
	@FXML
	private MenuItem exit;
	@FXML
	private MenuItem settings;

	@FXML
	private AnchorPane aPane;

	private SyntaxHighlighter syntaxHighlighter;
	private FileOperationHandler fileOperationHandler;
	private FileChooser chooser;
	private HtmlTagHandler htmlTagHandler;


	public Controller(){

		syntaxHighlighter = new SyntaxHighlighter();
		fileOperationHandler = new FileOperationHandler();
		chooser = new FileChooser();
		htmlTagHandler = new HtmlTagHandler();
	}

	public void initialize(){

		try {

			htmlEditor.lookup(".top-toolbar").setManaged(false);
		    htmlEditor.lookup(".top-toolbar").setVisible(false);

		    htmlEditor.lookup(".bottom-toolbar").setManaged(false);
		    htmlEditor.lookup(".bottom-toolbar").setVisible(false);


		} catch (Exception e) {

			e.printStackTrace();
		}
	}



	public void open(){

	    chooser.setTitle("Open File");
	    try{
	    	File file = chooser.showOpenDialog(getWindow());
	    htmlEditor.setHtmlText(fileOperationHandler.open(file));
	    checkText();
	    } catch(Exception e){
	    	e.printStackTrace();
	    }
	}


	public void save(){

		try{
		chooser.setTitle("Open File");
	    File file = chooser.showSaveDialog(getWindow());
	    fileOperationHandler.save(htmlTagHandler.deleteAllHtmlTags(htmlEditor.getHtmlText()), file);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void exit(){
		System.exit(0);
	}

	public void displaySettings() throws IOException{
		SettingsController settingsController = new SettingsController();
		settingsController.display();
	}
	public void checkText(){
		htmlEditor.setHtmlText(syntaxHighlighter.highlight(htmlEditor.getHtmlText()));

	}
	private Window getWindow (){
		return htmlEditor.getScene().getWindow();

	}
}
