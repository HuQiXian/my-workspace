package hello;

//定义一个方法，用来判断两个数是否相同。
//定义一个方法，求出1~100之和。
//定义一个方法，给我打印HelloWorld。
public class ttt1 {
	public static void main(String[] args) {
		isname(9, 9);
		System.out.println("结果是：" + is1nane());
		is1name(10);
	}

	public static boolean isname(int a, int b) {
		boolean name;
		if (a == b) {
			name = true;
		} else {
			name = false;
		}
		return name;
	}

	public static int is1nane() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	public static void is1name(int sum) {
		for (int i = 0; i < sum; i++) {
			System.out.println("HelloWorld" + i);
		}

	}

}
