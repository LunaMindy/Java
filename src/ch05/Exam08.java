package ch05;

public class Exam08 {

	public static void main(String[] args) {
		
		int[][] scores = {
				{10, 20}, 
				{15, 25, 35},
				{45, 55, 65, 75}
		};
		
		System.out.println(scores.length); //3
		System.out.println(scores[0].length); //2
		System.out.println(scores[1].length); //3
		System.out.println(scores[2].length); //4
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			int[] ban = scores[i]; //일차원 배열
			for(int k=0; k < ban.length; k++) {
				//int score = ban[k];
//				System.out.print(ban[k]+",");
				sum += ban[k];
			}
//			System.out.println();
			
			double avg = (double)sum / (scores[0].length + 
										scores[1].length+
										scores[2].length);
			System.out.println("avg : "+avg);
		}
	}
}