package ch05;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		//변수를 선언하면서 값ㅅ 목록을 제공할 경우
		int[] scores1 = {90, 85, 95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		
		//변수를 선언한 후 값 목록을 제공할 경우
		int[] scores2 = null;
		scores2 = new int[] {60, 75,55};
		
		//메소드 호출
		add(scores1); //call by reference
		add1(10); //call by value  값을 전달하며 호출
		add(new int[] {100, 200, 300});
	}
	
	//메소드 선언
	public static void add(int[] arr) { //arr 안에는 번지
		System.out.println("값: " + Arrays.toString(arr));
	}
	public static void add1(int value) { //value 안에는 값
		System.out.println("값: " + value);
	}
}
