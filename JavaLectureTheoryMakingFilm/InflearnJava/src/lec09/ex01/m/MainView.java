package lec09.ex01.m;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainView extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane pane = new BorderPane();
		
		TextField textField = new TextField();
		pane.setBottom(textField);
		textField.setText("CSS설정 : 글씨크기 14pt, 색상 : 빨강");
		
		textField.setStyle("-fx-font-size:14pt; -fx-text-fill:red;");
		
		pane.setStyle("-fx-background-color:pink;");
		
		stage.setScene(new Scene(pane, 400, 100));
		stage.show();
		
	}

}
