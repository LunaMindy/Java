package ch06.exam08;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		String[][] boardArray = new String[100][5];
		boardArray[0][0] = "1"; boardArray[0][1] = "����1"; boardArray[0][2] = "����1"; boardArray[0][3] = "�۾���1"; boardArray[0][4] = "0"; 
		boardArray[1][0] = "2"; boardArray[1][1] = "����2"; boardArray[1][2] = "����2"; boardArray[1][3] = "�۾���2"; boardArray[1][4] = "2"; 
		boardArray[2][0] = "3"; boardArray[2][1] = "����3"; boardArray[2][2] = "����3"; boardArray[2][3] = "�۾���3"; boardArray[2][4] = "0"; 
				
				
		int listNum;
		String title;
		String content;
		String name;
		int readNum;
		
		boolean run = true;
	
		Scanner scan = new Scanner(System.in);

		while(run){
			System.out.println("---------------------------------------------------");
			System.out.println("1.���   |2.����   |3.�б�   |4.����   |5.����   |6.����");
			System.out.println("---------------------------------------------------");
			System.out.print("����> ");

			int selectNo = Integer.parseInt(scan.nextLine());

			if(selectNo == 1){
				System.out.println("1.���> ");
				System.out.println("---------------------------------------------------");
				System.out.println("��ȣ    ����    ����    �۾���    ��ȸ��");
				System.out.println("---------------------------------------------------");
				for(int i = 0; i<boardArray.length; i++) {
					for(int j = 0; j<boardArray[i].length; j++) {
						System.out.print(boardArray[i][j]);
						System.out.print("\t");
					}
					System.out.println();
				}
			}else if(selectNo == 2) {
				System.out.println("2.����> ");
				System.out.print("������ �� ");
				int n = Integer.parseInt(scan.nextLine());
					for(int i = 0; i < n; i++)
					{
						System.out.println("enter the number " + i + 1);
		                int j = 0;
						while(boardArray[i][3] != null) {
							System.out.print("���� : ");
							boardArray[i][1] = scan.nextLine();
							System.out.print("���� : ");
							boardArray[i][2] = scan.nextLine();
							System.out.print("�۾��� : ");
							boardArray[i][3] = scan.nextLine();
							break;
					}
				
				}
				
			}
				
		//System.out.println("���α׷� ����");

		}
	}
}