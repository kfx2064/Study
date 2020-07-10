package ch08.part03.main3.sub1;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class TestMain1 {

    public static void main(String[] args) {

        String path = "d://good.txt";

        File file = new File(path);

        String absolutePath = file.getAbsolutePath();
        System.out.println("absolutePath = " + absolutePath);

        String name = file.getName();
        System.out.println("name = " + name);

        boolean exists = file.exists();
        System.out.println("exists = " + exists);

        boolean isFile = file.isFile();
        System.out.println("isFile = " + isFile);

        boolean isDirectory = file.isDirectory();
        System.out.println("isDirectory = " + isDirectory);

    }

}
