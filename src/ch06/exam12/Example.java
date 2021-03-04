package ch06.exam12;

public class Example {

	public static void main(String[] args) { //실행 클래스
		//올바른 사용 방법
		System.out.println(Calculator.pi);
		Calculator.plus(3, 5);
		
		//잘못된 사용 방법
		Calculator myCalc = new Calculator();
		System.out.println(myCalc.pi); //밑줄 에러 static인데 객체 접근 했다고 워닝
		myCalc.plus(3, 5);
	}

}
