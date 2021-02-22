package team6Min;

import java.util.Scanner;

public class Team6Projects01 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      String[][] boardArray = new String[100][5];

      int selectNum;   //switch문의 조건문, 입력값
      int listNum = 1; //게시글의 번호
      String title;
      String content;
      String writer;

      boolean run = true;
      boolean check = false;      //일치하는 글번호가 있는지 검사
      boolean autoMenu = false;   //목록 자동 출력 검사


      while(run){
         if(autoMenu == true) {   //목록을 자동으로 출력해야 할 때
            selectNum = 1;
         }else {
            System.out.println();
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("1.목록 | 2.생성(Create) | 3.읽기(Read) | 4.수정(Update) | 5.삭제(Delete) | 6.종료");
            System.out.println("--------------------------------------------------------------------------");
            System.out.print("메뉴 선택 : ");

            selectNum = Integer.parseInt(scan.nextLine());
         }

         switch (selectNum){
         case 1:
            System.out.println("1.목록> ");
            System.out.println("---------------------------------------------------");
            System.out.println("번호    제목    내용    글쓴이    조회수");
            System.out.println("---------------------------------------------------");

            for(int i=0; i<boardArray.length; i++) {   //출력
               if(boardArray[i][0] != null) {   //번호가 존재하면 출력
            	   ////게시글이 null이 아닌 경우 글번호를 체크/ 글번호가 있는지
                  System.out.println(boardArray[i][0] + "\t" +
                        boardArray[i][1] + "\t" +
                        boardArray[i][2] + "\t" +
                        boardArray[i][3] + "\t" +
                        boardArray[i][4]);
               }
            }

            autoMenu = false;// autoMenu를 false로 만들어야 메뉴 선택이 가능
            break;
            
         case 2:
            System.out.println("2.생성> ");

            System.out.print("제목 : ");
            title = scan.nextLine();
            System.out.print("내용 : ");
            content = scan.nextLine();
            System.out.print("글쓴이 : ");
            writer = scan.nextLine();

            String[] newBoard = {   //배열을 생성하고 
                  String.valueOf(listNum),
                  title,
                  content,
                  writer,
                  String.valueOf(0)
            };

            for(int i =0;i<boardArray.length;i++) {      //삽입
               if(boardArray[i][0] == null) { //null 위치를 찾아서 삽입
                  boardArray[i] = newBoard;
                  listNum++;
                  break;
               }
            }
            
            /*
                4
                null ex)5 생성
                null  
                1
                -> 최종 null 밑은 정렬이 되어있기 때문에 처음 null을 만났을때 까지만 정렬을 해주면 됨.
                   따라서 null을 만났을 때는 break로 반복문 종료
                   
                결과 :   5
                      4
                      null
                      1
             */
            for(int i=0; i<boardArray.length; i++) {   //정렬
               if(boardArray[i][0] == null) {
                  break;
               }
               for(int j=0; j<i; j++) { //현재위치 값과 다음위치 값을 비교하여 교체
                  if(Integer.parseInt(boardArray[i][0]) > Integer.parseInt(boardArray[j][0])) {
                	// 게시글 번호의 앞뒤를 비교해서 앞이 더 크다면
                     String[] temp = boardArray[i];// 그 게시글을 temp 배열에 담는다
                     boardArray[i] = boardArray[j];// 앞자리에 뒤의 게시글을 담고
                     boardArray[j] = temp;// 뒷자리에 temp 배열을 담아 재배열
                  
                  }
               }
            }

            autoMenu = true;// autoMenu가 true로 바뀌었기 때문에 case 1로 넘어가서 전체 목록을 재정렬 후 출력
            break;
            
         case 3:   
            System.out.println("3.읽기> ");
            System.out.print("글번호를 입력하세요 : ");
            int readNum = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < boardArray.length; i++) {
               if(boardArray[i][0] == null){   //번호를 찾을때까지 반복문 실행
                  continue;
               }
               if (readNum == Integer.parseInt(boardArray[i][0])) {
                  System.out.println("제목: " + boardArray[i][1]);
                  System.out.println("내용: " + boardArray[i][2]);
                  System.out.println("글쓴이: " + boardArray[i][3]);
                  boardArray[i][4] = String.valueOf(Integer.parseInt(boardArray[i][4])+1);
                  System.out.println("조회수: " + boardArray[i][4]);
                  check = true;
                  break;
               }
            }

            if(check == false) {
               System.out.println("읽을 게시글이 없습니다.");
            }else {
               check = false;
            }

            autoMenu = false;
            break;
            
         case 4:
            System.out.println("4.수정>");
            System.out.println("글번호를 입력하세요 : ");
            int updateNum = Integer.parseInt(scan.nextLine());

            String updateTitle;
            String updateContent;
            
            for (int i = 0; i < boardArray.length; i++) {
               if(boardArray[i][0] == null){   //번호를 찾을때까지 반복문 실행
                  continue;
               }
               if (updateNum == Integer.parseInt(boardArray[i][0])) {
                  System.out.println("기존 제목: " + boardArray[i][1]);
                  System.out.print("변경할 제목: ");
                  updateTitle = scan.nextLine();
                  System.out.println("기존 내용: " + boardArray[i][2]);
                  System.out.print("변경할 내용: ");
                  updateContent = scan.nextLine();
                  
                  //값이 있을경우에 새로운 값 저장
                  if(updateTitle.length() != 0) {
                     boardArray[i][1] = updateTitle;
                  }
                  if(updateContent.length() != 0) {
                     boardArray[i][2] = updateContent;
                  }
                  System.out.println("수정되었습니다.");
                  check = true; // 수정이 되었다면 check를 true로 만들어서 게시글이 유효하다고 체크
                  break;
               }
            }
         // 게시글 번호가 유효한 경우에는 위의 업데이트가 실행되므로 check가 true
         //이 문장은 출력되지 않습니다.
            if(check == false) {
               System.out.println("수정할 게시글이 없습니다.");
            }else {
               check = false;
            }

            autoMenu = true;//autoMenu 에 true를 입력해 case 1로 넘어가 전체 게시글을 출력
            break;
            
         case 5:
            System.out.println("5.삭제>");
            System.out.println("글번호를 입력하세요 : ");
            int deleteNum = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < boardArray.length; i++) {
               if(boardArray[i][0] == null) {   //번호를 찾을때까지 반복문 실행
                  continue;
               }
               if (deleteNum == Integer.parseInt(boardArray[i][0])) {
                  for(int j=0; j<boardArray[i].length; j++) {
                     boardArray[i][j] = null;// 해당되는 게시글 번호의 게시글전체를 null로
                  }
                  System.out.println("삭제되었습니다.");
                  check = true;// 삭제되면 유효성을 true로 check
                  break;
               }
            }

            if(check == false) {
               System.out.println("삭제할 게시글이 없습니다.");
            }else {
               check = false;
            }
            
            autoMenu = true;
            break;
            
         case 6:
            System.out.println("프로그램을 종료");
            run = false;// 6을 누르면 run을 false 로 바꿔 프로그램을 종료
            break;
            
         default:
            System.out.println("정확한 번호를 입력해주세요.");
            break;
         }

      }
   }

}