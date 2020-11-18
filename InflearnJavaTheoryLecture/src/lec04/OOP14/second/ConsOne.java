package lec04.OOP14.second;

public class ConsOne {

    public String cpuName;
    public String gpuName;

    ConsOne() {
        System.out.println("기본 생성자가 실행되었습니다.");
    }

    ConsOne(String cpuName, String gpuName) {
        System.out.println("파라미터가 있는 생성자");
    }

}
