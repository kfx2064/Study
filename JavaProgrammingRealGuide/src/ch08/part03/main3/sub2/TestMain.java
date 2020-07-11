package ch08.part03.main3.sub2;

import java.io.File;

public class TestMain {

    public static void scan(File file) {
        if (file == null || file.exists() == false) return;

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    scan(f);
                }
            }
        } else {
            String isFile = (file.isFile() == true ? "파일" : "폴더");
            String name = file.getName();
            String path = file.getAbsolutePath();
            System.out.println(isFile + "\t" + name + "\t" + path);
        }
    }

    public static void main(String[] args) {

        String rootPath = "d://forGit";

        File file = new File(rootPath);

        scan(file);

    }

}
