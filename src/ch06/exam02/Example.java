package ch06.exam02;

public class Example {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);
//mycar��º����� �����ϴ� ��ü�� ������ �ִ�	 company��� ������ ����
		
		//�ʵ��� ���� ����
		myCar.company = "�����ڵ���";
		myCar.model = "�׷���";
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