package ch9.exam03;

public class A {
	public void method(int x) {
		int y = 2;
		//x = 10;
		//y = 20;
		
		class B{
			public void method() { //로컬에서 매개변수나 변수를 사용하면 이미 초기화된 숫자로 써야함
				int result = x + y;
			}
		}
	}
}
