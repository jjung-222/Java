package ch06.exam05;

public class Korean {
	//Field
	String nation = "�ѱ�";
	String name;
	String ssn;
	int age;
	
	//Constructor
	Korean(){
		System.out.println("Korean() ����");
	}
	
	Korean(String name){
		System.out.println("Korean(String name) ����");
		this.name = name;
	}
	
	//�����ε�: ���� �̸� �ٸ� �Լ� �Ű� ������ ����
	Korean(String name, String ssn){
		System.out.println("Korean(String name, String ssn) ����");
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String ssn,String name, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
}
