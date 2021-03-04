package ch06.exam13;

public class Singleton { //객체가 하나이다 = single
//	static int method1() { //이 메소드 호출하면 1이 return 된다.
//		return 1;
//	}
//	
//	static String method2() {
//		return "자바";
//	}
//	
//	static int[] method3() {
//		int[] arr = {10, 20, 30};
//		return arr;
//	}
	
	//Field
	private static Singleton singleton = new Singleton(); //객체만들어 주소 대입
	//static 없으면 인스턴스 변수가 되서 객체 사용해야함
	
	//Constructor
	private Singleton() {
		
	}
	
	//Method
	static Singleton getInstance() {
		Singleton s = new Singleton();
		return singleton;
		
	}
}
