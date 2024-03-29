package ver2_lec05.collectionframework03.samplecode08.repository.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DataRepository {
	
	private static DataRepository instance = new DataRepository();
	
	public static DataRepository getInstance() {
		return instance;
	}
	
	public LinkedHashMap<String, Object> savedDataLkMap = null;
	public ArrayList<String> saveDataArrList = null;
	
	private DataRepository() {
		
		System.out.println("DataRepository 생성자");
		
		savedDataLkMap = new LinkedHashMap<String, Object>();
		saveDataArrList = new ArrayList<String>();
		
		savedDataLkMap.put("국가1", "한국");
		savedDataLkMap.put("국가2", "미국");
		savedDataLkMap.put("국가3", "중국");
		savedDataLkMap.put("국가4", "일본");
		savedDataLkMap.put("국가5", "러시아");
		
		saveDataArrList.add("전자");
		saveDataArrList.add("자동차");
		saveDataArrList.add("조선");
		saveDataArrList.add("IT");
		saveDataArrList.add("디스플레이");
		saveDataArrList.add("건설");
		saveDataArrList.add("에너지");
		
	}

}
