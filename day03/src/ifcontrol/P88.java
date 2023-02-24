package ifcontrol;

public class P88 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 101.0;
		
		System.out.println("start....");
		
		if (gender.equals("M")) {
			System.out.println("Male....");
		}else {
			System.out.println("Female....");
		}
		
		if ((sum >= 95 && sum <= 100) || (sum >= 85 && sum <=90)) {//(95 <= sum && sum <= 100)이렇게 적어도 오류 없었음.
			grade = "VIP";
		}else if ((sum >= 75 && sum <= 80) || (sum >= 80 && sum <=65)) {
			grade = "GOLD";
		}else {
			grade = "NORMAL";
		}
		
		if (grade.equals("VIP")) {
			System.out.println("VIP 혜택....");
			//return;//문맥을 진행하다가 return을 만나면 끝내라는 의미.
					 //밑의 행위가 안일어남.(end....이 출력 안됨)
		}
		
		System.out.printf("%s, %s, %f\n",grade, gender, sum);
		System.out.println("end....");
	}

}
