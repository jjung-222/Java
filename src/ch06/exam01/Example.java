package ch06.exam01;

public class Example {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(); //.class가 사용된거 하나의 클래스로 두개의 객체를 만든것
		Student s3 = s1;
		
		//참조변수는 번지 비교
		//번지가 같다 같은 객체 참조
		if(s1==s2) { // new 2개 다른객체
			System.out.println("같은 객체");
		} else {
			System.out.println("다른객체");
		}
		
		if(s1==s3) { // new 2개 다른객체
			System.out.println("같은 객체");
		} else {
			System.out.println("다른객체");
		}
	}

}
