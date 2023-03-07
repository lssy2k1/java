package remote;

public class Tv implements Remote {

	@Override
	public void turnOn() {
		System.out.println("turn on tv");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off tv");
	}

}
