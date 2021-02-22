package ch06.exam08;

import java.util.Scanner;

public class Teamhomework_1 {

	public static void main(String[] args) {
		String[][] board = new String[100][5];
		int view = 0, chosen = 0, readnum = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("----------------------------------------------------------------");
			System.out.println("1.���|2.����(Create)|�б�(Read)|4.����(Update)|5.����(Delete)|6.����");
			System.out.println("----------------------------------------------------------------");
			System.out.print("�޴����� : ");

			chosen = Integer.parseInt(scanner.nextLine());

			switch (chosen) {
			case 1:
				System.out.println("----------------------------------------------------------------");
				System.out.println("��ȣ\t\t����\t\t\t����\t\t\t�۾���\t\t��ȸ��");
				System.out.println("----------------------------------------------------------------");

				// ��ȣ ������
				for (int i = board.length; i >= 0; i--) {
					if (board[i][0] != null) {
						board[i][0] = Integer.toString(i);
					} else {
						continue;
					}
				}

				// ��� ���
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						System.out.print(board[i][j] + "\t");
					}
				}
				continue;

			case 2:
				String head, content, writer;
				System.out.println("�Խñ��� �����մϴ�.");

				System.out.print("����: ");
				head = scanner.nextLine();
				System.out.print("����: ");
				content = scanner.nextLine();
				System.out.print("�۾���: ");
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
				System.out.println("��ȣ\t\t����\t\t\t����\t\t\t�۾���\t\t��ȸ��");
				System.out.println("----------------------------------------------------------------");

				// ��ȣ ������
				for (int i = board.length; i >= 0; i--) {
					if (board[i][0] != null) {
						board[i][0] = Integer.toString(i);
					} else {
						continue;
					}
				}

				// ��� ���
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						System.out.print(board[i][j] + "\t");
					}
				}
				continue;

			case 3:
				System.out.println("�Խñ��� �ҷ��ɴϴ�.");
				readnum = Integer.parseInt(scanner.nextLine());
				if (readnum <= board.length) {
					for (int i = 0; i < board.length; i++) {
						int num = Integer.parseInt(board[i][0]);
						if (readnum == num) {
							view = Integer.parseInt(board[i][4]) + 1;
							board[i][4] = Integer.toString(view);

							System.out.println("��ȣ: " + readnum);
							System.out.println("����: " + board[i][1]);
							System.out.println("����: " + board[i][2]);
							System.out.println("�۾���: " + board[i][3]);
							System.out.println("��ȸ��: " + view);
						}
					}
				} else {
					System.out.println("��ȸ�� �Խù��� �����ϴ�. �޴��� ���ư��ϴ�.");
				}
				continue;

			case 4:
				System.out.println("�Խñ��� �����մϴ�.");
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

							System.out.println("��ȣ: " + readnum);
							System.out.println("��������: " + head);
							System.out.print("��������: ");
							newhead = scanner.nextLine();
							if (newhead == null) {
								System.out.println("-----������ �������� �ʾҽ��ϴ�.-----");
							} else {
								System.out.println("-----������ �����߽��ϴ�.-----");
								board[i][1] = newhead;
							}

							System.out.println("��������: " + content);
							System.out.print("��������: ");
							newcontent = scanner.nextLine();
							if (newcontent == null) {
								System.out.println("-----������ �������� �ʾҽ��ϴ�.-----");
							} else {
								System.out.println("-----������ �����߽��ϴ�.-----");
								board[i][2] = newcontent;
							}

						}
					}
					System.out.println("----------------------------------------------------------------");
					System.out.println("��ȣ\t\t����\t\t\t����\t\t\t�۾���\t\t��ȸ��");
					System.out.println("----------------------------------------------------------------");

					// ��ȣ ������
					for (int i = board.length; i >= 0; i--) {
						if (board[i][0] != null) {
							board[i][0] = Integer.toString(i);
						} else {
							continue;
						}
					}

					// ��� ���
					for (int i = 0; i < board.length; i++) {
						for (int j = 0; j < board[i].length; j++) {
							System.out.print(board[i][j] + "\t");
						}
					}
					continue;
				} else {
					System.out.println("������ �Խù��� �����ϴ�.\n�޴��� ���ư��ϴ�.");
					continue;
				}
			case 5:
				String deletecheck = null;
				System.out.println("������ �Խñ� ��ȣ�� �Է����ּ���.");
				readnum = Integer.parseInt(scanner.nextLine());
				if (readnum <= board.length) {
					for (int i = 0; i < board.length; i++) {
						int num = Integer.parseInt(board[i][0]);
						if (readnum == num) {
							System.out.println("�ش� �Խñ��� ������ ������ �����ϴ�.");
							System.out.println("-------------------------------------------------");
							System.out.println("��ȣ: " + readnum);
							System.out.println("����: " + board[i][1]);
							System.out.println("����: " + board[i][2]);
							System.out.println("�۾���: " + board[i][3]);
							System.out.println("��ȸ��: " + board[i][4]);
							System.out.println("-------------------------------------------------");

							System.out.print("\n���� �����Ͻðڽ��ϱ�?\n�����Ͻ÷��� \"yes\"�� �Է����ּ���. >>");
							deletecheck = scanner.nextLine();

							if (deletecheck.equals("yes")) {
								board[i][1] = null;
								board[i][2] = null;
								board[i][3] = null;
								board[i][4] = null;
								System.out.println("-----������ �Ϸ��߽��ϴ�.-----");
							} else {
								System.out.println("������ ����մϴ�.");
								
								
								
								
							}

						}
					}
					System.out.println("----------------------------------------------------------------");
					System.out.println("��ȣ\t\t����\t\t\t����\t\t\t�۾���\t\t��ȸ��");
					System.out.println("----------------------------------------------------------------");

					// ��ȣ ������
					for (int i = board.length; i >= 0; i--) {
						if (board[i][0] != null) {
							board[i][0] = Integer.toString(i);
						} else {
							continue;
						}
					}

					// ��� ���
					for (int i = 0; i < board.length; i++) {
						for (int j = 0; j < board[i].length; j++) {
							System.out.print(board[i][j] + "\t");
						}
					}
					continue;
				} else {
					System.out.println("������ �Խù��� �����ϴ�.\n�޴��� ���ư��ϴ�..");
					continue;
				}

			case 6:
				System.out.println("�Խ����� �ݽ��ϴ�.");
				break;

			}
		}

	}

}