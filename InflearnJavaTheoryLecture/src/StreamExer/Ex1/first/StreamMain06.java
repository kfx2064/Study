package StreamExer.Ex1.first;

import java.util.stream.Stream;

public class StreamMain06 {

    public static void main(String[] args) {

        /**
         * 스트림의 개수를 구합니다.
         */

        long getCountNumber = Stream.of(1, 2, 3, 4, 5).count();
        System.out.println("스트림의 총 개수 : " + getCountNumber);

    }
    
}
