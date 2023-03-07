package cal;

public class Cal {
	public static double div(int a, int b) throws Exception{
		double result = 0.0;
		try {
			result =  a / b;
		}catch(ArithmeticException e) {
			throw e;
		}
			return result;

	}
	public static double div(double a, double b) throws InfinityException {
		double result = 0.0;
		if(b == 0.0) {//어떤 예외를 던져줘야해? 우리가 만들어야 해.
			throw new InfinityException("B0001");//우리가 에러를 만들어서 던졌다. 함수에도 던진다는 표시를 해야해.
			//throw와 throws는 항상 함께 쓴다.
			//에러를 던지면 아래 코드는 실행 안됨.
		}
		result =  a / b;
		return result;
	}
}
