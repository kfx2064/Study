package lec12.jdbc.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

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
							"FROM		procure_procure_request " + 
							"WHERE 		procure_request_no like '20200803%' " + 
							"ORDER BY procure_request_no ASC ";
			
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String strValueCol01 = rs.getString(1);
				String strValueCol02 = rs.getString(2);
				String strValueCol03 = rs.getString(3);
				String strValueCol04 = rs.getString(4);
				String strValueCol05 = rs.getString(5);
				System.out.println(strValueCol01 + " || " + strValueCol02 + " || " + strValueCol03 + " || " + strValueCol04 + " || " + strValueCol05);
			}
			System.out.println();
			
			/*
			 * ResultSetMetaData rsmd = rs.getMetaData();
			 * 
			 * while (rs.next()) { for (int i = 0; i < rsmd.getColumnCount(); i++) { String
			 * columnName = rsmd.getColumnName(i + 1); String value = rs.getString(i + 1);
			 * System.out.print(columnName + " == [ " + value + " ] "); }
			 * System.out.println(); } System.out.println();
			 */
			
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
