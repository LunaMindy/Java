package ch04;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0 ; i < 3; i++) {
			System.out.print("입력 : ");
			String data = scanner.nextLine();
			System.out.println("출력 : "+data);
		}
		
	
	}
}
