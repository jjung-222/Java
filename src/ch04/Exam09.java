package ch04;

public class Exam09 { //Ŭ���� �̸� = �����̸�

	public static void main(String[] args) {
		boolean stop = false;
		int count = 0;
		
		do { //���ѷ���
			System.out.println("Hello");
			count++;
			if(count>10) {
				stop = true;
			}	
		} while(!stop);	
		System.out.println();
		
		count = 0;
		do { //���ѷ���
			System.out.println("Hello");
			count++;
			} while(count <= 10);
		
		}
	
}
