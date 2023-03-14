package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class CustCRUDServiceImpl implements CRUDService<String, Cust> {
	DAO<String, String, Cust> dao = null;

	public CustCRUDServiceImpl() {
		dao = new CustDaoImpl();
	}

	@Override
	public void register(Cust v) throws Exception {
		// 데이터 검증 - DB입력 - Email, SMS 전송
		try {
			dao.insert(v);
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("ID가 중복되었습니다.");
			} else {
				e.printStackTrace();
				throw new Exception("시스템 장애입니다.");
			}
		}
	}

	@Override
	public void modify(Cust v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("없는 아이디 입니다.");
			} else {
				e.printStackTrace();
				throw new Exception("시스템 장애입니다.");
			}
		}
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("해당 ID가 없습니다.");
			}
		}

	}

	@Override
	//트러블케이스를 테스트하는 것이 중요함! 예외처리가 중요.
	//데이터가 없는 상황 및 DB연결이 끊어진 상황.
	public Cust get(String k) throws Exception {
		Cust cust = null;
		try {
			cust = dao.select(k);
		}catch(Exception e){
			if(e instanceof SQLRecoverableException) {
				throw new Exception("서비스 장애입니다.");//오류메세지를 고객에게 보여지게끔 Service에서 가공한다.
			}else {
				throw new Exception("아이디가 존재하지 않습니다.");
			}
		}
		return cust;
		
//		Cust cust = null;
//		try {
//			cust = dao.select(k);
//			System.out.println("선택완료");
//			return cust;
//		}catch (Exception e) {
//			if (e instanceof SQLRecoverableException) {
//				throw new Exception("시스템 장애");
//			} else {
//				throw new Exception("해당 ID가 없습니다.");
//			}
//		}
	}

	@Override
	public List<Cust> get() throws Exception {
		List<Cust> list = null;
		try{
			list = dao.selectAll();
		}catch(Exception e){
			if(e instanceof SQLRecoverableException) {
				throw new Exception("서비스 장애입니다.");//오류메세지를 고객에게 보여지게끔 Service에서 가공한다.
			}//else {
				//throw new Exception("아이디가 존재하지 않습니다.");
			//}
		}
		return list;
		//		List<Cust> list = null;
//		try {
//			list = dao.selectAll();
//			return list;
//		}catch (Exception e) {
//			if (e instanceof SQLRecoverableException) {
//				throw new Exception("시스템 장애");
//			} else {
//				throw new Exception("id가 없습니다.");
//			}
//		}

	}

}
