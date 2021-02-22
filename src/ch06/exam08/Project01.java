package ch06.exam08;

import java.util.Scanner;

public class Project01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[][] boardArray = new String[100][5];

		boolean run = true;
		boolean auto = false;

		int idx = 1; //글 등록시 부여되는 번호
		
		int num;


		while(run){

			if(auto == true) {
				num = 1;
			}else {
				System.out.println();
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("1.목록 | 2.생성(Create) | 3.읽기(Read) | 4.수정(Update) | 5.삭제(Delete) | 6.종료");
				System.out.println("--------------------------------------------------------------------------");
				System.out.print("메뉴 선택 : ");

				num = Integer.parseInt(input.next());
			}

			if(num == 1) {
				System.out.println("----------------------------------------------------------------");
				System.out.println("번호	제목		내용		글쓴이		조회수");
				System.out.println("---------------------------------------------------------------");
				
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0] == null) {
						break;
					}
					for(int j=0; j<i; j++) {
						if(Integer.parseInt(boardArray[i][0]) > Integer.parseInt(boardArray[j][0])) {
							String temp = boardArray[i][0];
							boardArray[i][0] = boardArray[j][0];
							boardArray[j][0] = temp;
							
							temp = boardArray[i][1];
							boardArray[i][1] = boardArray[j][1];
							boardArray[j][1] = temp;
							
							temp = boardArray[i][2];
							boardArray[i][2] = boardArray[j][2];
							boardArray[j][2] = temp;
							
							temp = boardArray[i][3];
							boardArray[i][3] = boardArray[j][3];
							boardArray[j][3] = temp;
							
							temp = boardArray[i][4];
							boardArray[i][4] = boardArray[j][4];
							boardArray[j][4] = temp;
						}
					}
				}
				
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						System.out.println(boardArray[i][0] + "\t" +
								boardArray[i][1] + "\t\t" +
								boardArray[i][2] + "\t\t" +
								boardArray[i][3] + "\t\t" +
								boardArray[i][4]);
					}
				}
				
				auto = false;

			}else if(num == 2) {
				input.nextLine();
				
				System.out.print("제목 : ");
				String title = input.nextLine();

				System.out.print("내용 : ");
				String content = input.nextLine();

				System.out.print("글쓴이 : ");
				String writer = input.nextLine();


				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0] == null) {
						boardArray[i][0] = String.valueOf(idx);
						boardArray[i][1] = title;
						boardArray[i][2] = content;
						boardArray[i][3] = writer;
						boardArray[i][4] = String.valueOf(0);
						idx++; //번호 증가
						break;
					}
				}


				auto = true;

			}else if(num == 3) {
				input.nextLine();

				System.out.print("번호 : ");
				String inputNum = input.nextLine();

				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0].equals(inputNum)) {
						System.out.println("제목 : " + boardArray[i][1]);
						System.out.println("내용 : " + boardArray[i][2]);
						System.out.println("글쓴이 : " + boardArray[i][3]);
						boardArray[i][4] = String.valueOf(Integer.parseInt(boardArray[i][4])+1);
						System.out.println("조회 수 : " + boardArray[i][4]);

						break;
					}
				}

			}else if(num == 4) {
				input.nextLine();

				System.out.print("번호 : ");
				String inputNum = input.nextLine();

				String updateTitle;
				String updateContent;

				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0].equals(inputNum)) {
						System.out.println("기존 제목 : " + boardArray[i][1]);
						System.out.print("수정 제목 : ");
						updateTitle = input.nextLine();
						System.out.print("수정 내용 : ");
						updateContent = input.nextLine();

						if(updateTitle.length() != 0) {
							boardArray[i][1] = updateTitle;
						}
						if(updateContent.length() != 0) {
							boardArray[i][2] = updateContent;
						}

						break;
					}
				}

				auto = true;

			}else if(num == 5) {
				input.nextLine();

				System.out.print("번호 : ");
				String inputNum = input.nextLine();
				
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0] == null) {
						continue;
					}
					if(boardArray[i][0].equals(inputNum)) {
						for(int j=0; j<5; j++) {
							boardArray[i][j] = null;
						}
						auto = true;
						break;
					}
				}
			}else {
				run = false;
			}
		}


	}

}
