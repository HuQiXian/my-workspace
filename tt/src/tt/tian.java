package tt;

public class tian {
	public static void main(String[] args) {
		//��������
		sum(10 ,20);
		System.out.println("============");
		
		//��ӡ����
		System.out.println(sum(10,20));
		System.out.println("=============");
		
		//��ֵ����
		int number = sum(15,25);
		System.out.println("������ֵ:"+ number);
	}
	public static int sum(int a, int b) {
		System.out.println("����ִ������");
		int result = a + b;
		return result;
	}
}
