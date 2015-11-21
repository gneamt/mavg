package mavgeorge.mavgeorge;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstJavaFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	
	/*
	Button btn = new Button();	
	btn.setText("Butooon");
	btn.setOnAction(new EventHandler<ActionEvent>(){

		public void handle(ActionEvent event) {
			System.out.println("Hello World!");	
		}});
	
	StackPane root = new StackPane();
	root.getChildren().add(btn);
	primaryStage.setScene(new Scene(root, 500, 250));
	root.getStylesheets().add(FirstJavaFX.class.getResource("FirstJavaFX.css").toExternalForm());
	primaryStage.show();
	*/
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 640, 480);
		primaryStage.setScene(scene);
		//scene.getStylesheets().add(FirstJavaFX.class.getResource("FirstJavaFX.css").toExternalForm());
		scene.getStylesheets().add(getClass().getResource("FirstJavaFX.css").toExternalForm());
		primaryStage.show();	
		
	}

}
