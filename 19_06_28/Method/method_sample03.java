package Method;

public class method_sample03 {
	public static void main(String[] args) {
		AdderSample ms2 = new AdderSample(); // 10000번지 -> ms2 객체가 10000번지를 기억, 심어진 상태에서 AdderSample을 찾아간다.
		ms2.Adder();
		int sub= ms2.Subtract();
		ms2.Adder();
		
		
		System.out.println("1~100 = " + sub);
	}
}
