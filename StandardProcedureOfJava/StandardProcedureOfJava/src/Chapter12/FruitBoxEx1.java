package Chapter12;

import java.util.ArrayList;

class Fruit { public String toString() { return "Fruit"; } }
class Apple extends Fruit { public String toString() { return "Apple"; } }
class Grape extends Fruit { public String toString() { return "Grape"; } }
class Toy { public String toString() { return "Toy"; } }

public class FruitBoxEx1 {
	
	public static void main(String[] args) {
		
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		//Box<Grape> grapeBox = new Box<Apple>();	// 에러. 타입 불일치
		
		// 위의 클래스에서 상속관계를 유심히 보고 왜 에러가 나는지 찾아보면 된다.
		// 조상, 자손 관계가 아닌 것들인데 다형성을 통한 사용을 하려 하면 에러가 나는 것으로 판단된다.
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		//appleBox.add(new Toy());	// 에러. Box<Apple>에는 Apple만 담을 수 있음
		
		toyBox.add(new Toy());
		//toyBox.add(new Apple());	// 에러. Box<Toy>에는 Apple을 담을 수 없음.
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		
	}

}

// 지네릭으로 T가 선언되어 있다. 
// 실제 인스턴스 생성 시 필요한 것으로 타입을 지정해 줄 수 있다.
class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}
