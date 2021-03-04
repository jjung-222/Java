package ch06.exam14;

public class Example {

	public static void main(String[] args) {
		//Korean.NATION = "한국"; //final로 한국이라 써서 다른 값 줄 수 없음. 만약 Korean 클래스에서 "한국"이라고 안 줬으면 가능
		System.out.println(Korean.NATION);
		
		Korean k1 = new Korean("123456-1234567"); //여기서 딱한번 ssn으로 전달해서 저장
		// k1.ssn = "664433-1111111"; (x)
		
		System.out.println(Math.PI);
		double area = 10 * 10 * Math.PI;
		
		
	}

}
