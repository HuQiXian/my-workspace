package hello;

public class ttt2 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		System.out.println(is2name(a, b));
	}

	public static boolean is2name(byte a, byte b) {
		boolean same;
		if (a == b) {
			same = true;
		} else {
			same = false;
		}
		return same;
	}

	public static boolean is2name(short a, short b) {
		boolean same = a == b;
		return same;

	}

	public static boolean is2name(int a, int b) {
		return a == b;
	}

	public static boolean is2name(long a, long b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}

	}

}
