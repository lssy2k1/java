package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class UserService implements CRUDService<String, UserDTO> {

	// 처음에 선언하고 사용하는 것 눈에 익게 하기.
	DAO<String, UserDTO> userDao;
	Notification notification;

	public UserService() {
		userDao = new UserDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		// 비밀번호 암호화
		try {
			userDao.insert(v);
		} catch (Exception e) {
			throw new Exception("회원가입이 실패하였습니다.(EX0001)");// DB에러를 바로 APP로 던지기 전에 예외처리를 자세히한 후 던짐.
		}
		notification.sendEmail(v.getEmail(), Msg.registerMsg1);
		notification.sendSMS(v.getContact(), Msg.registerMsg2);
	}

	@Override
	public void remove(String k) throws Exception {//비즈니스로직의 기본적인 이해
		UserDTO user = null;//2. 받을준비해~
		user = userDao.select(k);//3. 삭제전에 미리 받아놔~
		try {
			userDao.delete(k);
		} catch(Exception e) {
			throw new Exception("탈퇴오류입니다.");
		}
		notification.sendSMS(user.getContact(), Msg.removeMsg1 + Msg.removeMsg2);//1. 이메일을 입력해야하는데 k 말고, 전화정보를 받아야하네? 
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
			userDao.update(v);
		} catch(Exception e) {
			throw new Exception("수정오류입니다.");
		}
	}

	@Override
	public UserDTO get(String k) throws Exception {
		UserDTO obj = null;// UserDTO타입을 받을준비해
		obj = userDao.select(k);
		return obj;
	}

	@Override
	public List<UserDTO> get() throws Exception {
		List<UserDTO> list = null;
		try {
			list = userDao.select();
		} catch(Exception e) {
			//throw new Exception("조회오류");
		}
		return list;
	}

}
