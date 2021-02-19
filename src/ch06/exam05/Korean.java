package ch06.exam05;

public class Korean {
	//Field
	String nation = "ÇÑ±¹";
	String name;
	String ssn;
	
	//Constructor
	Korean() {
		
	}
	
	Korean(String name){
		this.name = name;
	}
	
	Korean(String n, String s){
		this.name = n;
		this.ssn = s;
		
	}
}
