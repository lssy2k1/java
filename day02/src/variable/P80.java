package variable;

public class P80 {

	public static void main(String[] args) {

		int credit = 900;
		String grade = (credit >= 800) ? "High" : "Low";//P79를 삼항연산자로 바꿈. 긴 코드를 짧게 할 수 있음.
		System.out.println(grade);
	}

}
