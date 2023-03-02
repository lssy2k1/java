package bank;

import java.util.Calendar;

public class MakeAccountNumber {
	public static String makeAccNum() {//static : 이러한 함수의 기능만 사용할거야! 그럼 객체 생성 없이 사용 가능!
		String accNum = "";
		Calendar cal = Calendar.getInstance();
		accNum = ""+ cal.get(Calendar.YEAR)
				   + (cal.get(Calendar.MONTH) + 1)
				   + cal.get(Calendar.DAY_OF_MONTH)
				   + cal.get(Calendar.MILLISECOND);
		return accNum;
	}
	
}
