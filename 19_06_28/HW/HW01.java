package HW;
// 과제1] 1~100사이의 소수를 구하여 출력하세요.
//솟수 : prime number 1과 자기자신의 수로만 나누어 떨어지는 수.
public class HW01 {
	public static void main(String[] args) {
		int i;
		for(i=1; i <=100; i++) {
			if(i%2!=0) {
				System.out.print(i);
			}
		}
		System.out.println("소수");
	}
}
