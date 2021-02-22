package ch06.exam07;

public class Example {

	public static void main(String[] args) {

		BoardService bs = new BoardService();
		int bno = bs.getNewBno();
		System.out.println(bno);
		
		bno = bs.getNewBno();
		System.out.println(bno);
		
		bs.save("제목1", "내용1");
		bs.save("제목2", "내용2");
		
		int[] arr = {1, 2, 3};
		int sum = bs.getSum1(arr);
		System.out.println(sum);
		
		sum = bs.getSum1(new int[] {1,2,3}); //new 없으면 안된다, 왜냐면 이미 선언생성되어있어서 그다음에 못집어넣음
		
		System.out.println(sum);
		
		sum = bs.getSum2(1, 2, 3);
		sum = bs.getSum2(1, 2, 3, 4, 5);
		
	
		
	}

}
