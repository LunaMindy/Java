package ch05;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {
		//변수를 선언하면서 값 목록을 제공할 경우
		int[] scores1 = {90, 85, 95};
		int[] scores2 = {90, 85, 95};
		int[] scores3 = scores1;
		
		System.out.println(scores1 == scores2);
		System.out.println(scores1 == scores3);
		
	}
		
}
