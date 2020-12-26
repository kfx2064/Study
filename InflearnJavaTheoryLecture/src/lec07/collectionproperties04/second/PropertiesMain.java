package lec07.collectionproperties04.second;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * properties 파일에서 값을 읽어오는 것을 실습하겠습니다.
 * 일단 .properties 파일을 만듭니다.
 *
 * 그 후 코딩을 진행합니다.
 */
public class PropertiesMain {

    public static void main(String[] args) {

        Properties properties = new Properties();
        FileInputStream fis = null;

        try {

            fis = new FileInputStream("src/lec07/collectionproperties04/second/conf.properties");

            properties.load(fis);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(properties);

        /**
         * 데이터를 모두 출력해 보았습니다.
         *
         * 이번엔 데이터를 쓰는 것을 해보도록 하겠습니다.
         */

        properties = new Properties();
        properties.put("a", "windows");
        properties.put("b", "android");
        properties.put("c", "iOS");
        properties.put("d", "unix");
        properties.put("e", "linux");

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("src/lec07/collectionproperties04/second/conf.properties");

            properties.store(fos, "setting.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /**
         * 이번에는 자바 시스템의 설정 properties를 조회하는 것을 해보도록 하겠습니다.
         */
        Properties properties1 = System.getProperties();
        for (Object o : properties1.keySet()) {
            Object o1 = properties1.get(o);
            System.out.println("시스템 설정값 : " + o1);
        }

        /**
         * Properties의 강의는 여기서 마치겠습니다.
         *
         * 감사합니다.
         */

    }

}
