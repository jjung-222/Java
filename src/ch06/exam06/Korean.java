package ch06.exam06;

public class Korean {
	//Field
	String nation = "�ѱ�";
	String name;
	String ssn;
	int age;
	
	//Constructor Overloading
	Korean(){ //this ��ü�� �����θ� ����ų��
		this("�ƹ���", "000000-00000000", 1);
	}
	
	Korean(String name){
		this(name, "000000-0000000", 1);
	}
	
	//�����ε�: ���� �̸� �ٸ� �Լ� �Ű� ������ ����
	Korean(String name, String ssn){
		this(name, ssn, 1);
	}
	
	Korean(String ssn,String name, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
}
