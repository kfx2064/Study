package lec12.jdbc.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcMain04 {
	
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
			System.out.println("커넥션 : " + conn);
			
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
			
			String query = "INSERT INTO procure_table ";
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
				pstmt.addBatch();
				pstmt.clearParameters();
			}
			
			int[] ints = pstmt.executeBatch();
			System.out.println("결과 : " + ints);
			
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
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
