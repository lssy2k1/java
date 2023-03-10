package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	private HashSet<Integer> winningNum;
	private double prizeMoney;
	
	public double getPrizeMoney() {
		return prizeMoney;
	}
	public Lotto() {
		winningNum = new HashSet<Integer>();
	}
	public void makeWinningNumberMoney() {
		//번호 생성, 당첨금 생성
		Random r  = new Random();
		prizeMoney = r.nextInt(2000000000) + 1;
		while (winningNum.size() < 3) {
			winningNum.add(r.nextInt(25) + 1);
		}
		System.out.println(prizeMoney);
		System.out.println(winningNum.toString());
	}
	//생성자 안에 넣어서 class를 호출하면 실행되게 할 수도 있다.
	//그러나 게임을 여러번 하고 싶을 경우를 위해 함수호출을 생성자가 아닌
	//따로 호출하게 밖으로 뺐다.
	public int checkRanking(ArrayList<Integer> myNum) throws Exception {
		int grade = 0;
		int cnt = 0;
		// 5 7 9
		for(int num : myNum) {
			// 5 7 10
			for(int prizeNum : winningNum) {
				if (num == prizeNum) {
					cnt++;					
				};

			}
		}
		switch (cnt) {
		case 3 : grade = 1; break;
		case 2 : grade = 2; break;
		case 1 : grade = 3; break;
		default : throw new Exception("꽝");
		}
		return grade;
	}
	
	public double prizeMoney(int grade) {
		double pMoney = 0.0;
		switch(grade) {
		case 1 : pMoney = prizeMoney * 0.7; break;
		case 2 : pMoney = prizeMoney * 0.2; break;
		case 3 : pMoney = prizeMoney * 0.1; break;
		default : pMoney = 0.0;
		}
		return pMoney;
	}
}
