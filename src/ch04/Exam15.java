package ch04;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력 : ");
			String data = scanner.nextLine();
			System.out.println("출력 : "+data);
			
			//멈춤 조건
			if(data.equals("점심시간")) { //문자열 비교 5장 11장
				break;
			}
		}
	}
}
