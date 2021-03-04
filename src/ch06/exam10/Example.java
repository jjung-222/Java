package ch06.exam10;

public class Example {

	public static void main(String[] args) { //객체는 모두 heap 영역에
		Changer changer = new Changer();
		
		//Call by Value(값을 복사해서 호출)
		int value = 1; //value = 1
		changer.change(value); //changer호출되서 changer 클래스로 들어가 값이 바뀜
		//int value = v1; 값 복사 다른변수
		System.out.println(value);
		
		//Call by Reference(번지를 복사해서 호출) 내부의 값을 바꿀수 없음(예외) 다른 것들은 값이 바뀜
		String v3 = "A";
		changer.change(v3); //참조형이라 heap에 A가 들어가고 v3에는 주소값이 들어감
		System.out.println(v3);
		
		// Call by Reference(번지를 복사해서 호출)
		int[] arr1 = {0, 0, 0};
		changer.change(arr1);
		System.out.println(arr1[0]);
		
		String[] arr3 = {"A", "B", "C"};
		changer.change(arr3);
		System.out.println(arr3[0]);
		
		Member m1 = new Member();
		System.out.println(m1.age); //Member클래스의 age값을 가져와서 1이 나옴
		changer.change(m1);
		System.out.println(m1.age);
			
		
	}

}
