package ch05;

public class Exam05 {
	public static void main(String[] args) {
			
			//배열 생성
			int[] arr1 = new int[3]; 
			
			//배열 항목의 값을 읽고 출력
			for(int i=0; i<arr1.length; i++) { //배열 arr1이 가르키는 번지로 가서 길이(갯수)를 조사해라 
				System.out.println(arr1[i]);
			}
			
			//배열 항목의 값을 변경
			arr1[0] = 90;
			arr1[1] = 80;
			arr1[2] = 95;
			
			//배열  항목의 값을 읽고 출력
			for(int i=0; i<arr1.length; i++) { //배열 arr1이 가르키는 번지로 가서 길이(갯수)를 조사해라 
				System.out.println(arr1[i]);
			}
			
			//배열 항목 비교
			System.out.println(arr1[0] == 90);
			System.out.println(arr1[1] != 80);
		}

}
