package Practice_ex;

public class array_ex01 {
	public static void main(String[] args) {
		int ken[] = new int[5];
		int hoo[] = new int[5];
		int sum=0;
		System.out.println("***** result *****");
		for(int i=0; i<5; i++) {
			sum+=10;
			System.out.println("ken[" + i + "] = " + sum);
		}
		for(int i=0; i<5; i++) {
			sum+=10;
			System.out.println("hoo[" + i + "] = " + sum);
		}
	}
}
