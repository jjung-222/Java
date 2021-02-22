package ch05;

public class Exam08 {
	public static void main(String[] args) {
		int[][] scores = {
				{10, 20},
				{15, 25, 35},
				{45, 55, 65, 75}
		};
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores[2].length);
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			int[] ban = scores[i];
			for(int j=0; j<ban.length; j++) { //고정횟수가 없다.
				sum += ban[j];
			}
		}
		double avg = (double) sum / (scores[0].length 
							+ scores[1].length
							+ scores[2].length);
		System.out.println("avg: " + avg);
	}
}
