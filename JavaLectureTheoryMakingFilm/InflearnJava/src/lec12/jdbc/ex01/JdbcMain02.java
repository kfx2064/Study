package lec12.jdbc.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

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
			System.out.println("커넥션 연결 : " + conn);
			
			String strProcureRequestNo = "20170103001";
			String orderRequestNo = "20170103002";
			
			String query = "UPDATE procure_procure_request " +
						" SET order_request_no =  " + orderRequestNo +
						" WHERE procure_request_no = " + strProcureRequestNo;
			
			pstmt = conn.prepareStatement(query);
			
			int result = pstmt.executeUpdate();
			System.out.println("업데이트 결과 : " + result);
			pstmt.close();
			
			query = " SELECT * " +
					" FROM  	procure_procure_request " +
					" WHERE 	procure_request_no = " + strProcureRequestNo +
					" ORDER BY 	procure_request_no asc ";
			
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while (rs.next()) {
				for (int i = 0; i < rsmd.getColumnCount(); i++) { 
					String columnName = rsmd.getColumnName(i + 1);
					String value = rs.getString(i + 1);
					System.out.print(columnName + " = [ " + value + " ] \t");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
