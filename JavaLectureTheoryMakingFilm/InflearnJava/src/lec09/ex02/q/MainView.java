package lec09.ex02.q;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainView extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		Image image = new Image("file:src/lec09/ex02/q/book.png");
		stage.getIcons().add(image);
		
		stage.setTitle("타이틀");
		
		stage.setAlwaysOnTop(true);
		
		stage.setMaxWidth(200);
		stage.setMaxHeight(200);
		
		stage.show();
		
	}

}
