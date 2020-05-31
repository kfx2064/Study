package ex01;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {

    public static void main(String[] args) {
        Stream<StudentEx1> studentStream = Stream.of(
            new StudentEx1("이자바", 3, 300),
            new StudentEx1("김자바", 1, 200),
            new StudentEx1("안자바", 2, 100),
            new StudentEx1("박자바", 2, 150),
            new StudentEx1("소자바", 1, 200),
            new StudentEx1("나자바", 3, 290),
            new StudentEx1("감자바", 3, 180)
        );

        studentStream.sorted(Comparator.comparing(StudentEx1::getBan)
                        .thenComparing(Comparator.naturalOrder()))
                        .forEach(System.out::println);
    }

}

class StudentEx1 implements Comparable<StudentEx1> {
    String name;
    int ban;
    int totalScore;

    StudentEx1(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName() {
        return name;
    }

    int getBan() {
        return ban;
    }

    int getTotalScore() {
        return  totalScore;
    }

    public int compareTo(StudentEx1 s) {
        return s.totalScore - this.totalScore;
    }
}
