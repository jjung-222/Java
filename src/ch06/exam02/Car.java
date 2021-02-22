package ch06.exam02;

public class Car {
	//Field
	
	String company;
	String model;
	int price;
	boolean old;	
	int speed;
	
	//Constructor
	Car(){ //기본생성자라고 불림. Example에서 만든 new Car가 이것을 실행하라는 ㅇ얘기
		System.out.println("객체 생성됨");
	}
}
