package ch06.exam05;

public class Korean {
	//Field
	String nation = "한국";
	String name;
	String ssn;
	int age;
	
	//Constructor
	Korean(){
		System.out.println("Korean() 실행");
	}
	
	Korean(String name){
		System.out.println("Korean(String name) 실행");
		this.name = name;
	}
	
	//오버로딩: 같은 이름 다른 함수 매개 변수도 같음
	Korean(String name, String ssn){
		System.out.println("Korean(String name, String ssn) 실행");
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String ssn,String name, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
}
