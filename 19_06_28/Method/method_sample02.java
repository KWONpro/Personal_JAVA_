package Method;
// 1~100사이의 합계를 구하는 프로그램 작성(단, 메소드를 사용하라)
//public class method_sample02 {
//	public static int sum(){
//		int i=0, sum = 0;
//		for(i=1; i<=100; i++) {
//			sum+=i;
//		}
//		return sum;
//	}
//	public static void main(String[] args) {
//		method_sample02 ms2= new method_sample02();
//		int result = 0;
//		System.out.println("1~100사이의 합계를 구하는 프로그램");
//		result = ms2.sum();
//		System.out.println("합계 : " + result);
//	}
//}


public class method_sample02{
	
	//4. 구현 5000
	public static void Adder() { // 1. static 이 있는 경우 :다른 클래스에서 이 메소드를 사용할 수 있다. 즉, 참조가 가능하진다.
		int sum = 0;			// 2. static 이 없는 경우 : 다른 클래스에서 참조가 불가능하다.
		
		for(int i = 1; i <= 100; i++) {
			sum+=i;
		}
		System.out.println("1~100 = " + sum);
	}
	public static void main(String[] args) {
		//method_sample02라는 클래스에서 ms2라는 객체생성(클래스의 시작 주소 기억), ms2(5000기억)
		method_sample02 ms2 = new method_sample02(); // 클래스 이름
		ms2.Adder();
		//Adder(); // 6000 메모리상의 번지 공유 불과
	}
}
 