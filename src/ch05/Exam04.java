package ch05;

public class Exam04 {

	public static void main(String[] args) {
		int[] arr1 = new int[3]; //int값이 3개가 들어갈 수 있는 배열을 만들겠다
		//int 타입의 배역 arr1을 선언한다.
		
		for(int i=0; i<arr1.length; i++) { //배열 arr1이 가르키는 번지로 가서 길이(갯수)를 조사해라 
			System.out.println(arr1[i]);
		}
		
		double[] arr2 = new double[3]; 
		for(int i=0; i<arr2.length; i++) { //배열 arr1이 가르키는 번지로 가서 길이(갯수)를 조사해라 
			System.out.println(arr2[i]);
		}
		
		boolean[] arr3 = new boolean[3]; 
		for(int i=0; i<arr3.length; i++) { //배열 arr1이 가르키는 번지로 가서 길이(갯수)를 조사해라 
			System.out.println(arr3[i]);
		}
		
		String[] arr4 = new String[3]; 
		for(int i=0; i<arr4.length; i++) { //배열 arr1이 가르키는 번지로 가서 길이(갯수)를 조사해라 
			System.out.println(arr4[i]);
		}
	}

}
