package ch06.exam11;

public class User {
	//Field
	String id;
	String name;
	String password;
	static String nation = "한국";
	
	
	//Constructor
	User(String name){
		this.name = name;
	}
	
	//Method
	
	static void info() {
		nation = "대한민국"; //객체 만들필요 없어서 여기서 쓸수있다.
		System.out.println("모든 User는 한국인 입니다.");
	}
	
	void login() {
		System.out.println(name+"님이 로그인 합니다.");
	}
	void logout() {
		System.out.println(name+"님이 로그아웃 합니다.");
	}
	
	
}
