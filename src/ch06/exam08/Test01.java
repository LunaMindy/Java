package ch06.exam08;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		String[][] boardArray = new String[100][5];
		boardArray[0][0] = "1"; boardArray[0][1] = "제목1"; boardArray[0][2] = "내용1"; boardArray[0][3] = "글쓴이1"; boardArray[0][4] = "0"; 
		boardArray[1][0] = "2"; boardArray[1][1] = "제목2"; boardArray[1][2] = "내용2"; boardArray[1][3] = "글쓴이2"; boardArray[1][4] = "2"; 
		boardArray[2][0] = "3"; boardArray[2][1] = "제목3"; boardArray[2][2] = "내용3"; boardArray[2][3] = "글쓴이3"; boardArray[2][4] = "0"; 
				
				
		int listNum;
		String title;
		String content;
		String name;
		int readNum;
		
		boolean run = true;
	
		Scanner scan = new Scanner(System.in);

		while(run){
			System.out.println("---------------------------------------------------");
			System.out.println("1.목록   |2.생성   |3.읽기   |4.수정   |5.삭제   |6.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scan.nextLine());

			if(selectNo == 1){
				System.out.println("1.목록> ");
				System.out.println("---------------------------------------------------");
				System.out.println("번호    제목    내용    글쓴이    조회수");
				System.out.println("---------------------------------------------------");
				for(int i = 0; i<boardArray.length; i++) {
					for(int j = 0; j<boardArray[i].length; j++) {
						System.out.print(boardArray[i][j]);
						System.out.print("\t");
					}
					System.out.println();
				}
			}else if(selectNo == 2) {
				System.out.println("2.생성> ");
				System.out.print("생성할 수 ");
				int n = Integer.parseInt(scan.nextLine());
					for(int i = 0; i < n; i++)
					{
						System.out.println("enter the number " + i + 1);
		                int j = 0;
						while(boardArray[i][3] != null) {
							System.out.print("제목 : ");
							boardArray[i][1] = scan.nextLine();
							System.out.print("내용 : ");
							boardArray[i][2] = scan.nextLine();
							System.out.print("글쓴이 : ");
							boardArray[i][3] = scan.nextLine();
							break;
					}
				
				}
				
			}
				
		//System.out.println("프로그램 종료");

		}
	}
}
