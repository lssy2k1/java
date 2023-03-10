package com.kbstar.frame;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;

/**
 * 
 * @author khlee
 *
 * @param <V1>UserDTO
 * @param <V2>AccountDTO
 * @param <V3>TransactionDTO
 * @param <K>String id
 * @param <P>String pwd
 */

public interface BankService <V1, V2, V3, K, P>{
	public void register(V1 v) throws Exception;
	public V1 login(K k, P p) throws Exception;//로그인을 하면 사용자의 정보(V)가 리던됨.
	public V1 getUserInfo(K k) throws Exception;
	public void makeAccount(K k, double balance) throws Exception;//계좌개설은 사용자 아이디(K)와 밸런스만 넣으면 된다.
	public List<V2> getAllAccount(K k) throws Exception;//내가 갖고 있는 계좌를 줘! Id에 해당하는 K를 넣으면 주겠다.
	public List<V3> getAllTr(String acc) throws Exception;
	public void transaction(String sendAcc,
			String receiveAcc, double balance, String desc) throws Exception;
	//transaction이 일어나면 계좌 금액이 감소하고, 트랜젝션이 일어나고, 알림도 일어나게 된다.
}
