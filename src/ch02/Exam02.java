package ch02;

public class Exam02 {

	public static void main(String[] args) {

		//�ڵ� Ÿ�� ��ȯ
		byte var1 = 10;
		int var2 = var1;
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("-----------------------------");
		
		//���� Ÿ�� ��ȯ
		int var3 = 10;
		byte var4 = (byte)var3;
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("-----------------------------");
		
		//�ڵ�Ÿ�Ժ�ȯ(������ �Ǽ����� �׻� ���� ����)
		int var5 = 10;
		double var6 = var5;
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("-----------------------------");
		
		//���� Ÿ�� ��ȯ(�Ǽ��� �������� �׻� ū ����)
		float  var7 = 10.5f;
		long var8 = (long)var7;
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("-----------------------------");
		
		//�Ǽ��� ������ ��ȯ
		double var9 = 3.14;
		int var10 =  (int)var9 ;
		System.out.println("var9 : "+var9);
		System.out.println("var10 : "+var10);
	}
}