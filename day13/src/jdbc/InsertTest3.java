package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest3 {

	public static void main(String[] args) {
		//Driver Loading
		//구현객체를 로딩한다
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공");

		//Connect
		
		String id = "bank";
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.20.60:1521:XE";
		String insertSql = "INSERT INTO cust VALUES(?, ?, ?, ?)";

		//Statement 생성 - SQL문 준비
		//SQL 전송
		
		//con, pstmt를 자동으로 닫아주게 함.
		try (Connection con = DriverManager.getConnection(url, id, pwd); 
				PreparedStatement pstmt = con.prepareStatement(insertSql);){
			pstmt.setString(1, "id77");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "홍시");
			pstmt.setInt(4, 77);
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e1) {
			System.out.println("인서트 실패");
			e1.printStackTrace();
		}
		}
	
}
