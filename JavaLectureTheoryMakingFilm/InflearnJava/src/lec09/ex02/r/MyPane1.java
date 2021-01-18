package lec09.ex02.r;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class MyPane1 extends Pane {
	
	public MyPane1() {
		
		Text text = new Text("메인화면1");
		text.relocate(10, 10);
		getChildren().add(text);
		
	}

}
