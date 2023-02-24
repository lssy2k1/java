package ifcontrol;

public class P86 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "F";
		double sum = 90.0;
		
		System.out.println("start....");

		String findGender = gender.equals("M") ? "male..." : "female...";
			System.out.println(findGender);
//		if (gender.equals("M")) {
//			System.out.println("Male....");
//		}else {
//			System.out.println("Female....");
//		}
		
		grade = (sum >= 90.0) ? "VIP" : (sum >= 70.0) ? "GOLD" : "SILVER"; 
//		if (sum >= 90.0) {
//			grade = "VIP";
//		} else if (sum >= 70.0) {
//			grade = "GOLD";
//		} else {
//			grade = "SILVER";
//			}
		
		if (grade.equals("VIP")) {
			System.out.println("VIP 혜택....");
			//return;//문맥을 진행하다가 return을 만나면 끝내라는 의미.
					 //밑의 행위가 안일어남.(end....이 출력 안됨)
		}
		
		System.out.printf("%s, %s, %f\n",grade, gender, sum);
		System.out.println("end....");
	}

}
