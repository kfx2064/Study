package lec12.jdbc.ex01;

import java.sql.*;

public class JdbcMain02 {

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

            String strProcureRequestNo = "20170103001";
            String orderRequestNo = "20170103001";

            String query = "UPDATE procure_procure_request " +
                    " SET order_request_no = " + orderRequestNo +
                    " WHERE procure_request_no = " + strProcureRequestNo;

            pstmt = conn.prepareStatement(query);

            int result = pstmt.executeUpdate();
            System.out.println("업데이트 결과 : " + result);
            pstmt.close();

            query = " SELECT * " +
                    " FROM       procure_procure_request " +
                    " WHERE procure_request_no = " + strProcureRequestNo +
                    " ORDER BY   procure_request_no asc ";

            pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery(query);

            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                for (int i = 0; i < rsmd.getColumnCount(); i++) {
                    String columnName = rsmd.getColumnName(i + 1);
                    String string = rs.getString(i + 1);
                    System.out.print(columnName + " = [" + string + "] \t");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
