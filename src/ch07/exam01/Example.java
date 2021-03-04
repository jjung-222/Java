package ch07.exam01;

public class Example {

	public static void main(String[] args) {
		Child child = new Child(); //참조변수 선언 = 객체생성
		child.field1 = 10;
		child.field2 = 20;
		child.method1();
		child.method2();
	}

}
