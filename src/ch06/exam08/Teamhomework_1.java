package ch06.exam08;

import java.util.Scanner;

public class Teamhomework_1 {

	public static void main(String[] args) {
		String[][] board = new String[100][5];
		int view = 0, chosen = 0, readnum = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("----------------------------------------------------------------");
			System.out.println("1.목록|2.생성(Create)|읽기(Read)|4.수정(Update)|5.삭제(Delete)|6.종료");
			System.out.println("----------------------------------------------------------------");
			System.out.print("메뉴선택 : ");

			chosen = Integer.parseInt(scanner.nextLine());

			switch (chosen) {
			case 1:
				System.out.println("----------------------------------------------------------------");
				System.out.println("번호\t\t제목\t\t\t내용\t\t\t글쓴이\t\t조회수");
				System.out.println("----------------------------------------------------------------");

				// 번호 재정렬
				for (int i = board.length; i >= 0; i--) {
					if (board[i][0] != null) {
						board[i][0] = Integer.toString(i);
					} else {
						continue;
					}
				}

				// 목록 출력
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						System.out.print(board[i][j] + "\t");
					}
				}
				continue;

			case 2:
				String head, content, writer;
				System.out.println("게시글을 생성합니다.");

				System.out.print("제목: ");
				head = scanner.nextLine();
				System.out.print("내용: ");
				content = scanner.nextLine();
				System.out.print("글쓴이: ");
				writer = scanner.nextLine();

				String[] board_one = new String[5];
				board_one[0] = "100";
				board_one[1] = head;
				board_one[2] = content;
				board_one[3] = writer;
				board_one[4] = "0";

				for (int i = board.length; i > 0; i--) {
					board[i] = board[i - 1];
				}

				board[board.length] = board_one;
				System.out.println("----------------------------------------------------------------");
				System.out.println("번호\t\t제목\t\t\t내용\t\t\t글쓴이\t\t조회수");
				System.out.println("----------------------------------------------------------------");

				// 번호 재정렬
				for (int i = board.length; i >= 0; i--) {
					if (board[i][0] != null) {
						board[i][0] = Integer.toString(i);
					} else {
						continue;
					}
				}

				// 목록 출력
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						System.out.print(board[i][j] + "\t");
					}
				}
				continue;

			case 3:
				System.out.println("게시글을 불러옵니다.");
				readnum = Integer.parseInt(scanner.nextLine());
				if (readnum <= board.length) {
					for (int i = 0; i < board.length; i++) {
						int num = Integer.parseInt(board[i][0]);
						if (readnum == num) {
							view = Integer.parseInt(board[i][4]) + 1;
							board[i][4] = Integer.toString(view);

							System.out.println("번호: " + readnum);
							System.out.println("제목: " + board[i][1]);
							System.out.println("내용: " + board[i][2]);
							System.out.println("글쓴이: " + board[i][3]);
							System.out.println("조회수: " + view);
						}
					}
				} else {
					System.out.println("조회할 게시물이 없습니다. 메뉴로 돌아갑니다.");
				}
				continue;

			case 4:
				System.out.println("게시글을 수정합니다.");
				String newhead = null, newcontent = null;
				readnum = Integer.parseInt(scanner.nextLine());
				if (readnum <= board.length) {
					for (int i = 0; i < board.length; i++) {
						int num = Integer.parseInt(board[i][0]);
						if (readnum == num) {
							head = board[i][1];
							content = board[i][2];
							writer = board[i][3];
							view = Integer.parseInt(board[i][4]) + 1;
							board[i][4] = Integer.toString(view);

							System.out.println("번호: " + readnum);
							System.out.println("기존제목: " + head);
							System.out.print("수정제목: ");
							newhead = scanner.nextLine();
							if (newhead == null) {
								System.out.println("-----제목을 수정하지 않았습니다.-----");
							} else {
								System.out.println("-----제목을 수정했습니다.-----");
								board[i][1] = newhead;
							}

							System.out.println("기존내용: " + content);
							System.out.print("수정내용: ");
							newcontent = scanner.nextLine();
							if (newcontent == null) {
								System.out.println("-----내용을 수정하지 않았습니다.-----");
							} else {
								System.out.println("-----내용을 수정했습니다.-----");
								board[i][2] = newcontent;
							}

						}
					}
					System.out.println("----------------------------------------------------------------");
					System.out.println("번호\t\t제목\t\t\t내용\t\t\t글쓴이\t\t조회수");
					System.out.println("----------------------------------------------------------------");

					// 번호 재정렬
					for (int i = board.length; i >= 0; i--) {
						if (board[i][0] != null) {
							board[i][0] = Integer.toString(i);
						} else {
							continue;
						}
					}

					// 목록 출력
					for (int i = 0; i < board.length; i++) {
						for (int j = 0; j < board[i].length; j++) {
							System.out.print(board[i][j] + "\t");
						}
					}
					continue;
				} else {
					System.out.println("수정할 게시물이 없습니다.\n메뉴로 돌아갑니다.");
					continue;
				}
			case 5:
				String deletecheck = null;
				System.out.println("삭제할 게시글 번호를 입력해주세요.");
				readnum = Integer.parseInt(scanner.nextLine());
				if (readnum <= board.length) {
					for (int i = 0; i < board.length; i++) {
						int num = Integer.parseInt(board[i][0]);
						if (readnum == num) {
							System.out.println("해당 게시글의 내용은 다음과 같습니다.");
							System.out.println("-------------------------------------------------");
							System.out.println("번호: " + readnum);
							System.out.println("제목: " + board[i][1]);
							System.out.println("내용: " + board[i][2]);
							System.out.println("글쓴이: " + board[i][3]);
							System.out.println("조회수: " + board[i][4]);
							System.out.println("-------------------------------------------------");

							System.out.print("\n정말 삭제하시겠습니까?\n삭제하시려면 \"yes\"를 입력해주세요. >>");
							deletecheck = scanner.nextLine();

							if (deletecheck.equals("yes")) {
								board[i][1] = null;
								board[i][2] = null;
								board[i][3] = null;
								board[i][4] = null;
								System.out.println("-----삭제를 완료했습니다.-----");
							} else {
								System.out.println("삭제를 취소합니다.");
								
								
								
								
							}

						}
					}
					System.out.println("----------------------------------------------------------------");
					System.out.println("번호\t\t제목\t\t\t내용\t\t\t글쓴이\t\t조회수");
					System.out.println("----------------------------------------------------------------");

					// 번호 재정렬
					for (int i = board.length; i >= 0; i--) {
						if (board[i][0] != null) {
							board[i][0] = Integer.toString(i);
						} else {
							continue;
						}
					}

					// 목록 출력
					for (int i = 0; i < board.length; i++) {
						for (int j = 0; j < board[i].length; j++) {
							System.out.print(board[i][j] + "\t");
						}
					}
					continue;
				} else {
					System.out.println("삭제할 게시물이 없습니다.\n메뉴로 돌아갑니다..");
					continue;
				}

			case 6:
				System.out.println("게시판을 닫습니다.");
				break;

			}
		}

	}

}
