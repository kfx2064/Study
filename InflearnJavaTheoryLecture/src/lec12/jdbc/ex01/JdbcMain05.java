package lec12.jdbc.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcMain05 {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        boolean logicSuccess = false;

        try {

            Class.forName("org.mariadb.jdbc.Driver");

            String url = "jdbc:mariadb://127.0.0.1:3306/household";
            String user = "root";
            String pass = "1234";

            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection 연결 : " + conn);

            conn.setAutoCommit(false);

            String[][] strArrayData = new String[][]
                    {
                            {"001", "AAA", "0001"},
                            {"002", "AAB", "0002"},
                            {"003", "AAC", "0003"},
                            {"004", "AAD", "0004"},
                            {"005", "AAE", "0005"},
                            {"006", "AAF", "0006"},
                            {"007", "AAG", "0007"},
                    };

            int strLength = strArrayData.length;
            System.out.println(strLength);

            String query = "INSERT INTO procure_table  ";
            query += " (id, pName, pId) ";
            query += " VALUES ";
            query += " (?, ?, ?) ";

            pstmt = conn.prepareStatement(query);

            for (int i = 0; i < strLength; i++) {
                String strData1 = strArrayData[i][0];
                String strData2 = strArrayData[i][1];
                String strData3 = strArrayData[i][2];
                System.out.println("1=" + strData1 + "\t\t 2=" + strData2 + "\t\t 3=" + strData3);

                pstmt.setString(1, strData1);
                pstmt.setString(2, strData2);
                pstmt.setString(3, strData3);

                int resultData = pstmt.executeUpdate();
                System.out.println("결과 : " + resultData);

                if (i > 1) {
                    throw new Exception();
                }

                pstmt.clearParameters();
            }

            conn.commit();
            logicSuccess = true;

        } catch (Exception e) {
            e.printStackTrace();
            if (logicSuccess == false) {
                try {
                    if (conn != null) {
                        conn.rollback();
                        conn.setAutoCommit(true);
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

}
