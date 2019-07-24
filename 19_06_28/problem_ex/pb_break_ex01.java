package problem_ex;
// ---- break------
//1~100사이의 12345라는 숫자를 5번 반복하고 탈출하세요.
public class pb_break_ex01 {
	public static void main(String[] args) {
		int i = 1;
		for(i=1; i<=100; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println(j);
			}
			if(i ==5) {
				System.out.println("exit");
				break;
			}
		}
	}
}
