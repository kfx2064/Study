package ch07.part02.main7;

public class SingletonType {

    // 동일타입 객체 반환
    private static SingletonType type = null;

    // private 생성자
    private SingletonType() {

    }

    public static SingletonType getInstance() {
        // null 일 때만 객체 생성, 반환.
        if (type == null) {
            type = new SingletonType(); // 객체 생성
        }

        return type;
    }

}
