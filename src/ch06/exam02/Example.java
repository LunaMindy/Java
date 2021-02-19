package ch06.exam02;

public class Example {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);
//mycar라는변수가 참조하는 객체가 가지고 있는	 company라는 데이터 값을
		
		//필드의 값을 변경
		myCar.company = "현대자동차";
		myCar.model = "그랜져";
		myCar.price = 100;
		myCar.old = true;
		myCar.speed = 60;
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);
	}

}
