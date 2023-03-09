package ws0307;

public class MinusException extends Exception{
	public MinusException() {
	
	};
	public MinusException(String msgcode) {
		super(msgcode);//조상클래스 throwable에 있음.
	}
	
}
