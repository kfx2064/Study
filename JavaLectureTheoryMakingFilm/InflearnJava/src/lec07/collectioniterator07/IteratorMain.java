package lec07.collectioniterator07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class IteratorMain {
	
	public static void main(String[] args) {
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("1", "모바일사업부");
		dataMap.put("2", "가전사업부");
		dataMap.put("3", "메모리반도체사업부");
		dataMap.put("4", "시스템반도체사업부");
		dataMap.put("5", "자동차전자장비사업부");
		
		System.out.println(dataMap);
		
		Set<Map.Entry<String, Object>> entrySetData = dataMap.entrySet();
		Iterator<Map.Entry< String, Object>> iteratorData = entrySetData.iterator();
		
		while (iteratorData.hasNext()) {
			Map.Entry<String, Object> nextData = iteratorData.next();
			System.out.println("키 : " + nextData.getKey() + ", [[[]]] 값 : " + nextData.getValue());
		}
		
		List dataList = new ArrayList();
		dataList.add("수원공장");
		dataList.add("파주공장");
		dataList.add("천안공장");
		dataList.add("울산공장");
		dataList.add("창원공장");
		
		System.out.println(dataList);
		
		ListIterator listIterator = dataList.listIterator();
		
		while (listIterator.hasNext()) {
			Object next = listIterator.next();
			System.out.println("값 추출 : " + next);
		}
		
	}

}
