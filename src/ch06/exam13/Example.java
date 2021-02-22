package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int result = Singleton.method1();
//		String result2 = Singleton.method2();
//		int[] result3 = Singleton.method3();
		//Singleton result4 = Singleton.method4();
//		Singleton result4 = new Singleton();
//		Singleton result4 = Singleton.method4();
		
		//생성자를 이용해서 객체 얻기
		//Singleton result1 = new Singleton(); (x)
		
		//Factory Method 이용해서 객체 얻기
		Singleton result2 = Singleton.getInstance();
		
		Singleton result3 = Singleton.getInstance();
		
		if(result2 == result3) {
			System.out.println("같은 객체를 참조");
		}else {
			System.out.println("다른 객체를 참조");
		}
	}

}
