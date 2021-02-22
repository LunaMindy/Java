package ch06.exam06;

public class Korean {
	//Field
	String nation = "한국";
	String name;
	String ssn;
	int age;
	//this :  객체가 나 자신을 가르킬때
	//Constructor Overloading
	Korean() {
		//this 내가 가지고 있는 생성자를 실행하겠다
		this("아무개","000000-0000000",1);
//		this.name = "아무개";
//		this.ssn = "000000-0000000";
//		this.age = 1;
	}
	
	Korean(String name){
		this(name,"000000-0000000",1);
//		this.name = name;
//		this.ssn = "000000-0000000";
//		this.age = 1;
	}
	
	Korean(String name, String ssn){
		this(name,ssn,1);
//		this.name = name;
//		this.ssn = ssn;
//		this.age = 1;
	}
	
	Korean(String name, String ssn, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		
	}
}
