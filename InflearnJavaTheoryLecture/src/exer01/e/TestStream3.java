package exer01.e;

import java.util.ArrayList;
import java.util.List;

public class TestStream3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("한국");
        list.add("러시아");
        list.add("미국");
        list.add("중국");
        list.add("프랑스");
        list.add("일본");

        list.stream().sorted().forEach(System.out::println);
        
    }
    
}
