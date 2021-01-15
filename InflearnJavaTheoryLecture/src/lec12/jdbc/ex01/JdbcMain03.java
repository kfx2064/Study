package lec12.jdbc.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcMain03 {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            Class.forName("org.mariadb.jdbc.Driver");

            String url = "jdbc:mariadb://127.0.0.1:3306/household";
            String user = "root";
            String pass = "1234";

            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection 연결 : " + conn);

            String strProcureRequestNo = "20210115001";
            String strProcureRequestDate = "20210115";
            String strItemCd = "0047";
            String strUnit = "001";
            String strQty = "10";
            String strRegDate = "2021-01-15 09:00:00";
            String strDelYn = "N";

            String query = "INSERT INTO procure_procure_request ";
            query += " (procure_request_no, procure_request_date, item_cd, unit, qty, reg_date, del_yn) ";
            query += " VALUES(?, ?, ?, ?, ?, ?, ?) ";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, strProcureRequestNo);
            pstmt.setString(2, strProcureRequestDate);
            pstmt.setString(3, strItemCd);
            pstmt.setString(4, strUnit);
            pstmt.setString(5, strQty);
            pstmt.setString(6, strRegDate);
            pstmt.setString(7, strDelYn);

            int result = pstmt.executeUpdate();
            pstmt.clearParameters();

            System.out.println("insert 결과 : " + result);

        } catch (Exception e) {
            e.printStackTrace();
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
