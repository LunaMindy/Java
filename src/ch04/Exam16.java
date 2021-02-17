package ch04;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자1 : ");
			//int num1 = Integer.parseInt(scanner.nextLine());
			double num1 = Double.parseDouble(scanner.nextLine());
			
			System.out.println("숫자2 : ");
			//int num2 = Integer.parseInt(scanner.nextLine());
			double num2 = Double.parseDouble(scanner.nextLine());
			
			//int result = num1+ num2;
			double result = num1+ num2;
			System.out.println("결과 : "+result);
			
			System.out.println("숫자3 : ");
			int num3 = Integer.parseInt(scanner.nextLine());
		}
	}
}
