package ch08.exam02;

public class Example {
	
	public static void method(RemoteControl rc) { //static �Ⱦ��� �ν��Ͻ� �޼ҵ尡 ��. �׷��� ��ü������ e.method();
		//�������̽��� �����θ� ����ϴ� �ڵ�
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}
	
	public static void main(String[] args) {
		RemoteControl rc = new Television(); 
		//RemoteControl��� rc�� ������ ���� Television�� ����Ϸ��Ѵ�
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		method(new Television());
		method(new Audio());
	}

}
