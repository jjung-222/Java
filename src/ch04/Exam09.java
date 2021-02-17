package ch04;

public class Exam09 { //클래스 이름 = 파일이름

	public static void main(String[] args) {
		boolean stop = false;
		int count = 0;
		
		do { //무한루프
			System.out.println("Hello");
			count++;
			if(count>10) {
				stop = true;
			}	
		} while(!stop);	
		System.out.println();
		
		count = 0;
		do { //무한루프
			System.out.println("Hello");
			count++;
			} while(count <= 10);
		
		}
	
}
