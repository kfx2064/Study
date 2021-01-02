package lec05.generics.fifth;

public class Main {
	
	public static void main(String[] args) {
		
		ChildWildCard<WildCard<String>> childWildCardStr = new ChildWildCard<WildCard<String>>();
		ChildWildCard<WildCard<Integer>> childWildCardInt = new ChildWildCard<WildCard<Integer>>();
		
	}

}
