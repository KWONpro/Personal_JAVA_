package Method;

public class AdderSample { // 굳이 static 을 작성하지 않아도 된다.
	
	static int sum1;
	static int sum2;
	public static void Adder() { // 1. static 이 있는 경우 :다른 클래스에서 이 메소드를 사용할 수 있다. 즉, 참조가 가능하진다.
		int sum1 = 0;			// 2. static 이 없는 경우 : 다른 클래스에서 참조가 불가능하다.
		
		for(int i = 1; i <= 100; i++) {
			sum1+=i;
		}
		System.out.println("1~100 = " + sum1);
	}
	public static int Subtract() {
		int sum2 = 0;
		
		for(int i = 1; i<= 100; i++) {
			sum2-=i;
		}
		
		return sum2;
	}
}
