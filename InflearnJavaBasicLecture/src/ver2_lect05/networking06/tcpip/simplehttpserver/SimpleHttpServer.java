package ver2_lect05.networking06.tcpip.simplehttpserver;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHttpServer {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = null;

        try {

            /**
             * 서버 소켓을 만듭니다.
             * 기억하시죠? ip > port > socket > web program.
             */

            serverSocket = new ServerSocket(80);
            Socket socket = null;

            while (true) {

                socket = serverSocket.accept();

                /**
                 * while 반복문 안에서 클라이언트의 요청이 들어올 때까지 대기하는 것입니다.
                 * 서버 소켓이 승낙하면 실제 소켓 객체를 가져오는 것이죠.
                 * 서버 소켓과 연결이 맺어졌다는 것은 클라이언트로부터 연결 요청이 들어왔다는 것이고
                 * 어떤 자료의 전달을 받았다는 의미입니다.
                 * 네트워크는 다른 컴퓨터나 장비와의 원활한 자료의 교환을 위함이라고 알려 드렸죠?
                 * 클라이언트로부터 서버로 뭔가 전달이 일어났기 때문에
                 * 연결이 이루어진 것이고 소켓 객체를 가져오게 된 것입니다.
                 */

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String strRequest = String.valueOf("");

                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || readLine.equals("")) {
                        break;
                    }
                    System.out.println(readLine);
                    if (readLine.startsWith("GET")) {
                        strRequest = readLine;
                    }
                }

                /**
                 * GET 응답일 때 String 타입의 strRequest 변수에 담깁니다.
                 * GET 요청은 Http와 관련이 있는데 보통 GET, POST, PUT, PATCH, DELETE 등이 있지요.
                 * 이런 요청들을 처리할 때 쓰는 방식입니다.
                 * 보통 GET은 조회를 할 때 많이 사용하는 방식이예요.
                 * POST는 입력, PUT이나 PATCH는 수정, DELETE는 삭제를 할 때 주로 사용하는 방식이지요.
                 *
                 * readLine은 라인 별로 값을 읽어오는 것입니다.
                 * GET으로 시작하는 행의 값을 읽어오는 것이죠.
                 * 그 값을 읽어와서 String에 담습니다.
                 */

                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

                StringBuilder stringBuilder = new StringBuilder("<html><body>")
                        .append("<h3>")
                        .append("HTTP 요청에 대한 응답입니다.")
                        .append("<br><br><br>")
                        .append("요청 : ")
                        .append(strRequest)
                        .append("</h3>")
                        .append("</body>")
                        .append("</html>");

                String message = stringBuilder.toString();

                byte[] body = message.getBytes();

                dos.writeBytes("HTTP/1.1 200 OK \r\n");
                dos.writeBytes("Server:ThisIsServer\r\n");
                dos.writeBytes("Cache-Control:private\r\n");
                dos.writeBytes("Content-Length: " + body.length + "\r\n");
                dos.writeBytes("Content-Type: text/html;charset=utf-8\r\n");
                dos.writeBytes("\r\n");

                dos.write(body, 0, body.length);

                dos.writeBytes("\r\n");
                dos.flush();

                socket.close();

                /**
                 * 일종의 웹서버입니다.
                 * 보통 웹서버를 이렇게 복잡하게 만들지는 않아요.
                 * 자바 다음 단계에 자바 웹 프로그래밍을 위해 배우는 게 보통 Servlet,
                 * Servlet을 체계적으로 도구화시킨 것이 Spring framework입니다.
                 * Play framework라는 것도 있긴 한데
                 * 우리나라에서는 Spring framework를 많이 사용합니다.
                 *
                 * 이것들은 웹 프로그래밍을 좀 더 편리하게 하기 위해 만들어 놓은 도구들이예요.
                 * 지금처럼 복잡하게 응답 헤더를 구축하고,
                 * 응답 내용을 작성하고 등의 처리를 하진 않습니다.
                 *
                 * 하지만 네트워크를 배우면서 알아야 하는 내용들에 대해 정리해 봤습니다.
                 *
                 * 감사합니다.
                 *
                 * 다음 강의에서 뵙겠습니다.
                 */

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            serverSocket.close();
        }

    }

}