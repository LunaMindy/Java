package ch04homeworkTest;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;

		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			
			int n = scanner.nextInt();
			int m = 0;
			
			if( n == 1 ){
				System.out.print("예금액> ");
				m = scanner.nextInt();
				balance += m;
			}
			else if( n == 2){
				System.out.print("출금액> ");
				m = scanner.nextInt();
				balance -= m;
			}
			else if( n == 3){
				System.out.print("잔고> ");
				System.out.println(balance);
			}
			else break;		
		}
		System.out.println("프로그램 종료");
	}

}
