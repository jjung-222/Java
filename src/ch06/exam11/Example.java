package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		User user = new User("홍길동");	//if) new User가 null이면 널포인트 익셉션	
		
		//인스턴스 멤버(필드, 메소드)는 반드시 객체 참조 변수를 통해서 접근
		
		System.out.println(user.name);
		user.login();
		user.logout();
		
		//정적~~~~
	}

}
