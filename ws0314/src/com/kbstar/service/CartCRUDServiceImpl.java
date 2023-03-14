package com.kbstar.service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeItemNumber;

public class CartCRUDServiceImpl implements CRUDService<String, Cart> {

	DAO<String, String, Cart> dao;

	public CartCRUDServiceImpl() {
		dao = new CartDaoImpl();
	}

	@Override
	public void register(Cart v) throws Exception {
		try {
			String id = MakeItemNumber.makeCartNum();
			v.setId(id);
			if (v.getCnt() < 0) {
				throw new Exception();
			}
			dao.insert(v);
		} catch (SQLIntegrityConstraintViolationException e1) {
			throw new Exception("중복된 id입니다.");
		} catch (SQLRecoverableException e) {
			throw new Exception("서비스 장애.");
		} catch (SQLException e1) {
			e1.printStackTrace();
			throw new Exception("id가 없습니다.");
		} catch (Exception e2) {
			e2.printStackTrace();
			throw new Exception("예상치 못한 오류입니다.");
		}
	}

	@Override
	public void modify(Cart v) throws Exception {
		try {
			dao.update(v);
		} catch (SQLRecoverableException e) {
			throw new Exception("서비스 장애.");
		} catch (SQLException e1) {
			e1.printStackTrace();
			throw new Exception("id가 없습니다.");
		} catch (Exception e2) {
			e2.printStackTrace();
			throw new Exception("예상치 못한 오류입니다.");
		}
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (SQLRecoverableException e) {
			throw new Exception("서비스 장애.");
		} catch (SQLException e1) {
			e1.printStackTrace();
			throw new Exception("id가 없습니다.");
		} catch (Exception e2) {
			e2.printStackTrace();
			throw new Exception("예상치 못한 오류입니다.");
		}
	}

	@Override
	public Cart get(String k) throws Exception {
		Cart cart = null;
		try {
			cart = dao.select(k);
			System.out.println("get 성공");
		} catch (SQLRecoverableException e) {
			throw new Exception("서비스 장애.");
		} catch (SQLException e1) {
			throw new Exception("id가 없습니다.");
		} catch (Exception e2) {
			e2.printStackTrace();
			throw new Exception("예상치 못한 오류입니다.");
		}
		return cart;
	}

	@Override
	public List<Cart> get() throws Exception {
		List<Cart> list = new ArrayList<>();
		dao = new CartDaoImpl();
		try {
		list = dao.selectAll();
		} catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("Network Error....Check your IP Address");
			}
			else if(e instanceof SQLSyntaxErrorException) {
				throw new Exception("Data doesn't exist.");
			}
		}
		return list;
	}

}
