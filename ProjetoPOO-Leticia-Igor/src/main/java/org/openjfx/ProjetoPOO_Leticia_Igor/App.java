package org.openjfx.ProjetoPOO_Leticia_Igor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
		
		Scene scene = new Scene(root);
//		scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
		
		primaryStage.setTitle("ProjetoPOO");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}