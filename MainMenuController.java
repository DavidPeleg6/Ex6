package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/*
 * A controller for the main menu.
 */
public class MainMenuController {
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	/*
	 * Loads the main game.
	 * @param event - the button press event.
	 */
	public void button1(ActionEvent event) {
		GridPane options_root;
		try {
			
			
			options_root = (GridPane)FXMLLoader.load(getClass().getResource("OptionsMenu.fxml"));
			Scene options_scene = new Scene(options_root,600,400);
			//the thing above should be the game scene
			
			
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(options_scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * Loads the options menu.
	 * @param event - the button press event.
	 */
	public void button2(ActionEvent event) {
		GridPane options_root;
		try {
			options_root = (GridPane)FXMLLoader.load(getClass().getResource("OptionsMenu.fxml"));
			Scene options_scene = new Scene(options_root,600,400);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(options_scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * Closes the software.
	 * @param event - the button press event.
	 */
	public void button3(ActionEvent event) {
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.close();
	}
}
