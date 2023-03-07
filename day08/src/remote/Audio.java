package remote;

public class Audio implements Remote{

	@Override
	public void turnOn() {
		System.out.println("turn on audio");			
	}

	@Override
	public void turnOff() {
		System.out.println("turn off audio");	
	}

}
