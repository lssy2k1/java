package ws0307;

public class EnoughException extends Exception{
	public EnoughException() {
	
	};
	public EnoughException(String msgcode) {
		super(msgcode);//조상클래스 throwable에 있음.
	}
	
}
