package ifcontrol;

public class P84 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "F";
		double sum = 90.0;
		
		System.out.println("start....");
		
		if (gender.equals("M")) {
			System.out.println("Male....");
		}else {
			System.out.println("Female....");
		}
		
		if (gender.equals("M")) {
			if (sum >= 90) {
				grade = "MVIP";
			}else if (sum >= 80) {
				grade = "MGOLD";
			}else {
				grade = "MNORMAL";
			}
		}else {
			if (sum >= 90) {
				grade = "FVIP";
			}else if (sum >= 80) {
				grade = "FGOLD";
			}else {
				grade = "FNORMAL";
			}
		}
		
		switch (grade) {//switch문의 조건식 결과는 정수 또는 문자열이어야만 한다.
		case "FVIP" ://case문의 값은 정수, 상수, 문자열만 가능. 실수 불가능.
			sum += 100;
			break;//break를 쓰지 않으면 FVIP의 경우 100 90 100 90 10을 전부 더해버리게 된다.
		case "FGOLD" :
			sum += 90;
			break;
		case "MVIP" :
			sum += 100;
			break;
		case "MGOLD" :
			sum += 90;
			break;
		default :
			sum += 10;
		}
		
//		case "FVIP" ://이러한 방식으로 코드를 짜면 줄일 수 있다. FVIP와 MVIP면 100을 받고 break
//		case "MVIP" :
//			sum += 100;
//			break;
		
		//관리자 권한을 부여할 경우, break를 사용하지 않고
		//super관리자는 위부터 권한을 다 갖고, 중간관리자는 중간부터 권한을 아래까지 다 갖고 이런식으로 코딩.(이 경우 if문으로 짜기 어려움)
		
		System.out.printf("%s, %s, %f\n",grade, gender, sum);
		System.out.println("end....");
	}

}
