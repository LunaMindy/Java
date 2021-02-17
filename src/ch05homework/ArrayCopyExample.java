package ch05homework;


public class ArrayCopyExample {

	public static void main(String[] args) {
		
		String[] oldIntArray = {"java","array","copy"};
		String[] newIntArray = new String[5];

		System.arraycopy( oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		
		for(int i = 0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ",");
		}
	}
}