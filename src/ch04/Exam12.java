package ch04;

import java.util.Scanner;

public class Exam12 {
	public static void main(String[] args) {
		//키보드로 입력한 내용을 받기 위해 Scanner 생성
		Scanner scanner = new Scanner(System.in); //Scanner 타입의 변수 scanner 선언
		
		//키보드에서 입력한 내용을 data 변수에 저장
		System.out.print("입력: ");
		String data = scanner.nextLine();
		
		//data 변수의 값을 출력
		System.out.println(data);
		
	}
}
