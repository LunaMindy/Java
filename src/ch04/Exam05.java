package ch04;

public class Exam05 {

	public static void main(String[] args) {
		//주사위를 던져 나오는 수 얻기(1, 2, 3, 4, 5, 6)
		
		//double 타입에 temp라는 변수를 선언한다. temp 라는 변수에 random값 저장한다.
//		double temp = Math.random(); //[0,1) 실수
//		
//		System.out.println(temp); //[0,1) 실수..> 0포함해서 1 미만의 값
//		System.out.println(temp*6); //[0,6) 실수
//		System.out.println((int)(temp*6)); // 0, 1, 2, 3, 4, 5
//		System.out.println((int)(temp*6)+1); // 1, 2, 3, 4, 5, 6
		
		int value = (int)(Math.random() * 6 )+1; 
		
		if(value % 2 == 0) {
			System.out.println("짝수가 나왔어요");
		}else {
			System.out.println("홀수가 나왔어요");
		}
		
	}

}
