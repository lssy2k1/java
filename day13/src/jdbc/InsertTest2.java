package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest2 {

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

		Connection con = null;
		PreparedStatement pstmt = null;
		
		//Statement 생성 - SQL문 준비
		//SQL 전송

		try {
			con = DriverManager.getConnection(url, id, pwd);
			pstmt = con.prepareStatement(insertSql);//pstmt에 값을 넣는다.
			pstmt.setString(1, "id70");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "홍시");
			pstmt.setInt(4, 77);//데이터베이스에 요청할 준비가 완료된 것.
			int result = pstmt.executeUpdate();//위에서 만든 쿼리문을 날린다.
			System.out.println(result);//인서트가 됐으면 1, 안됐으면 0
		} catch (SQLException e1) {
			System.out.println("인서트 실패");
			e1.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {//반드시 널이 아닐때만 
					pstmt.close();
				}
				pstmt.close();//나중에 생긴것부터 close
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(con != null) {
				con.close();
				}
			} catch (SQLException e) {
				System.out.println("종료 실패 !!");
				e.printStackTrace();
			}
			System.out.println("종료...");
		}
		}
		
		//결과 받기
		
		//close
		

}
