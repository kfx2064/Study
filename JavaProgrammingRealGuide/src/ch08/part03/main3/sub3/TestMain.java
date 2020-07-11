package ch08.part03.main3.sub3;

import ch08.part02.main5.sub2.ArrayListUtil;

import java.io.File;
import java.util.ArrayList;

public class TestMain {

    public static void scan(File file, ArrayList<File> fileList) {

        if (file == null || file.exists() == false) return;

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    scan(f, fileList);
                }
            }
        } else {
            String isFile = (file.isFile() == true ? "파일" : "폴더");
            String name = file.getName();
            String path = file.getAbsolutePath();

            fileList.add(file);
        }
    }

    public static void main(String[] args) {

        String rootPath = "d://forGitSecret";

        File file = new File(rootPath);

        ArrayList<File> list = new ArrayList<File>();

        scan(file, list);

        for (File f : list) {
            String isFile = (file.isFile() == true ? "파일" : "폴더");
            String name = file.getName();
            String path = file.getAbsolutePath();
            System.out.println(f.isFile() + "\t" + name + "\t" + path);
        }

    }

}
