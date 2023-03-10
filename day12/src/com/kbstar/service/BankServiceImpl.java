/**
 * 
 */
package com.kbstar.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

/**
 * @author lssy2
 *
 */
public class BankServiceImpl 
implements BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {

	DAO<String, UserDTO> userDao;
	Notification notification;
	DAO<String, AccountDTO> accountDao;
	DAO<String, TransactionDTO> transactionDao;
	
	public BankServiceImpl(){
		userDao = new UserDAO();
		notification = new NotificationImpl();
		accountDao = new AccountDAO();
		transactionDao = new TransactionDAO();
	}
	
	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userDao.insert(v);
		}catch (Exception e) {
			throw new Exception("등록 오류");
		}
		notification.sendEmail(v.getEmail(), "등록을 축하합니다.email");
		notification.sendSMS(v.getContact(), "등록을 축하합니다.sms");
	}

	@Override
	public UserDTO login(String k, String p) throws Exception {
		//사용자가 화면에서 id pwd를 입력했다. -> db의 id pwd를 가져와서 비교한다.
		//1. id있나 없나 확인. 2. pwd 같은지 비교 -> 로그인성공 -> UserDTO를 던져줌
		//id가 없거나 pwd가 틀리면 로그인 실패.
		UserDTO user = null;
		user = userDao.select(k);//db에서 가져오는거긴 하지만, 생각 안해도됨. userDao에서 가져오는 함수가 있기 때문에!
		if(user != null) {
			if(user.getPwd().equals(p)) {//db의 패스워드를 가져와서 입력한 pwd (String p)와 비교해!
				System.out.println("로그인 성공. 환영합니다.");
			}else {
				throw new Exception("로그인 실패...");
			}
		}else {
			throw new Exception("로그인 실패...");//만약 Msg파일을 불러와서 static메소드로 사용하면 더 편하다.
		}
		return user;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = userDao.select(k);
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {//AccountDTO 생성자를 보고 만들자.
		AccountDTO account =
				new AccountDTO(MakeAccountNumber.makeAccNum(), balance, k);
		accountDao.insert(account);//insert함수 사용을 위해선 AccountDAO를 윗부분에 선언을 해줘야한다.
		UserDTO user = userDao.select(k);//이메일을 보내려는데 어떻게 가져오지? userDao.select를 가져오면 되지. 받는 타입은 UserDTO!
		notification.sendEmail(user.getEmail(), account.getAccNum()+"계좌를 생성하셨습니다." );
		notification.sendSMS(user.getContact(), account.getAccNum()+"계좌를 생성하셨습니다." );		
	}

	//////////////////////////////////아직은 구현 못함/////////////////////////////////////////
	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		List<AccountDTO> list = new ArrayList<>();
		list = accountDao.select();
		//System.out.println(list);
		return list;
	}

	//////////////////////////////////아직은 구현 못함/////////////////////////////////////////
	@Override
	public List<TransactionDTO> getAllTr(String acc) throws Exception {
		List<TransactionDTO> list = new ArrayList<>();
		list = transactionDao.select();
		//System.out.println(list);
		return list;
	}

	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
		
		//계좌정보 수정
		//계좌잔액 정보를 조회하고 잔액에서 이체하는 금액 차감하여 수정
//		AccountDTO acc = accountDao.select(sendAcc);
//		if (acc.getBalance() <= 0 || acc.getBalance() < balance) {
//			System.out.println("잔액이 부족합니다.");
//		}
//		//accountDao.update(acc);
//		AccountDTO accountDTO = new AccountDTO(acc.getAccNum(), acc.getBalance() - balance, acc.getHolder());
//		accountDao.update(accountDTO);
//		TransactionDTO transactionDTO = new TransactionDTO(date, accNo, balance, O, desc);
//		transactionDao.insert(transactionDTO);

		AccountDTO acc = null;//본거래에 대한 전산. 예비거래에서 계좌 상태, 잔액, 상대 계좌 상태 확인 등 절차.
		acc = accountDao.select(sendAcc);
		double abalance = acc.getBalance() - balance;
		acc.setBalance(abalance);
		accountDao.update(acc);
		
		//거래내역 추가
		TransactionDTO trans = null;
		trans = new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, balance, "o", desc);
		transactionDao.insert(trans);
		
		//sms, email 전송
		
		String k = acc.getHolder();
		UserDTO user = new UserDTO();
		user = userDao.select(k);
		notification.sendEmail(user.getEmail(), sendAcc + "에서" + balance + "원이 출금되었습니다.");
		notification.sendSMS(user.getContact(), sendAcc + "에서" + balance + "원이 출금되었습니다.");
		
		//완료
	}

	

}
