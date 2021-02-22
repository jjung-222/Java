package ch05;

public class Exam07 {
	public static void main(String[] args) {
		//.은 이것이 가르키는 위치로 가서 
		int[] scores = {90, 85, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		double avg = sum / scores.length;
		System.out.println("평균: " + avg);
		
	}
}
