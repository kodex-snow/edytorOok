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

	private String inputContent ="";

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


	public String getInputContent(){
		return inputContent;

	}

	public void setInputContent(String inputContent){
		this.inputContent=inputContent;
	}

	public Window getWindow (){
		return htmlEditor.getScene().getWindow();

	}

	public void open(){
		FileChooser chooser = new FileChooser();
	    chooser.setTitle("Open File");
	    chooser.showOpenDialog(getWindow());

	}


	public void save(){

	}

	public void checkText(){
		htmlEditor.setHtmlText("<b>Lolololo!!!!!</b>");
	}

}
