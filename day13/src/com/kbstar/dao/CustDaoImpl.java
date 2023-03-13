
package com.kbstar.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CustDaoImpl implements DAO<String, String, Cust> {
//다섯개의 파일을 하나로 만드는 것!
//반복된 driver loading, connection을 공통적으로 작성.

	public CustDaoImpl() {// 생성자가 호출되면 실행되도록.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공");
	}

	public Connection getConnection() throws Exception {

		Properties props = new Properties();
		String fileName = "db_info.txt";
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);

		Connection con = null;
		String id = props.getProperty("DB_ID");
		String pwd = props.getProperty("DB_PWD");
		String url = props.getProperty("DB_URL");
		con = DriverManager.getConnection(url, id, pwd);
		return con;
	}

	@Override
	public void insert(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			int result = pstmt.executeUpdate();
		} catch (SQLException e1) {
			throw e1;// 여기서 예외를 처리해버리면 App화면에서는 문제가 발생한지 모름.
			// e1.printStackTrace();
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("없는 ID입니다.");
			}

		} catch (SQLException e1) {
			System.out.println("delete 실패");
			throw e1;
		}
	}

	@Override
	public void update(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);) {
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId());
			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("없는 ID입니다.");
			}
		} catch (SQLException e) {
			throw e;
		}
	}

	@Override
	public Cust select(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				Cust cust = null;
				String db_id = rset.getString("id");
				String db_pwd = rset.getString("pwd");
				String db_name = rset.getString("name");
				int age = rset.getInt("age");
				cust = new Cust(db_id, db_pwd, db_name, age);
				return cust;
			} catch (SQLException e) {
				throw new Exception();
			}
		} catch (SQLException e1) {
			throw new Exception();
		}
	}

	@Override
	public List<Cust> selectAll() throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql);) {
			try (ResultSet rset = pstmt.executeQuery()) {
				List<Cust> list = new ArrayList<Cust>();
				Cust cust = null;
				while (rset.next()) {
					String db_id = rset.getString("id");
					String db_pwd = rset.getString("pwd");
					String db_name = rset.getString("name");
					int age = rset.getInt("age");
					cust = new Cust(db_id, db_pwd, db_name, age);
				    list.add(cust);
				}
				return list;
			} catch (SQLException e) {
				throw new Exception();
			}
		} catch (SQLException e1) {
			throw new Exception();
		}
	}

	@Override
	public List<Cust> search(String k2) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
