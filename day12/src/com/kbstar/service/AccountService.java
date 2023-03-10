package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class AccountService implements CRUDService<String, AccountDTO>{

	DAO<String, AccountDTO> accDao;
	Notification notification;
	
	public AccountService() {
		accDao = new AccountDAO();
		notification = new NotificationImpl();
	}
	
	@Override
	public void register(AccountDTO v) throws Exception {
		try {
			accDao.insert(v);
			//System.out.println(v);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			accDao.delete(k);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void modify(AccountDTO v) throws Exception {
		try {
			accDao.update(v);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public AccountDTO get(String k) throws Exception {
		try {
			AccountDTO obj = null;
			obj = accDao.select(k);
			return obj;
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		try {
			List<AccountDTO> list = null;
			list = accDao.select();
			return list;
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
