package variable;

public class P79 {

	public static void main(String[] args) {
		//int a;
		//System.out.println(a);
		//변수를 선언하고 사용했는데 빨간줄이다? 지역변수 a가 초기화가 안되었다는 오류 발생.
		//수정을 누르면 int a; 에서 int a = 0;으로 변경시켜줌.
		
		int credit = 900;
		String grade = "";
		if (credit >= 800) {
			grade = "High";
		}else {
			grade = "Low";
		}
		System.out.println(grade);
	}

}
