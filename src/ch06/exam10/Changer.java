package ch06.exam10;

public class Changer {
	//Field
	//Constructor
	//Method
	
	void change(int v2) { //�ܺο��� ���� �ָ� ���� 2�� �ٲ���
		v2 = 2;
	}
	
	void change(String v4) { //����Ÿ��
		v4 = "B";		
	}
	
	void change(int[] arr4) { //�迭(���� Ÿ��)
		arr4[0] = 2;		
	}
	
	void change(String[] arr) { //�迭
		arr[0] = "B";		
	}
	
	void change(Member m2) {
		m2.age = 2;	 //m2�� �����ϴ� ��ü�� ���� 
	}
}
