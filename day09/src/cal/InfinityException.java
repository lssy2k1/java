package cal;

public class InfinityException extends Exception{
	//java는 exception의 상속을 받아야 에러처리가 가능하다.
	public InfinityException() {
		
	}
	public InfinityException(String msgcode) {//에러코드를 보낼거다
		super(msgcode);
	}

}
