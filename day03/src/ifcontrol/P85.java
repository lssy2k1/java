package ifcontrol;

public class P85 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 80.0;
		
		System.out.println("start....");
		
		if (gender.equals("M")) {
			System.out.println("Male....");
		}else {
			System.out.println("Female....");
		}
		
		if (sum >= 90.0) {
			grade = "VIP";
		} else if (sum >= 70.0) {
			grade = "GOLD";
		} else {
			grade = "SILVER";
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
