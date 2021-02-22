package ch06.exam08;
//클래스는 설계도, 설계도로만있ㄴ으면 쓸수 없음 객체를 만들어야함
public class BoardService {
	//Field
	String[][] boards;
	int count;
	/*
	{
		{"1","제목1","내용1","글쓴이1","3"},
		
	
	
	
	  
	 */
	
	//Constructor
	BoardService(int rows, int columns){
		boards = new String[rows][columns];
	}
	
	//Method
	int getNewBno() {
		return ++count;
	}
	
	void create(String title, String content, String writer, int hitcount) {
		
		int bno = getNewBno();
		String[] board = {
				""+bno,
				title,
				content,
				writer,
				String.valueOf(hitcount)
		};
		//boards.length = 100
		for(int i=0; i<boards.length; i++) {
			if(boards[i][0] == null) {
				boards[i] = board;
				break;
			}
		}
		
	}	
		void showList( ) {
			for(int i = 0; i<100; i++) {
				for(int k=0; k<5;i++) {
					System.out.print(boards[i][k]+"\t");
					
				}
				System.out.println();
			}
		
		}
		
		String[] read(int bno) {
			//String strBno = String.valueOf(bno);
			String[] result = null;
			String strBno = "" + bno;
			for(int i = 0; i<100; i++) {
					if(boards[i][0] != null) {
						if(boards[i][0].equals(strBno)) {
							return boards[i];
					}
				}
			
			}
		return result;
	}
}
	

