package ch04;

public class Exam08 { //클래스 이름 = 파일이름

	public static void main(String[] args) {
		boolean stop = false;
		int count = 0;
		
		while(!stop) { //무한루프
			System.out.println("Hello");
			count++;
			if(count>10) {
				stop = true;
			}	
		}	
		System.out.println();
		
		count = 0;
		while(count <= 10 ) { //무한루프
			System.out.println("Hello");
			count++;
			}
		
		}
}
