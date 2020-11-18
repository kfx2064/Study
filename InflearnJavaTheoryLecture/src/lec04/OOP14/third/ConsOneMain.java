package lec04.OOP14.third;

public class ConsOneMain {

    public static void main(String[] args) {

        ConsOne consOne = new ConsOne("intel", "nvd");
        ConsOne consTwo = new ConsOne(consOne);

        System.out.println(consOne.cpuName);
        System.out.println(consOne.gpuName);
        System.out.println("===============");
        System.out.println(consTwo.cpuName);
        System.out.println(consTwo.gpuName);

        System.out.println("=================");
        System.out.println();
        System.out.println();

        consTwo.cpuName = "amd";
        consTwo.gpuName = "radeon";

        System.out.println(consOne.cpuName);
        System.out.println(consOne.gpuName);
        System.out.println("=================");
        System.out.println(consTwo.cpuName);
        System.out.println(consTwo.gpuName);

    }

}
