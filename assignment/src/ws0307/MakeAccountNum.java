package ws0307;

import java.util.Calendar;
import java.util.Random;

public class MakeAccountNum {
	public static String makeAccountNum() {
		String accNum = null;
		Calendar cal = Calendar.getInstance();
		Random r = new Random();
		accNum ="" + (r.nextInt(10000000) + 1)
				   + cal.get(Calendar.MINUTE)
				   + cal.get(Calendar.YEAR);
		return accNum;
	}
}
