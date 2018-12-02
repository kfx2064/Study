package Chapter10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryEx1 {
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("°úÀÏ", "¹Ù³ª³ª");
		map.put("°î¹°", "½Ò");
		map.put("°ß°ú", "È£µÎ");
		map.put("Ã¤¼Ò", "Åä¸¶Åä");
		map.put("¿ìÀ°", "Åä½Ã»ì");
		map.put("µ·À°", "»ï°ã»ì");
		map.put("°èÀ°", "´Ù¸®»ì");
		
		Set<String> iterSet1 = map.keySet();
		Iterator<String> iterator1 = iterSet1.iterator();
		while(iterator1.hasNext()) {
			String key = iterator1.next();
			System.out.println("Å° : " + key + ", ¹ë·ù : " + map.get(key));
		} 
		
		Iterator<String> iterator2 = map.keySet().iterator();		
		System.out.println("\niterator2");
		while(iterator2.hasNext()) {
			String key = iterator2.next();
			System.out.println("Å° : " + key + ", ¹ë·ù : " + map.get(key));
		}
		
		System.out.println("\nMap.Entry");
		for(Map.Entry<String, Object> entry1 : map.entrySet()) {
			System.out.println("Å° : " + entry1.getKey() + ", ¹ë·ù : " + entry1.getValue());
		}
		
		System.out.println("\nKeySet");
		for(String key : map.keySet()) {
			System.out.println("Å° : " + key + ", ¹ë·ù : " + map.get(key));
		}
		
	}

}
