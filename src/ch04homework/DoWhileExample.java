package ch04homework;

import java.util.Scanner;


public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		String inpuString;
		
		do {
			System.out.println(">");
			inpuString = scanner.nextLine();
			System.out.println(inpuString);
		}while( ! inpuString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");
		
	}
}