package ch03;

public class Exam02 {

	public static void main(String[] args) {
		//연산의 결과가 boolean 타입으로 나오는 연산기호
		int var1 = 2;
		int var2 = 3;
		
		boolean var3 = var1 == var2;
		System.out.println("var3 : "+ var3);
		
		boolean var4 = var1 != var2;
		System.out.println("var4 : "+ var4);
		
		boolean var5 = var1 > var2;
		System.out.println("var5 : "+var5);
		
		boolean var6 = var1 >= var2;
		System.out.println("var6 : "+var6);

		boolean var7 = var1 < var2;
		System.out.println("var7 : "+var7);

		boolean var8 = var1 <= var2;
		System.out.println("var8 : "+var8);
		
		boolean var9 = !(var1 == var2);
		System.out.println("var9 : "+var9);
		
		boolean var10 = (var1 == var2) || (var1 < var2);
		System.out.println("var10 : "+var10);
		
		boolean var11 = (var1 == var2) && (var1 < var2);
		System.out.println("var11 : "+var11);

	}
}
