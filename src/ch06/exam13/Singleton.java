package ch06.exam13;

public class Singleton {
	
//	static int method1() {
//		return 1;
//	}
//	
//	static String method2() {
//		return "�ڹ�";
//	}
//	
//	static int[] method3() {
//		int[] arr = {10, 20, 30};
//		return arr;
//	}
	
	
	//Field
	private static Singleton singleton = new Singleton(); //�����ʵ忡�ٰ� ��ü�� ����� ����  �޼ҵ忡 ���ϰ����� �ѱ��, �׻� �Ȱ��� ������ ���ϵ�
	
	
	//Constructor
	private Singleton() {
		
		
	}
	
	
	//Method
	
	
	
	static Singleton getInstance() {
//		Singleton s = new Singleton();
//		return s;  -> �̷��� �������� �ʵ忡 �߰�
		
		return singleton;
	}


}