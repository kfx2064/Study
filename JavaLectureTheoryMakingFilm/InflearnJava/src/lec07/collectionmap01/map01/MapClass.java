package lec07.collectionmap01.map01;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapClass {
	
	public static void main(String[] args) {
		
		Map<String, Object> sampleMap = new HashMap<String, Object>();
		
		sampleMap.put("°úÀÏ", "¹Ù³ª³ª");
		sampleMap.put("°î¹°", "½Ò");
		sampleMap.put("°ß°ú", "È£µÎ");
		sampleMap.put("Ã¤¼Ò", "Åä¸¶Åä");
		sampleMap.put("¿ìÀ°", "Åä½Ã»ì");
		sampleMap.put("µ·À°", "»ï°ã»ì");
		sampleMap.put("°èÀ°", "´Ù¸®»ì");
		
		System.out.println(sampleMap.toString());
		
		Object chicken = sampleMap.get("°èÀ°");
		System.out.println(chicken);
		
		boolean isChicken = sampleMap.containsKey("°èÀ°");
		boolean isFreshLeg = sampleMap.containsValue("´Ù¸®»ì");
		
		System.out.println("isChicken : " + isChicken);
		System.out.println("isFreshLeg : " + isFreshLeg);
		
		Set<Map.Entry<String, Object>> entries = sampleMap.entrySet();
		Set<String> keySetstrings = sampleMap.keySet();
		boolean isEmpty = sampleMap.isEmpty();
		Collection<Object> values = sampleMap.values();
		int size = sampleMap.size();
		
		System.out.println("entries : " + entries);
		System.out.println("keySetstrings : " + keySetstrings);
		System.out.println("isEmpty : " + isEmpty);
		System.out.println("values : " + values);
		System.out.println("size : " + size);
		
		System.out.println("============================================");
		
		Map<String, Object> copyMap = new HashMap<String, Object>();
		boolean empty = copyMap.isEmpty();
		
		System.out.println("copyMap is empty : " + empty);
		
		copyMap.putAll(sampleMap);
		boolean equals = sampleMap.equals(copyMap);
		
		System.out.println("°°Àº°¡ : " + equals);
	}

}
