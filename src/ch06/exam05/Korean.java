package ch06.exam05;

public class Korean {
	//Field
	String nation = "한국";
	String name;
	String ssn;
	int age;
	
	//Constructor Overloading
	Korean() {
		System.out.println("Korean() 실행");
	}
	
	Korean(String name){
		System.out.println("Korean(String name)실행 ");
		this.name = name;
	}
	
	Korean(String name, String ssn){
		System.out.println("Korean(String name,String ssn)실행 ");
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name, String ssn, int age){
		System.out.println("Korean(String name, String ssn, int age)실행");
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		
	}
}
