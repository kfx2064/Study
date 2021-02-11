package lec13.StringLec.lecture02;

public class StringBuilderStringBuffer {
	
	public static void main(String[] args) {
		
		StringBuilder sbd01 = new StringBuilder("Hello, world.");
		StringBuffer sbf01 = new StringBuffer("Nice day.");
		
		System.out.println(sbd01);
		System.out.println(sbf01);
		
		System.out.println("==================================");
		System.out.println(sbd01.toString());
		System.out.println(sbf01.toString());
		
		System.out.println("==================================");
		String strBD01 = sbd01.toString();
		String strBF01 = sbf01.toString();
		System.out.println(strBD01);
		System.out.println(strBF01);
		
		System.out.println("==================================");
		StringBuilder sbEasy = new StringBuilder("Easy ").append("day ")
														.append("is ")
														.append("yesterday.");
		System.out.println(sbEasy.toString());
		StringBuffer sfEasy = new StringBuffer("There ").append("is ")		
														.append("no ")
														.append("easy ")
														.append("day.");
		System.out.println(sfEasy.toString());
		
		System.out.println("==================================");
		StringBuilder sbCapacity = new StringBuilder("Hello");
		StringBuffer sfCapacity = new StringBuffer("Hello");
		int resultSbCapacity = sbCapacity.capacity();
		int resultSfCapacity = sfCapacity.capacity();
		System.out.println("builder capacity " + resultSbCapacity);
		System.out.println("buffer capacity " + resultSfCapacity);
		
		System.out.println("==================================");
		StringBuilder sba = new StringBuilder("a");
		StringBuffer sfa = new StringBuffer("a");
		System.out.println(sba.capacity());
		System.out.println(sfa.capacity());
		StringBuilder sbb = new StringBuilder("ab");
		StringBuffer sfb = new StringBuffer("ab");
		System.out.println(sbb.capacity());
		System.out.println(sfb.capacity());
		
		System.out.println("==================================");
		StringBuilder sbInsert = new StringBuilder("가나다라");
		StringBuffer sfInsert = new StringBuffer("가나다라");
		sbInsert.insert(1, "a");
		sfInsert.insert(1, "a");
		System.out.println(sbInsert.toString());
		System.out.println(sfInsert.toString());
		
		System.out.println("==================================");
		StringBuilder sbDelete = new StringBuilder("Hello");
		StringBuffer sfDelete = new StringBuffer("Hello");
		StringBuilder sbResultDelete = sbDelete.delete(0, 1);
		StringBuffer sfResultDelete = sfDelete.delete(0, 1);
		System.out.println(sbResultDelete.toString());
		System.out.println(sfResultDelete.toString());
		
		System.out.println("==================================");
		StringBuilder sbReverse = new StringBuilder("Alpha");
		StringBuffer sfReverse = new StringBuffer("Alpha");
		System.out.println(sbReverse.reverse().toString());
		System.out.println(sfReverse.reverse().toString());
		
		System.out.println("==================================");
		StringBuilder sbReplace = new StringBuilder("Hello, world!");
		StringBuffer sfReplace = new StringBuffer("Hello, world!");
		StringBuilder sbResultReplace = sbReplace.replace(0, 5, "Good");
		StringBuffer sfResultReplace = sfReplace.replace(0, 5, "Good");
		System.out.println(sbResultReplace.toString());
		System.out.println(sfResultReplace.toString());
		
		System.out.println("==================================");
		StringBuilder sbLength = new StringBuilder("Hello");
		StringBuffer sfLength = new StringBuffer("Hello");
		System.out.println("Length입니다.");
		System.out.println(sbLength.length());
		System.out.println(sfLength.length());
		
		System.out.println("==================================");
		StringBuilder sbSubstring = new StringBuilder("Hello");
		StringBuffer sfSubstring = new StringBuffer("Hello");
		
		String sbSubsResult = sbSubstring.substring(2);
		String sfSubsResult = sfSubstring.substring(2, 5);
		System.out.println(sbSubsResult);
		System.out.println(sfSubsResult);
		
	}

}
