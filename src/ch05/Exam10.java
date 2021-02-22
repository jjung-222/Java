package ch05;

public class Exam10 {

	public static void main(String[] args) {
		int[] scores1 = {85, 90, 95};
		int[] scores2 = new int[scores1.length + 2];
		
		System.arraycopy(scores1, 0, scores2, 0, scores1.length); 
		// 이 메소드를 내가 호출하겠다
		// scores1[1]부터 복사하고 싶다 ->> System.arraycopy(scores1, 0, scores2, 2, scores1.length);
		
		for(int i=0; i<scores2.length; i++) {
			System.out.print(scores2[i] + ",");
		}
	}

}
