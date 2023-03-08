package bank;

public class Atm {

	public static void main(String[] args) {
		Account acc1 = null;
		try {
			acc1 = new Account(900);
			System.out.println(acc1);
			acc1.withdraw(1000);
		} catch (Exception e) {
			//System.out.println("고객센터에 문의하세요 "+ e.getMessage());//오류발생 메세지를 출력해줌.
			System.out.println(Makemessage.makeMessage(e.getMessage()));
			System.out.println(e.getMessage());
		}
	}
	
}
