package remote;

public class Human {

	public static void main(String[] args) {
		//Remote remote = null;//여기 뭐가 탑재되는지에 따라서 tv를 킬수도 있고, 오디오를 킬수도 있다. 다형성 구현 가능
		Remote remote = new Tv();// Tv를 킬수도 있고 Audio를 킬수도 있다.
		//Remote remote = new Audio();// 일일히 바꿔줘야 하잖아요 -> spring에서 바꾸는 것 구현 가능.
		remote.turnOff();
		remote.turnOn();
	}

}
