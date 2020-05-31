package pushData;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class pushGeneratedProcureData {

    public static void main(String[] args) throws Exception {

        ArrayList<LinkedHashMap<String, Object>> extractProcureDataList = new ArrayList<>();


        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String jdbcUrl = String.valueOf("jdbc:mariadb://127.0.0.1:3308/household");
        String userId = String.valueOf("root");
        String userPw = String.valueOf("1234");

        FileInputStream fis = new FileInputStream("D:\\dummyProcureRequestData2016.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        int rowindex = 0;
        int columnindex = 0;

        // 첫 번째 시트 읽기
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getPhysicalNumberOfRows();

        for (rowindex = 0; rowindex < rows; rowindex++) {
            // 행을 읽는다.
            XSSFRow row = sheet.getRow(rowindex);
            System.out.println("rowindex ::: " + rowindex);

            if (row != null) {
                // 셀의 수
                int cells = row.getPhysicalNumberOfCells();
                LinkedHashMap<String, Object> extractProcureDataMap = new LinkedHashMap<>();

                for (columnindex = 0; columnindex <= cells; columnindex++) {
                    // 셀 값을 읽는다.
                    XSSFCell cell = row.getCell(columnindex);
                    String value = String.valueOf("");

                    DataFormatter formatter = new DataFormatter();

                    // 셀이 빈 값일 경우를 위한 널 체크
                    if (cell == null) {
                        continue;
                    } else {
                        int cellType = cell.getCellType();
                        switch (cell.getCellType()) {
                            case XSSFCell.CELL_TYPE_FORMULA:
                                value = cell.getCellFormula();
                                break;
                            case XSSFCell.CELL_TYPE_NUMERIC:
                                value = formatter.formatCellValue(cell);
                                break;
                            case XSSFCell.CELL_TYPE_STRING:
                                value = cell.getStringCellValue() + "";
                                break;
                        }
                    }

                    switch (columnindex) {
                        // 0셀, 구매요청번호
                        // 1셀, 구매요청순번
                        // 2셀, 구매요청일자
                        case 0:
                            extractProcureDataMap.put("procureRequestNo", value);
                            System.out.println("procureRequestNo ::: " + value);
                            break;
                        case 1:
                            extractProcureDataMap.put("procureRequestSeq", value);
                            System.out.println("procureRequestSeq ::: " + value);
                            break;
                        case 2:
                            extractProcureDataMap.put("procureRequestDate", value);
                            break;
                        // 3셀, 품목코드
                        // 4셀, 단위코드
                        // 5셀, 수량
                        case 3:
                            extractProcureDataMap.put("itemCd", value);
                            break;
                        case 4:
                            extractProcureDataMap.put("unit", value);
                            break;
                        case 5:
                            extractProcureDataMap.put("qty", value);
                            break;
                        // 6셀, 등록일자
                        // 7셀, 등록사용자
                        // 8셀, 삭제여부
                        case 6:
                            extractProcureDataMap.put("regDate", value);
                            break;
                        case 7:
                            extractProcureDataMap.put("regId", value);
                            break;
                        case 8:
                            extractProcureDataMap.put("delYn", value);
                            break;
                        // 9셀, 구매요청상태
                        case 9:
                            extractProcureDataMap.put("procureRowStatus", value);
                            break;
                    }
                }
                extractProcureDataList.add(extractProcureDataMap);
            } // 엑셀 데이터 추출 후 자료구조에 담는 작업 완료

        }

        // 자료구조를 풀어가며 데이터베이스에 데이터를 저장한다.
        int extListSize = extractProcureDataList.size();
        System.out.println("extListSize ::: " + extListSize);

        for (int i = 0; i < extListSize; i++) {

            System.out.println("show i ::: " + i);

            StringBuilder strSql = new StringBuilder("");

            LinkedHashMap<String, Object> lkMap = extractProcureDataList.get(i);
            System.out.println("showExtractDataMap ::: " + lkMap.toString());
            String procureRequestNo = String.valueOf(lkMap.get("procureRequestNo"));
            String procureRequestSeq = String.valueOf(lkMap.get("procureRequestSeq"));
            String procureRequestDate = String.valueOf(lkMap.get("procureRequestDate"));
            String itemCd = String.valueOf(lkMap.get("itemCd"));
            String unit = String.valueOf(lkMap.get("unit"));
            String qty = String.valueOf(lkMap.get("qty"));
            String regDate = String.valueOf(lkMap.get("regDate"));
            String regId = String.valueOf(lkMap.get("regId"));
            String delYn = String.valueOf(lkMap.get("delYn"));
            String procureRowStatus = String.valueOf(lkMap.get("procureRowStatus"));

            strSql.append("INSERT INTO procure_procure_request ")
                    .append("(")
                    .append("procure_request_no").append(", procure_seq").append(", procure_request_date").append(", item_cd")
                    .append(", unit").append(", qty").append(", procure_status")
                    .append(", reg_id").append(", del_yn").append(") VALUES ('")
                    .append(procureRequestNo)
                    .append("', ")
                    .append(procureRequestSeq)
                    .append(", '")
                    .append(procureRequestDate)
                    .append("', '")
                    .append(itemCd)
                    .append("', '")
                    .append(unit)
                    .append("', ")
                    .append(qty)
                    .append(", '")
                    .append(procureRowStatus)
                    .append("', '")
                    .append(regId)
                    .append("', '")
                    .append(delYn)
                    .append("');");

            connection = DriverManager.getConnection(jdbcUrl, userId, userPw);
            System.out.println(i + " ::: db connection success.");

            Statement stmt = connection.createStatement();
            int result = stmt.executeUpdate(strSql.toString());

            System.out.println("After insert, get result ::: " + i + " == " + result);

            stmt.close();
            connection.close();

            if (i % 800 == 0) {
                Thread.sleep(10000);
            }
        }

    }

}
