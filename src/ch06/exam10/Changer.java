package ch06.exam10;

public class Changer {
	//Field
	//Constructor
	//Method
	
	void change(int v2) { //외부에서 값을 주면 값을 2로 바꿔줌
		v2 = 2;
	}
	
	void change(String v4) { //참조타입
		v4 = "B";		
	}
	
	void change(int[] arr4) { //배열(참조 타입)
		arr4[0] = 2;		
	}
	
	void change(String[] arr) { //배열
		arr[0] = "B";		
	}
	
	void change(Member m2) {
		m2.age = 2;	 //m2가 참조하는 객체로 가서 
	}
}
