package ver2_lect05.fileIO05.training02;

import java.io.FileReader;

public class IOManyFunction08 {

    public static void main(String[] args) {

        FileReader fileReader = null;
        String path = String.valueOf("C:\\dev\\FileIO\\file.txt");

        /**
         * 위의 위치에 있는 파일을 읽어 들입니다.
         */

        try {

            fileReader = new FileReader(path);

            /**
             * 문자 단위로 파일을 읽어 들여 옵니다.
             */

            while (true) {
                int read = fileReader.read();
                if (read == -1) {
                    break;
                }
                System.out.print((char) read);
                /**
                 * 읽은 파일을 콘솔에 찍습니다.
                 */
            }

            /**
             * char 단위로 읽고 쓰는 FileReader와 FileWriter 중 FileReader를 써봤습니다.
             * 한 가지 차별점이 있습니다.
             * byte 단위로 읽었을 때는 문자가 깨졌죠.
             * 근데 char 단위로 읽었을 때는 문자가 깨지지 않았습니다.
             * 이것이 char 단위로 읽는 장점이기도 해요.
             *
             * 하지만 다시 한 번 말씀 드리자만 File IO는 잘 쓰지 않습니다.
             * file download나 upload 시에 쓰곤 하죠.
             *
             * 하지만 잘 안 쓴다고 해서 모르면 또 곤란해 지는 상황이 옵니다.
             * 말씀 드렸다시피 대부분의 API에 존재하는 기능들은
             * 개발자들의 필요성이 반영되어 만들어진 것이기 때문입니다.
             *
             * 그럼 이번 강의는 여기까지 하고 다음 강의에서 뵙겠습니다.
             */

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                fileReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}