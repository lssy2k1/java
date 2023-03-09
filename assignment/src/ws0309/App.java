package ws0309;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Lotto lt = new Lotto();
		lt.makeWinningNumberMoney();
		ArrayList<Integer> myNum = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 세 개를 입력하세요(1-25사이)");
		while(myNum.size() < 3) {
			int num = sc.nextInt();
			if (num > 25 || num <= 0) {
				System.out.println("오류");
				sc.close();
			}
			myNum.add(num);
		}
		
		int grade = lt.checkRanking(myNum);
		lt.prizeMoney(grade);
		sc.close();
	}

}
