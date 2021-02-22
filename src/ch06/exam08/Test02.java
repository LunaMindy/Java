package ch06.exam08;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		String[][] boardArray = new String[100][5];
				
		int listNum;
		String title;
		String content;
		String writer;
		int readNum;
		
		boolean run = true;
	
		Scanner scan = new Scanner(System.in);

		while(run){
			System.out.println("---------------------------------------------------");
			System.out.println("1.���   |2.����   |3.�б�   |4.����   |5.����   |6.����");
			System.out.println("---------------------------------------------------");
			System.out.print("����> ");

			int selectNo = Integer.parseInt(scan.nextLine());

			switch (selectNo){
			case 1:
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
				continue;
				
			case 2:
				System.out.println("2.����> ");
			
				System.out.print("���� : ");
				title = scan.nextLine();
				System.out.print("���� : ");
				content = scan.nextLine();
				System.out.print("�۾��� : ");
				writer = scan.nextLine();
				
				for(int i =0;i<boardArray.length;i++) {
					if(boardArray[i][0] == null) {
					boardArray[i][0] = "1";
					boardArray[i][1] = title;
					boardArray[i][2] = content;
					boardArray[i][3] = writer;
					boardArray[i][4] = "0";
					break;
					}
				}
				System.out.println("���� : "+title+"\n���� : "+content+"\n�۾��� : "+writer);
				
				continue;
				
				
			case 3:	
				System.out.println("3.�б�> ");
				System.out.println("�۹�ȣ�� �Է��ϼ��� : ");
				listNum = Integer.parseInt(scan.nextLine());
			
				
					for (int i = 0; i < boardArray.length; i++) {
						if (listNum == Integer.parseInt(boardArray[i][0])) {
							readNum = Integer.parseInt(boardArray[i][4]) + 1;
							boardArray[i][4] = Integer.toString(readNum);
							System.out.println("����: " + boardArray[i][1]);
							System.out.println("����: " + boardArray[i][2]);
							System.out.println("�۾���: " + boardArray[i][3]);
							System.out.println("��ȸ��: " + readNum);
						}
					}
				
				
				
			case 4:
				System.out.println("4.����>");
				System.out.println("�۹�ȣ�� �Է��ϼ��� : ");
				listNum = Integer.parseInt(scan.nextLine());
				
				if (listNum <= boardArray.length) {
					for (int i = 0; i < boardArray.length; i++) {
						if (listNum == Integer.parseInt(boardArray[i][0])) {
						}
					}
				} else {
					System.out.println("������ �Խù��� �����ϴ�. �޴��� ���ư��ϴ�.");
				}
				continue;
				
			case 5:
				System.out.println("5.����>");
				System.out.println("�۹�ȣ�� �Է��ϼ��� : ");
				listNum = Integer.parseInt(scan.nextLine());
				
				if (listNum <= boardArray.length) {
					for (int i = 0; i < boardArray.length; i++) {
						if (listNum == Integer.parseInt(boardArray[i][0])) {
							
							boardArray[i][0] = null;
							boardArray[i][1] = null;
							boardArray[i][2] = null;
							boardArray[i][3] = null;
							boardArray[i][4] = null;
						}
					}
				} else {
					System.out.println("������ �Խù��� �����ϴ�. �޴��� ���ư��ϴ�.");
				}
				continue;
				

			case 6:
				System.out.println("6.���α׷��� ����");
				break;
		}
				
		}
	}
		
}