package lec12.jdbc.ex01;

import java.sql.*;

public class JdbcMain01 {

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

            String query = "SELECT * " +
                            "FROM       procure_procure_request " +
                            "ORDER BY   procure_request_no asc ";

            pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                for (int i = 0; i < rsmd.getColumnCount(); i++) {
                    String columnName = rsmd.getColumnName(i + 1);
                    String value = rs.getString(i + 1);
                    System.out.print("\t" + columnName + "[" + value + "]");
                }
                System.out.println();
            }
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }

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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
