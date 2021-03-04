package ch06.exam11;

public class User { //라이브러리형 클래스
	//객체 안 3가지
	//Field _ 데이터
	String id; //인스턴스 필드를 선언한다. 객체안에 들어갈 것들
	String name;
	String password;
	static String nation = "한국"; //값이 바꾸지 않음 (정적 _ static :객체를 만들지 않아도 사용할 수 있는)
	
	//Constructor _ 인스턴스 멤버 될 수 없음
	User(String name){
		this.name = name;
	}
	
	//Method
	static void info() { //객체없이 사용할 수 있는 메소드
		//name = "홍길동"; _ 사용할 수 없음 객체를 사용해야하는 것은 올 수 없음.
		//this. 도 사용 불가
		//nation은 사용 가능 _ static이니까
		
		System.out.println("모든 User는 한국인 입니다");
	}
	
	void login() { //객체가 있어야 쓸수 있다. name은 객체 안에 필드.
		System.out.println(name + "님이 로그인 합니다");
	}
	
	void logout() {
		System.out.println(name + "님이 로그아웃합니다.");
	}
}
