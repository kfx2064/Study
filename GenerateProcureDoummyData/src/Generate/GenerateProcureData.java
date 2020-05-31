package Generate;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class GenerateProcureData {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("procureData");
        XSSFRow row = null;
        XSSFCell cell = null;

        FileOutputStream fos = null;
        String outputFilePath = String.valueOf("D:/dummyProcureRequestData00001");

        int excelDataRow = 0;

        String strProcureRequestNo = String.valueOf("");
        String strProcureSeq = String.valueOf("");
        String strProcureRequestDate = String.valueOf("");
        String strItemCd = String.valueOf("");
        String strUnit = String.valueOf("");
        String strQty = String.valueOf("");
        String strRegDate = String.valueOf("");
        String strRegId = String.valueOf("");
        String strDelYn = String.valueOf("N");
        String strProcureStatus = String.valueOf("01");

        HashMap<String, Object> saveProcureDataMap = new HashMap<>();

        int intSetYear = 2020;
        // 하나의 일자에 생성되는 최대의 구매요청데이터 개수. 해당 숫자 안에서 랜덤한 수의 맥스값으로 데이터가 생성된다.
        int generateCount = 5;

        // 2020년 각 월의 주말을 제외한 날짜를 구한다.
        Calendar calendar = Calendar.getInstance();
        for (int forYear = intSetYear; forYear > 2015; forYear--) {
            for(int i = 0; i < 12; i++) {
                calendar.set(forYear, i, 1);

                Date time = calendar.getTime();

                int actualMaximum = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                int intMonth = calendar.get(Calendar.MONTH);
                int intDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                StringBuilder sb = new StringBuilder();

                ArrayList<Integer> dayList = new ArrayList<>();

                for (int x = 0; x < actualMaximum; x++) {

                    calendar.set(forYear, i, x);
                    int getDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                    // 토, 일 제외하기
                    if (getDayOfWeek != 6 && getDayOfWeek != 7) {
                        sb.append(x + ", ");
                        dayList.add(x);
                    }

                    if (x == actualMaximum - 1) {
                        System.out.println(i + " 추출된 일자 보기 ::: " + sb.toString());
                    }
                }

                System.out.println("리스트 ::: " + dayList.toString());

                int daySize = dayList.size();

                // 추출된 일자를 이용해서 랜덤하게 품목 데이터를 뽑아서 구매 데이터를 생성한다.
                for (int y = 0; y < daySize; y++) {
                    // 토, 일이 제외된 일자들이 추출되어 구매요청일자가 된다.
                    Integer integerDay = dayList.get(y);
                    int intDay = (int) integerDay;
                    strProcureRequestDate = String.valueOf(forYear)
                            .concat(String.format("%02d", (i + 1)))
                            .concat(String.format("%02d", (intDay + 1)));

                    // 토, 일이 제외된 일자들이 추출되어 등록일자가 된다.
                    strRegDate = String.valueOf(forYear)
                            .concat("-")
                            .concat(String.format("%02d", (i + 1)))
                            .concat("-")
                            .concat(String.format("%02d", (intDay + 1)))
                            .concat(" ")
                            .concat("00:00:00");
                    System.out.println("strRegDate ::: " + strRegDate);

                    strRegId = String.valueOf("1");

                    // 최대 5의 맥스값 안에서 랜덤하게 1~5까지의 수를 추출한 후, 해당 갯수만큼 구매요청 데이터를 생성한다.
                    int intRandomGenMax = (int) (Math.random() * generateCount) + 1;

                    for(int generate = 0; generate < intRandomGenMax; generate++) {

                        // 구매요청번호를 생성한다.
                        strProcureRequestNo = strProcureRequestDate.concat("00").concat(String.valueOf(generate + 1));
                        System.out.println();
                        System.out.print(strProcureRequestNo + ", ");

                        // 하나의 구매요청당 랜덤하게 순번을 생성한다. 순번은 3개 이내, 즉 하나의 구매요청번호 데이터 내에 3개 이내의 데이터만 생성한다.
                        int maxGenSeq = (int) (Math.random() * 3) + 1;
                        System.out.println("maxGenSeq ::: " + maxGenSeq);
                        // 실제 3개 이내의 seq를 생성하는 반복문이다.
                        // 해당 반복문 내에서 품목코드(itemCd), 단위코드(unit), 수량(qty)를 랜덤하게 생성한다.
                        // 품목코드는 203개 이내에서, 단위코드는 품목코드와 연계해서 sql로 조회하여 가져온다.
                        // 수량은 10개 이내의 랜덤 숫자를 사용하여 생성한다.
                        for (int genCnt = 1; genCnt <= maxGenSeq; genCnt++) {
                            // excelDataRow만큼 행을 생성합니다.
                            row = sheet.createRow(excelDataRow);
                            // 행을 생성한 다음 excelDataRow를 증가시킵니다.
                            excelDataRow++;

                            // 구매요청번호를 셋팅한다.
                            row.createCell(0).setCellValue(strProcureRequestNo);

                            System.out.print("genCnt ::: " + genCnt + "  ");
                            row.createCell(1).setCellValue(genCnt);
                            row.createCell(2).setCellValue(strProcureRequestDate);


                            // 수량을 10개 이내로 랜덤하게 생성한다.
                            int intRandomQty = (int) (Math.random() * 10) + 1;
                            System.out.println("intRandomQty ::: " + intRandomQty);
                            strQty = String.valueOf(intRandomQty);

                            // 품목코드, 단위코드 조회
                            try {
                                Class.forName("org.mariadb.jdbc.Driver");
                                String jdbcUrl = String.valueOf("jdbc:mariadb://127.0.0.1:3308/household");
                                String userId = String.valueOf("root");
                                String userPass = String.valueOf("1234");
                                connection = DriverManager.getConnection(jdbcUrl, userId, userPass);
                                System.out.println("db connection success.");

                                int intId = (int) (Math.random() * 203) + 1;

                                StringBuilder strSql = new StringBuilder("")
                                        .append("SELECT item_cd ")
                                        .append(", unit ")
                                        .append("FROM procure_item ")
                                        .append("WHERE id = " + intId);

                                preparedStatement = connection.prepareStatement(strSql.toString());
                                ResultSet resultSet = preparedStatement.executeQuery();

                                StringBuilder sbItemCd = new StringBuilder("");
                                StringBuilder sbUnit = new StringBuilder("");

                                while (resultSet.next()) {
                                    String itemCd = resultSet.getString("item_cd");
                                    strItemCd = itemCd;

                                    String unit = resultSet.getString("unit");
                                    strUnit = unit;
                                }

                                System.out.println("itemCd ::: " + strItemCd);
                                System.out.println("unit ::: " + strUnit);

                                preparedStatement.close();
                                connection.close();

                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                            // 만들어진 데이터를 토대로 엑셀 파일을 생성한다.
                            row.createCell(3).setCellValue(strItemCd);
                            row.createCell(4).setCellValue(strUnit);
                            row.createCell(5).setCellValue(strQty);
                            row.createCell(6).setCellValue(strRegDate);
                            row.createCell(7).setCellValue(strRegId);
                            row.createCell(8).setCellValue(strDelYn);
                            row.createCell(9).setCellValue(strProcureStatus);

                        }
                        System.out.println();
                    }
                }
            }
        }

        try {
            fos = new FileOutputStream(outputFilePath);
            workbook.write(fos);
        } catch (Exception e) {

        }

        // 하나의 년월일에 7개 미만의 구매요청데이터 생성 기회를 부여한다.
        System.out.println();
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * 7) + 1;
            System.out.print(random);
        }

    }

}
