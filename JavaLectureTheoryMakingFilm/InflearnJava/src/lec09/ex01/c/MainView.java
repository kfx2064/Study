package lec09.ex01.c;

import java.util.Date;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainView extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		stage.setTitle("메인화면");
		
		Pane root = new Pane();
		
		Button btn = new Button("버튼");
		btn.setPrefSize(100, 30);
		btn.setLayoutX(10);
		btn.setLayoutX(10);
		
		TextField textField = new TextField();
		textField.setPrefSize(200, 30);
		textField.setLayoutX(10);
		textField.setLayoutY(50);
		
		root.getChildren().addAll(btn, textField);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Date time = new Date();
				textField.setText(time.toString());
			}
		});
		
		Scene scene = new Scene(root, 300, 200);
		stage.setScene(scene);
		
		stage.show();
		
	}

}
