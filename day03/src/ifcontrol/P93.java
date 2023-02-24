package ifcontrol;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {
		// 숫자를 2자리수 4개 입력 받는다.
		// 만약 2자리수가 아니면 프로그램 종료.
		
		Scanner sc = new Scanner(System.in);//input을 받을건데 화면에서 입력을 받겠습니다.
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;
		
		System.out.println("국어성적 입력:");
		ko = Integer.parseInt(sc.next());//입력하기를 기다립니다. 입력을 하면 다음으로 넘어감.
		while (ko < 10 || ko > 100) {
			System.out.println("두 자리수로 다시 입력하세요.");
			ko = Integer.parseInt(sc.next());
		}
//		if (ko < 10 || ko > 100) {
//			System.out.println("프로그램을 종료합니다.");
//			sc.close();
//			return;
//		}
		System.out.println("영어성적 입력:");
		en = Integer.parseInt(sc.next());
		if (en < 10 || en > 100) {
			System.out.println("프로그램을 종료합니다.");
			sc.close();
			return;
		}
		System.out.println("수학성적 입력:");
		ma = Integer.parseInt(sc.next());
		if (ma < 10 || ma > 100) {
			System.out.println("프로그램을 종료합니다.");
			sc.close();
			return;
		}
		System.out.println("과학성적 입력:");
		si = Integer.parseInt(sc.next());
		if (si < 10 || si > 100) {
			System.out.println("프로그램을 종료합니다.");
			sc.close();
			return;
		}
		
		// 평균과 합계를 구합니다.

		//평균이 90이상이면 A
		//평균이 80이상이면 B
		//평균이 70이상이면 C
		//평균이 60이상이면 D
		//60미만이면 F
		
		double sum = 0;
		double avg = 0;
		String grade = "";

		sum = ko + en + ma + si;
		avg = sum / 4;
		
		if (avg >= 90) {
			grade = "A";
		}else if (avg >= 80) {
			grade = "B";
		}else if (avg >= 70) {
			grade = "C";
		}else if (avg >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}

		//합계, 평균, 학점을 출력 하시오
	
		System.out.printf("합계 : %.0f, 평균 : %.2f, 학점 : %s",sum, avg, grade);
		//나중엔 web application view에 출력시키게 된다.
		sc.close();
	}

}
