package ch06.exam13;

public class Singleton { //��ü�� �ϳ��̴� = single
//	static int method1() { //�� �޼ҵ� ȣ���ϸ� 1�� return �ȴ�.
//		return 1;
//	}
//	
//	static String method2() {
//		return "�ڹ�";
//	}
//	
//	static int[] method3() {
//		int[] arr = {10, 20, 30};
//		return arr;
//	}
	
	//Field
	private static Singleton singleton = new Singleton(); //��ü����� �ּ� ����
	//static ������ �ν��Ͻ� ������ �Ǽ� ��ü ����ؾ���
	
	//Constructor
	private Singleton() {
		
	}
	
	//Method
	static Singleton getInstance() {
		Singleton s = new Singleton();
		return singleton;
		
	}
}
