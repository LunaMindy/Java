package ch02;

public class Exam02 {

	public static void main(String[] args) {

		//자동 타입 변환
		byte var1 = 10;
		int var2 = var1;
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("-----------------------------");
		
		//강제 타입 변환
		int var3 = 10;
		byte var4 = (byte)var3;
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("-----------------------------");
		
		//자동타입변환(정수는 실수보다 항상 적은 범위)
		int var5 = 10;
		double var6 = var5;
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("-----------------------------");
		
		//강제 타입 변환(실수는 정수보다 항상 큰 범위)
		float  var7 = 10.5f;
		long var8 = (long)var7;
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("-----------------------------");
		
		//실수를 정수로 변환
		double var9 = 3.14;
		int var10 =  (int)var9 ;
		System.out.println("var9 : "+var9);
		System.out.println("var10 : "+var10);
	}
}
