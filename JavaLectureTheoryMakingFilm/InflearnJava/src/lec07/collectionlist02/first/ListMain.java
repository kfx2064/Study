package lec07.collectionlist02.first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
	
	public static void main(String[] args) {
		
		List aList = new ArrayList();
		List bList = new LinkedList();
		
		aList.add(1);
		aList.add("굿잡");
		System.out.println(aList.toString());
		
		List<String> cList = new ArrayList<>();
		cList.add("한국");
		cList.add("미국");
		cList.add("중국");
		cList.add("러시아");
		cList.add("일본");
		System.out.println(cList.toString());
		
		List<Integer> dList = new LinkedList<>();
		dList.add(5);
		dList.add(3);
		dList.add(1);
		dList.add(2);
		dList.add(4);
		System.out.println(dList.toString());
		
	}

}
