package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ν��Ͻ� ���(�ʵ�, �޼ҵ�)�� �ݵ��
		//��ü ���� ������ ���ؼ� ����
		User user = new User("ȫ�浿");
		System.out.println(user.name);
		user.info();
		user.login();
		user.logout();
		
		//���� ���(�ʵ�, �޼ҵ�)�� ��ü�� ��� ��밡��
		System.out.println(User.nation); //Ŭ����user�� ������ ����
		
		user.info();
	
	}

}