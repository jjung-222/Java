package ch02;

public class Exam01 {

	public static void main(String[] args) {
		// = 은 오른쪽 상수를 왼쪽의 변수에 저장해라
		// 큰타입은 메모리를 잘 차지한다. 그래서 작은 크기 타입을 써야한다. 보통은 int 타입을 많이 사용
		
		// 정수 타입의 변수 선언과 저장
		// 왠만한 정수는 int
		byte var1 = 1; // byte타입의 변수 var1을 선언한다. var1에 1을 저장한다.
						// byte var1 = 1000;은 저장 불가, 범위 초과 (byte 저장범위: -128 ~ 127)
		short var2 = 1;
		int var3 = 1;
		long var4 = 20000000000000L; //int값을 초과하는 숫자를 쓸 때는 꼭 L을 적어주어야한다. 자바는 기본적으로 int타입으로 숫자 인지
		
		//문자 타입의 변수 선언과 값 저장
		//왜 정수? 문자가 숫자랑 매핑되어있어서
		char var9 = 65;
		char var10 = 'A';
		System.out.println("var9: " + var9);
		System.out.println("var10: " + var10);
		
		// 실수 타입의 변수 선언과 값 저장
		//왠만한 실수 double로 저장
		float var5 = 0.123456789123456789f; 
		double var6 = 0.123456789123456789;
		System.out.println("var5: " + var5); //""안에 문장 출력 + 변수 안의 값 출력
		System.out.println("var6: " + var6); //var5는 반올림
		
		// 논리 타입의 변수 선언과 값 저장
		boolean var7 = true;
		boolean var8 = false;
		
//		int var9;
//		var9 = 2; // int var9 = 2; 랑 같은 뜻
		//변수를 선언해야 변수를 사용할 수 있다.
		
	}

}
