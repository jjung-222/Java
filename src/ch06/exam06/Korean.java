package ch06.exam06;

public class Korean {
	//Field
	String nation = "한국";
	String name;
	String ssn;
	int age;
	
	//Constructor Overloading
	Korean(){ //this 객체가 스스로를 가르킬때
		this("아무개", "000000-00000000", 1);
	}
	
	Korean(String name){
		this(name, "000000-0000000", 1);
	}
	
	//오버로딩: 같은 이름 다른 함수 매개 변수도 같음
	Korean(String name, String ssn){
		this(name, ssn, 1);
	}
	
	Korean(String ssn,String name, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
}
