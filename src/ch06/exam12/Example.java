package ch06.exam12;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.pi);
		
		//�ùٸ� �����
		Calculator.plus(3,5);
		
		//�߸��� �����
		Calculator myCalc = new Calculator();
		System.out.println(myCalc.pi);
		myCalc.plus(3, 5);
	}

}