package lec09.ex03.b;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainView extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		AnchorPane root = new AnchorPane();
		
		TextField textField = new TextField();
		textField.setLayoutX(10);
		textField.setLayoutY(10);
		textField.setPrefSize(200, 30);
		
		Button btn = new Button("버튼");
		btn.setLayoutX(10);
		btn.setLayoutY(50);
		btn.setPrefSize(100, 30);
		
		root.getChildren().addAll(textField, btn);
		
		stage.setScene(new Scene(root, 300, 300));
		stage.show();
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				textField.requestFocus();
				textField.selectAll();
				String text = textField.getSelectedText();
				System.out.println("선택한 텍스트 : " + text);
			}
		});
		
	}

}
