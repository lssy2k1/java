package com.kbstar.frame;

public class Makemessage {
	public static String makeMessage(String code) {//String으로 된 code를 리턴한다.
		String result = "";
		switch(code) {
		case "ER0001" : result = "계좌개설 실패...";
		break;
		case "ER0002" : result = "음수 입력...";
		break;
		case "ER0003" : result = "잔액 부족...";
		break;
		case "ER0004" : result = "이미 있는 아이디입니다.";
		break;
		case "ER0005" : result = "삭제할 수 없는 아이디 입니다.";
		break;
		case "ER0006" : result = "수정할 수 없는 아이디입니다.";
		break;
		case "ER1001" : result = "이미 있는 상품번호입니다.";
		break;
		case "ER1002" : result = "삭제할 수 없는 상품번호입니다.";
		break;
		case "ER1003" : result = "수정할 수 없는 상품번호입니다.";
		break;
		default : result = "고객센터에 문의하세요...";
		}
		return result;
	}
}
