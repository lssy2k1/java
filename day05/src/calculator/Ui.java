package calculator;

public class Ui {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = 0;
		result = cal.sum(10, 20);
		System.out.println(result);
		cal.save(result);//save는 void니깐 화면에서 리턴받을 게 없다. 너는 저장 해 끝!
		System.out.println("OK");//하지만 이 코드는 문제가 생긴지 안생긴지를 모른다.
								 //문제가 발생했을 때 오류를 출력해주는 것을 '예외처리'라고 한다!
	}

}
