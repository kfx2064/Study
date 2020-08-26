package ver2_lect05.fileIO05.training02;

import java.io.*;

public class IOManyFunction15 {

    public static void main(String[] args) {

        /**
         * InputStreamReader와 OutputStreamReader가 있습니다.
         * 이것들은 사용 목적이 있어요.
         * InputStreamReader는 InputStream을 Reader로 변환하는데 목적이 있습니다.
         * 바이트 스트림 >> 디코딩 >> 문자 스트림 변환   의 작업을 거치는 것이죠.
         *
         * OutputStreamWriter도 목적이 있어요.
         * OutputStream을 Writer로 변환하는 것입니다.
         * 문자 스트림 >> 인코딩 >> 바이트 스트림으로 변환하는 것이죠.
         *
         * 인코딩과 디코딩 작업이 있어요
         * 그리고 이전 강의에서 말씀 드린 것처럼
         * 인코딩은 컴퓨터가 알아볼 수 있는 방식으로 변환하는 것,
         * 디코딩은 화면에서 사용자가 알아볼 수 있는 방식으로 변환하는 것입니다.
         *
         * 그럼 실습을 진행해 볼까요?
         */

        String path = String.valueOf("C:\\dev\\FileIO\\file2.txt");

        OutputStreamWriter outputStreamWriter = null;

        try {

            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(path), "utf-8");
            outputStreamWriter.write("국방부 utf-8\r\n");
            outputStreamWriter.append("육해공\r\n");
            outputStreamWriter.append("육군본부, 해군본부, 공군본부.");

            /**
             * 이렇게 문자열을 입력받을 수가 있습니다.
             * 인코딩 타입을 지정해 줄 수 있어요.
             * utf-8이죠
             * euc-kr도 있고 utf-16도 있지만
             * 가장 자주 쓰이는 인코딩 타입은 utf-8이죠.
             *
             * ip에서도 ip4와 ip6가 있어요.
             *
             * 잠시 곁가지 이야기를 해드릴게요.
             * 예전 pc 세상에서는 ip4로 ip를 할당하는 것이 넉넉한 편이었어요.
             * 넉넉하다기보다는 부족함이 없었다는 표현이 맞겠죠.
             * 부족함 없이 사용하던 것이 ip4였어요.
             * 우리가 흔히들 ip라고 말하는 것이 있지요?
             * 그건 보통 주소라고 생각하시면 되요.
             * 인터넷에 접속하는 pc의 주소라고 보시면 되거든요.
             * 옛날엔 pc 뿐이었어요.
             * 근데 10년 이상 전에 뭐가 나왔지요?
             * 스마트폰이 나왔어요.
             * 스마트폰이 나오면서 3g도 활성화되고 4g, 5g로 나아가고 있죠.
             * 거기다가 인터넷에 붙는 기기가 확 늘어난 것이 된 거예요.
             * 업무용으로 여러 개의 스마트폰을 쓰는 사람도 있고
             * pc는 없어도 스마트폰은 있는 사람이 많아요.
             * 단순히 국내만 두고 볼 게 아니라 국외도 보면 되요.
             *
             * 그러면서 많은 ip가 필요하게 되었죠.
             * 이제 또 다른 변화가 일어납니다.
             * 그것은 뭐냐면 iot의 등장이예요.
             * 모든 사물이 네트워크 환경에 연결되는 것이죠.
             * 아파트 사시는 분들이라면 우리가 쓰는 엘리베이터,
             * 가스밸브, 환기, 난방, 에어컨 등 모든 사물에 iot가 입혀지는 것이예요.
             * 단독주택 등에서 사시는 분들이라면
             * 가로등, 길거리의 cctv, 버스정류소의 전자안내판 등
             * 다양한 사물에 네트워크가 입혀지고
             * 그것이 iot 생태계를 만들어 가는 것이죠.
             * 이 개념들이 공장에도 도입되고 있고
             * 아파트에도 도입되고
             * 도로에도 도입되고
             * 매우 많이 도입되고 있어요.
             *
             * 네트워크에 접속하는 사물의 수가 폭발적으로 늘어나는 것이죠.
             * 그러다 보니 ip의 숫자가 매우 많이 필요하게 되었어요.
             * 그래서 ip4가 아니라 새로운 체계를 입힌
             * ip6를 만들어 내게 되었죠.
             * 결국 ip6의 등장은 iot에서도 ip의 부족함이 없도록 해주었어요.
             *
             * 갑자기 이 이야기를 왜 하냐면
             * 지금은 utf-8을 주로 쓰지만
             * 앞으로 시간이 흐를 수록 어떤 인코딩 타입이 대세가 될지 모르는 거예요.
             * 이제 시간이 흘러가면 어떠한 인코딩 타입이 주류가 될 것이고,
             * 제가 만든 강의도 과거의 기억이 되겠죠.
             *
             * 잠시 곁가지 설명을 드렸습니다.
             * 그럼 코딩을 이어가겠습니다.
             */

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outputStreamWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        BufferedReader bufferedReader = null;
        try {

            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "utf-8"));
            while (true) {
                String strReadLine = bufferedReader.readLine();
                if (strReadLine == null) {
                    break;
                }
                System.out.println(strReadLine);
            }

            /**
             * InputStreamReader를 활용하여 BufferedReader를 써서 문자열을 읽어 들였죠.
             * 그것을 라인별로 찍어보았습니다.
             * 이걸 확인하는 것은 문자열이 제대로 쓰여졌나 확인하는 것이예요.
             * 실제로 쓰여진 문자열을 확인해서
             * 읽어들여서 쓰여진 문자열의 값을 확인하는 것이죠.
             *
             * InputStreamReader와 OutputStreamWriter의 설명은 여기까지 하겠습니다.
             *
             * 감사합니다
             */

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
