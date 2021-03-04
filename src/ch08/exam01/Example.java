package ch08.exam01;

public class Example {

	public static void main(String[] args) {
		RemoteControl rc = new Television(); 
		//RemoteControl라는 rc를 가지고 내가 Television을 사용하려한다
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}

}
