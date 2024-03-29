package lec09.ex02.s;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainView extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane root = new BorderPane();
		
		Pane centerPane = new AnchorPane();
		root.setCenter(centerPane);
		
		TextField tf = new TextField();
		tf.setPrefSize(200, 30);
		tf.relocate(10, 30);
		
		Button btn1 = new Button("버튼");
		btn1.setPrefSize(100, 30);
		btn1.relocate(110, 70);
		
		centerPane.getChildren().addAll(tf, btn1);
		
		Scene scene = new Scene(root, 220, 150);
		stage.setScene(scene);
		stage.show();
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				printLocationInfo(tf, 10, 10);
				printLocationInfo(btn1, 0, 0);				
			}
		});
		
	}
	
	public static void printLocationInfo(Node node, double x, double y) {
		Point2D info1 = node.localToParent(x, y);
		Point2D info2 = node.localToScene(x, y);
		Point2D info3 = node.localToScreen(x, y);
		Point2D info4 = node.parentToLocal(x, y);
		Point2D info5 = node.sceneToLocal(x, y);
		Point2D info6 = node.screenToLocal(x, y);
		System.out.println("Node [" + node.getClass().getSimpleName()
				+ "], 상대좌표 x [" + x + "], y [" + y + "]");
		System.out.println("\t localToParent : " + info1);
		System.out.println("\t localToScene : " + info2);
		System.out.println("\t localToScreen : " + info3);
		System.out.println("\t parentToLocal : " + info4);
		System.out.println("\t sceneToLocal : " + info5);
		System.out.println("\t screenToLocal : " + info6);
		
	}

}
