package ch06.exam07;

public class Example {

	public static void main(String[] args) {

		BoardService bs = new BoardService();
		int bno = bs.getNewBno();
		System.out.println(bno);
		
		bno = bs.getNewBno();
		System.out.println(bno);
		
		bs.save("����1", "����1");
		bs.save("����2", "����2");
		
		int[] arr = {1, 2, 3};
		int sum = bs.getSum1(arr);
		System.out.println(sum);
		
		sum = bs.getSum1(new int[] {1,2,3}); //new ������ �ȵȴ�, �ֳĸ� �̹� ��������Ǿ��־ �״����� ���������
		
		System.out.println(sum);
		
		sum = bs.getSum2(1, 2, 3);
		sum = bs.getSum2(1, 2, 3, 4, 5);
		
	
		
	}

}