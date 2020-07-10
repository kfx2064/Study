package ch08.part03.main3.sub1;

import java.io.File;

public class TestMain2 {

    public static void main(String[] args) {

        String path = "d://";

        File file = new File(path);

        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                String name = f.getName();
                String isFile = (file.isFile() == true ? "파일" : "폴더");
                System.out.println(isFile + "\t" + name);
            }
        }

    }

}
