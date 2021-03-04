package ch07.exam02;

public class Example {

	public static void main(String[] args) {
		Child child = new Child("길동"); //참조변수 선언 = 객체생성
		System.out.println(child.firstName);
		System.out.println(child.lastName);
		child.method1();
		child.method2();
		
	}

}
