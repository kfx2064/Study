package lec04.OOP15.second;

public class Main {
	
	public static void main(String[] args) {
		
		Korea korea = new Korea();
		China china = new China();
		
		System.out.println(korea.species);
		System.out.println(korea.haveMust);
		System.out.println(korea.special);
		korea.showDefault();
		korea.mainEat();
		
		System.out.println("\n\n");
		
		System.out.println(china.species);
		System.out.println(china.haveMust);
		System.out.println(china.special);
		china.showDefault();
		china.mainEat();
		
	}

}
