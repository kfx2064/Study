package ver2_lect05.fileIO05.training02;

import java.io.FileOutputStream;

public class IOManyFunction06 {

    public static void main(String[] args) {

        String path = String.valueOf("C:\\dev\\FileIOTextFile.txt");
        FileOutputStream fos = null;

        try {

            fos = new FileOutputStream(path);

            fos.write((int)'S');
            fos.write((int)'T');
            fos.write((int)'O');
            fos.write((int)'C');
            fos.write((int)'K');
            fos.write((int)'\r');
            fos.write((int)'\n');

            fos.write("futures\r\n".getBytes());

            byte[] msg = "StockAndBonds".getBytes();
            fos.write(msg);

            /**
             * int 값으로 변환하여 FileOutputStream 객체를 사용하여 해당하는 경로의
             * 파일에 값들을 적었습니다.
             * 세 가지 방식을 보여 드렸어요.
             * write를 할 때 인트로 변환시킨 char 데이터들을 쓰는 법,
             * write 안에서 바로 getBytes 메소드로 값을 변환하여 쏘는 법.
             * byte[] 배열로 문자열을 변환하여 쓰는 법.
             * 이 세 가지를 보여 드렸습니다.
             *
             * 저런 식으로 파일에 값을 쓸 수 있어요.
             *
             * 근데 현재까지 실습을 진행하면서 진행된 내용을 말씀 드리자면,
             * 이런 기능 웹 프로그래밍할 때 잘 안 쓰기도 해요.
             *
             * 아주 오래 전엔 파일로 데이터들을 저장했다고 하더군요.
             * 그때 당시에는 데이터베이스를 시스템에 도입하지 않아서
             * 파일 단위로 데이터들을 관리했고,
             * 이런 식의 파일 입출력으로 잘 관리를 했었겠죠.
             *
             * 이제는 데이터베이스를 컨트롤하는 api를 제공하고 있고
             * 다양한 도구들이 나와 있어요.
             * 그리고 데이터들을 파일 시스템으로 관리하지 않고
             * 데이터베이스로 관리하죠.
             *
             * 가장 큰 장점이 있어요.
             * 데이터베이스의 원칙이 있는데,
             * 그 원칙들이 지향하는 목표는
             * 결국 정확한 데이터의 관리입니다.
             *
             * 부정확한 데이터는 거부하고,
             * 정확한 데이터를 데이터베이스에서 관리하는 것이죠.
             *
             * 그래서 나중에 웹 프로그래밍을 하시면 아시게 되겠지만,
             * 데이터베이스는 매우 중요한 것이고,
             * 데이터베이스 관리 시스템은 매우 중요한 시스템입니다.
             * 이것을 전문적으로 관리하시는 분들을 데이터베이스관리자,
             * DBA라고 줄어서 부르는데,
             * 이 분들은 평균 연봉도 높으신 편으로 알고 있습니다.
             * 하지만 연봉이 높은 만큼 책임도 막중하신 것으로 알고 있어요.
             *
             * 제가 일하면서 들은 이야기 중 하나는
             * 소스 코드에서 실수를 하면 민사소송을 당할 수 있겠지만,
             * 데이터베이스에서 실수를 하면 형사처벌을 받는다는 이야기였어요.
             * 정확한 이야기인지는 모르겠는데,
             * 당시 그 말씀을 해주신 선배 개발자 분께서는 그만큼
             * 데이터의 입력, 수정, 삭제를 하는 쿼리를 날릴 때는 조심, 또 조심하고
             * delete, drop, truncate와 같은 명령어는 자신이 보는데서
             * 쓰라고 하실 정도였죠.
             *
             * 그래서 일하다 보니 저는 버릇이 하나 생겼는데
             * 운영 쪽, 그러니까 실제 사용자들이 쓰는 시스템에 연동되어 있는
             * 데이터베이스 관리 시스템에는 거의 접근을 안 해요.
             * 꼭 필요할 때만 하거나,
             * DBA 분이나 데이터베이스 통제하시는 분께 복제본을 떠달라고 하고
             * 거기에 붙어서 보죠.
             * 왜냐면 저는 신입 때부터 그렇게 철저하게 교육을 받아서 그렇습니다.
             * 여러분도 나중에 현업 가시면,
             * 데이터베이스 관리 시스템, 소스 버전 컨트롤 시스템은
             * 매우 조심해서 다루세요.
             * 소프트웨어 개발에 있어서 매우 중요한 시스템들이니까요.
             *
             * 파일 입출력을 설명하다가 별도의 설명을 더 드렸네요.
             *
             * 그럼 다음 실습으로 넘어가겠습니다.
             */

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

    }

}
