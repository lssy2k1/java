package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	private HashSet<Integer> winningNum = new HashSet<Integer>();
	private double prizeMoney;
	
	public void makeWinningNumberMoney() {
		Random r = new Random();
		while (winningNum.size() < 3) {
			winningNum.add(r.nextInt(25) + 1);
		}
		prizeMoney = (r.nextDouble() * 2000000000) + 1;
		System.out.printf("정답 : %s, 상금 : %10.2f\n", winningNum, prizeMoney);
	}
	
	public int checkRanking(ArrayList<Integer> myNum) throws Exception {
		int cnt = 0;
		int grade = 0;
		for (int num : myNum) {
			if(winningNum.contains(num) == true) {
				cnt ++;
			}
		}
		if (cnt == 3) {
			grade = 1;
		}
		if (cnt == 2) {
			grade = 2;
		}
		if (cnt == 1) {
			grade = 3;
		}
		if (cnt != 3 || cnt !=2 || cnt!=1) {
			throw new Exception("꽝");
		}
		return grade;
	}

	public double prizeMoney(int grade) {
		double result = 0.0;
		switch (grade) {
		case 1 :
			result = prizeMoney * 0.7;
			System.out.printf("%d등! %10.2f원 당첨", grade, result);
			return result;
		case 2 :
			result = prizeMoney * 0.2;
			System.out.printf("%d등! %10.2f원 당첨", grade, result);
			return result;
		case 3 :
			result = prizeMoney * 0.1;
			System.out.printf("%d등! %10.2f원 당첨", grade, result);
			return result;
		default :
			result = 0.0;
			//System.out.println("꽝");
			return result;
		}
	}
}
