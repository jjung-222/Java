package ch06.exam09;

public class Calculator { // 이것은 설계도라 객체를 만들어 줘야함
	//Field
	//Constructor
	//Method
	
	//사각형 면적
	double area(double w) {
		return w * w;
	}
	double area(double w, double h) {
		return w * h;
	}
	
	//원의 면적
//	double area(double r) { //오버로딩 x   IF) int일 경우는 가능
//		
//	}
	double areaCircle(double r) {
		return r * r * Math.PI;
	}
}
