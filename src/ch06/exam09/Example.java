package ch06.exam09;

public class Example {

	public static void main(String[] args) {
		
		//new
		//new Calculator(); //생성자 new는 생성 번지를 전달
		Calculator myCalc = new Calculator();
		
		//int result1 = myCalc.area(10); //첫번째 메소드
		double result1 = myCalc.area(10);
		double result2 = myCalc.area(10, 30);


	}

}
