package lec04.OOP14.third;

public class ConsOne {

    public String cpuName;
    public String gpuName;

    ConsOne() {

    }

    ConsOne(ConsOne consOne) {
        this.cpuName = consOne.cpuName;
        this.gpuName = consOne.gpuName;
    }

    ConsOne(String cpuName, String gpuName) {
        this.cpuName = cpuName;
        this.gpuName = gpuName;
    }

}
