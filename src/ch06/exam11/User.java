package ch06.exam11;

public class User { //���̺귯���� Ŭ����
	//��ü �� 3����
	//Field _ ������
	String id; //�ν��Ͻ� �ʵ带 �����Ѵ�. ��ü�ȿ� �� �͵�
	String name;
	String password;
	static String nation = "�ѱ�"; //���� �ٲ��� ���� (���� _ static :��ü�� ������ �ʾƵ� ����� �� �ִ�)
	
	//Constructor _ �ν��Ͻ� ��� �� �� ����
	User(String name){
		this.name = name;
	}
	
	//Method
	static void info() { //��ü���� ����� �� �ִ� �޼ҵ�
		//name = "ȫ�浿"; _ ����� �� ���� ��ü�� ����ؾ��ϴ� ���� �� �� ����.
		//this. �� ��� �Ұ�
		//nation�� ��� ���� _ static�̴ϱ�
		
		System.out.println("��� User�� �ѱ��� �Դϴ�");
	}
	
	void login() { //��ü�� �־�� ���� �ִ�. name�� ��ü �ȿ� �ʵ�.
		System.out.println(name + "���� �α��� �մϴ�");
	}
	
	void logout() {
		System.out.println(name + "���� �α׾ƿ��մϴ�.");
	}
}
