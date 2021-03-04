package ch08.exam02;

public class Example {
	
	public static void method(RemoteControl rc) { //static 안쓰면 인스턴스 메소드가 됨. 그러면 객체생성후 e.method();
		//인터페이스의 설명대로만 사용하는 코드
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}
	
	public static void main(String[] args) {
		RemoteControl rc = new Television(); 
		//RemoteControl라는 rc를 가지고 내가 Television을 사용하려한다
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		method(new Television());
		method(new Audio());
	}

}
