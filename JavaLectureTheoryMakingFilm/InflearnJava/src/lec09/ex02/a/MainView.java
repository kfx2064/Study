package lec09.ex02.a;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainView extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		Pane pane = new Pane();
		
		Scene scene = new Scene(pane);
		
		stage.setScene(scene);
		
		stage.show();
		
	}
	

}
