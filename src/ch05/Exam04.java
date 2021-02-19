package ch05;

public class Exam04 {

	public static void main(String[] args) {
		//변수를 선언하면서 값 목록을 제공할 경우
		/**
		 * int배열타입의 변수 arr1을 선언한다
		 * 새로 객체를 만든다 
		 * int값이 3개가 들어갈수 있는 배열을 만든다.
		 * */
		
		int[] arr1 = new int[3];
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		boolean[] arr3 = new boolean[3];
		for(int i = 0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		String[] arr4 = new String[3];
		for(int i = 0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		
	}
		
}
