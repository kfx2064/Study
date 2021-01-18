package lec09.ex02.g;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class MainView extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		stage.setTitle("title");
		
		GridPane root = new GridPane();
		
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		
		btn1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		btn2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		btn3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		btn4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		btn5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(30);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(70);
		root.getColumnConstraints().addAll(col1, col2);
		
		RowConstraints row1 = new RowConstraints();
		row1.setPercentHeight(20);
		RowConstraints row2 = new RowConstraints();
		row2.setPercentHeight(30);
		RowConstraints row3 = new RowConstraints();
		row3.setPercentHeight(50);
		root.getRowConstraints().addAll(row1, row2, row3);
		
		root.add(btn1, 0, 0);
		root.add(btn2, 0, 1);
		root.add(btn3, 1, 0);
		root.add(btn4, 1, 1);
		root.add(btn5, 0, 2, 2, 1);
		
		Scene scene = new Scene(root, 300, 150);
		stage.setScene(scene);
		stage.show();
		
	}

}
