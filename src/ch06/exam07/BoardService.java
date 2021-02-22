package ch06.exam07;
//클래스는 설계도, 설계도로만있ㄴ으면 쓸수 없음 객체를 만들어야함
public class BoardService {
	//Field
	int count;
	
	
	
	//Constructor
	
	//Method
	int getNewBno() {
		
		return ++count;
		
	}
	void save(String title, String content){
		int bno = getNewBno();
		System.out.println(bno + "을 저장합니다.");
		System.out.println(title + "을 저장합니다.");
		System.out.println(content + "을 저장합니다.");
	}
	
	int getSum1(int[] values) {
		int result = 0;
		for(int value : values) {
			result += value;
			
		}
		return result;
	}
	
	int getSum2(int ... values) {
		int result = 0;
		for(int value : values) {
			result += value;
			
		}
		return result;
	}
}
