package kot.kotsnow.ookEditor;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SettingsController {

	@FXML
	GridPane settingsPane;

	@FXML
	ColorPicker fontColor;

	@FXML
	ColorPicker fontColorKeywords;

	@FXML
	ColorPicker backgroundColor;

	Style style;

	public SettingsController() {
		style = new Style();
	}

	public void display() throws IOException{

		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		Parent root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
		window.setScene(new Scene(root));
		root.getStylesheets().add(EditorGUI.class.getResource("OokEditor.css").toExternalForm());
		window.show();

	}

	public void setFontColor(){
		Color c =fontColor.getValue();
		style.setFontColor(round(c.getRed()),round(c.getGreen()), round(c.getBlue()));
		System.out.println(c.toString());

	}

	private double round(double number){

		number = number*255;
		return  number;
	}

}
