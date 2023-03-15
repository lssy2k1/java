package com.kbstar.service;

import java.util.ArrayList;
import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.ShopService;

public class ShopServiceImpl implements ShopService<Cust, Cart> {
	DAO<String, String, Cust> custDao;
	DAO<String, String, Item> itemDao;
	DAO<String, String, Cart> cartDao;

	public ShopServiceImpl() {
		custDao = new CustDaoImpl();
		itemDao = new ItemDaoImpl();
		cartDao = new CartDaoImpl();
	}

	@Override
	public Cust login(String id, String pwd) throws Exception {
		// 사용자가 화면에서 id pwd를 입력했다. -> db의 id pwd를 가져와서 비교한다.
		// 1. id있나 없나 확인. 2. pwd 같은지 비교 -> 로그인성공 -> UserDTO를 던져줌
		// id가 없거나 pwd가 틀리면 로그인 실패.
		Cust cust = null;
		cust = custDao.select(id);// db에서 가져오는거긴 하지만, 생각 안해도됨. userDao에서 가져오는 함수가 있기 때문에!
		if (cust != null) {
			if (cust.getPwd().equals(pwd)) {// db의 패스워드를 가져와서 입력한 pwd (String p)와 비교해!
				System.out.println("로그인 성공. 환영합니다.");
			} else {
				throw new Exception("로그인 실패...");
			}
		} else {
			throw new Exception("로그인 실패...");// 만약 Msg파일을 불러와서 static메소드로 사용하면 더 편하다.
		}
		return cust;
	}

	@Override
	public void register(Cust v) throws Exception {
		try {
			custDao.insert(v);
		}catch (Exception e) {
			throw new Exception("등록 오류");
		}
		//notification.sendEmail(v.getEmail(), "등록을 축하합니다.email");
		//notification.sendSMS(v.getContact(), "등록을 축하합니다.sms");
	}
	
	@Override
	public List<Cart> myCart(String id) throws Exception {
		List<Cart> list = null;
		list = cartDao.search(id);
		return list;
	}

}
