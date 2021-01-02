package lec07.collectionset03.first;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.sound.sampled.BooleanControl;

public class SetMain {
	
	public static void main(String[] args) {
		
		Set<Integer> setInt = new HashSet<Integer>();
		setInt.add(1);
		setInt.add(2);
		setInt.add(3);
		setInt.add(4);
		setInt.add(5);
		
		Set<String> setString = new HashSet<String>();
		setString.add("한국");
		setString.add("중국");
		setString.add("미국");
		
		System.out.println("데이터를 출력합니다.");
		System.out.println(setInt.toString());
		System.out.println(setString.toString());
		
		int intSize = setInt.size();
		int strSize = setString.size();
		
		System.out.println("int 크기 : " + intSize);
		System.out.println("String 크기 : " + strSize);
		
		System.out.println(setInt.toString());
		boolean remove = setInt.remove(2);
		System.out.println("remove : " + remove);
		System.out.println(setInt.toString());
		
		System.out.println("지우기 전");
		System.out.println(setInt.toString());
		setInt.clear();
		System.out.println("지운 후");
		System.out.println(setInt.toString());
		
		setInt.add(1);
		setInt.add(2);
		setInt.add(3);
		setInt.add(4);
		setInt.add(5);
		
		boolean contains = setInt.contains(1);
		System.out.println("contains : " + contains);
		
		Set duplicateSet = new HashSet();
		duplicateSet.addAll(setInt);
		System.out.println("일괄등록입니다.");
		System.out.println(setInt.toString());
		System.out.println(duplicateSet.toString());
		
		boolean boolContainsAll = setInt.containsAll(duplicateSet);
		System.out.println("모두 포함하는가");
		System.out.println(boolContainsAll);
		
		Set setRemove = new HashSet();
		setRemove.add(1);
		setRemove.add(2);
		setRemove.add(3);
		
		System.out.println("\n\n\n");
		
		System.out.println("데이터를 비교합니다.");
		System.out.println(setInt.toString());
		System.out.println(setRemove.toString());
		System.out.println("setInt에 removeAll을 실행합니다.");
		boolean isRemoveAll = setInt.removeAll(setRemove);
		System.out.println("removeAll이 실행되었습니까? : " + isRemoveAll);
		System.out.println(setInt.toString());
		System.out.println(setRemove.toString());
		
		System.out.println("\n\n\n");
		
		setInt = new HashSet<Integer>();
		setInt.add(1);
		setInt.add(2);
		setInt.add(3);
		setInt.add(4);
		setInt.add(5);
		
		System.out.println("retainAll 전에 데이터 확인");
		System.out.println(setInt.toString());
		System.out.println(setRemove.toString());
		
		setInt.retainAll(setRemove);
		System.out.println("setInt를 확인합니다.");
		System.out.println(setInt.toString());
		
		System.out.println("\n\n\n");
		
		System.out.println(setString.toString());
		
		System.out.println("iterator가 작동합니다.");
		Iterator<String> iterator = setString.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
		
	}

}
