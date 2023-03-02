package ws0302;

public class App {

	public static void main(String[] args) {
		Account account[] = new Account[6];
		account[0] = new Account("james1", 13500, 0.35, "VIP");
		account[1] = new Account("james2", 79000, 0.45, "GOLD");
		account[2] = new Account("james3", 33000, 0.55, "SIVER");
		account[3] = new Account("james4", 10770, 0.15, "GOLD");
		account[4] = new Account("james5", 18000, 0.28, "SIVER");
		account[5] = new Account("james6", 90000, 0.31, "VIP");
		
		for (Account acc : account) {
			System.out.println(acc);
			System.out.printf("계좌 잔액 : %4.1f\t",acc.getBalance());
			System.out.printf("이자 금액 : %4.1f\n", acc.getInterest());
		}
		double sum = 0.0;
		double interestSum = 0.0;
		double vipSum = 0.0;
		double vipAvg = 0.0;
		int cnt = 0;
		
		for (int i = 0 ; i < account.length ; i++) {
			sum += account[i].getBalance();
			interestSum += account[i].getInterest();
			if (account[i].getGrade().equals("VIP")) {
				vipSum += account[i].getBalance();
				cnt++;
			}
		}
		vipAvg = (vipSum * 1.0) / cnt;
		System.out.printf("모든고객 잔액의 합 : %4.1f, 모든고객 이자의 합 : %4.1f\n",sum, interestSum);
		System.out.printf("VIP고객 잔액의 합 : %4.1f, VIP고객 잔액의 평균 : %4.1f\n",vipSum, vipAvg);
	}

}
