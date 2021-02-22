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
			System.out.println("1.목록   |2.생성   |3.읽기   |4.수정   |5.삭제   |6.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scan.nextLine());

			switch (selectNo){
			case 1:
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
				continue;
				
			case 2:
				System.out.println("2.생성> ");
			
				System.out.print("제목 : ");
				title = scan.nextLine();
				System.out.print("내용 : ");
				content = scan.nextLine();
				System.out.print("글쓴이 : ");
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
				System.out.println("제목 : "+title+"\n내용 : "+content+"\n글쓴이 : "+writer);
				
				continue;
				
				
			case 3:	
				System.out.println("3.읽기> ");
				System.out.println("글번호를 입력하세요 : ");
				listNum = Integer.parseInt(scan.nextLine());
			
				
					for (int i = 0; i < boardArray.length; i++) {
						if (listNum == Integer.parseInt(boardArray[i][0])) {
							readNum = Integer.parseInt(boardArray[i][4]) + 1;
							boardArray[i][4] = Integer.toString(readNum);
							System.out.println("제목: " + boardArray[i][1]);
							System.out.println("내용: " + boardArray[i][2]);
							System.out.println("글쓴이: " + boardArray[i][3]);
							System.out.println("조회수: " + readNum);
						}
					}
				
				
				
			case 4:
				System.out.println("4.수정>");
				System.out.println("글번호를 입력하세요 : ");
				listNum = Integer.parseInt(scan.nextLine());
				
				if (listNum <= boardArray.length) {
					for (int i = 0; i < boardArray.length; i++) {
						if (listNum == Integer.parseInt(boardArray[i][0])) {
						}
					}
				} else {
					System.out.println("수정할 게시물이 없습니다. 메뉴로 돌아갑니다.");
				}
				continue;
				
			case 5:
				System.out.println("5.삭제>");
				System.out.println("글번호를 입력하세요 : ");
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
					System.out.println("삭제할 게시물이 없습니다. 메뉴로 돌아갑니다.");
				}
				continue;
				

			case 6:
				System.out.println("6.프로그램을 종료");
				break;
		}
				
		}
	}
		
}
