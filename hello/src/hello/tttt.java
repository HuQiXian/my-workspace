package hello;

public class tttt {
	public static void main(String[] args) {
		int arr[] = {5,7,1,15,10};
		int a = 4;
		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j <= a; j++) {
				if (arr[j] < arr[i]) {
					int tp = arr[i];
					arr[i] = arr[j];
					arr[j] = tp;
				}
			}
		}for(int i=0; i<=a;i++)
	System.out.println(arr[i]);
	}
}
