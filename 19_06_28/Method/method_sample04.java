package Method;

public class method_sample04 {
	static int sum2;
	public static void main(String[] args) {
		
		AdderSample.Adder();
		sum2=AdderSample.sum2; // 이럴경우!
		System.out.println(sum2);
	}
}
