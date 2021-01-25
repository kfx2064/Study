package lec09.ex03.c;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class MainView extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(300, 150);
		
		ComboBox<CodeVo> c1 = new ComboBox<CodeVo>();
		c1.setPrefSize(150, 20);
		c1.relocate(10, 10);
		pane.getChildren().add(c1);
		
		CodeVo v1 = new CodeVo("1", "상");
		CodeVo v2 = new CodeVo("2", "중");
		CodeVo v3 = new CodeVo("3", "하");
		c1.getItems().setAll(v1, v2, v3);
		
		c1.setConverter(new StringConverter<CodeVo>() {
			
			@Override
			public String toString(CodeVo object) {
				if (object == null) {
					return null;	
				}
				return object.getCodeName();
			}
			
			@Override
			public CodeVo fromString(String arg0) {
				return null;
			}
		});
		
		c1.getSelectionModel().select(2);
		
		c1.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<CodeVo>() {
				@Override
				public void changed(ObservableValue<? extends CodeVo> observable, CodeVo oldValue, CodeVo newValue) {
					System.out.println("[자료선택] = " + newValue);
				}
			}
		);
		
		c1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				System.out.println("[자료선택인덱스] = " + newValue);
			}
		});
		
		stage.setScene(new Scene(pane));
		stage.show();
		
	}

}
