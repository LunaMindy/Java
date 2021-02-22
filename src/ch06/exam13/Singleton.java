package ch06.exam13;

public class Singleton {
	
//	static int method1() {
//		return 1;
//	}
//	
//	static String method2() {
//		return "자바";
//	}
//	
//	static int[] method3() {
//		int[] arr = {10, 20, 30};
//		return arr;
//	}
	
	
	//Field
	private static Singleton singleton = new Singleton(); //정적필드에다가 객체를 만들어 놓고  메소드에 리턴값으로 넘기면, 항상 똑같은 번지가 리턴됨
	
	
	//Constructor
	private Singleton() {
		
		
	}
	
	
	//Method
	
	
	
	static Singleton getInstance() {
//		Singleton s = new Singleton();
//		return s;  -> 이렇게 하지말고 필드에 추가
		
		return singleton;
	}


}
