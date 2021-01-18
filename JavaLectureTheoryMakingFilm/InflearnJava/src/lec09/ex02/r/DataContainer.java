package lec09.ex02.r;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.layout.Pane;

public class DataContainer {
	
	public static final Map<Class<? extends Pane>, Pane> paneMap = new HashMap<Class<? extends Pane>, Pane>();
	
	public static final void addPane(Pane pane) {
		if (pane == null) {
			return;
		}
		paneMap.put(pane.getClass(), pane);
	}
	
	public static final <T extends Pane> T getPane(Class<T> clazz) {
		return (T) paneMap.get(clazz);
	}

}
