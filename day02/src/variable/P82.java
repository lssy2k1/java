package variable;

public class P82 {

	public static void main(String[] args) {
		int score = 99;
		String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "F";
		System.out.println(grade);
	}

}
