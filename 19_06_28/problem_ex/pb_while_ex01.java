package problem_ex;
//-- while (~하는 동안에, 참인 경우에 반복 실행, 조건식 이용 이나 true)
//문제] Hello Java라는 문자열을 5번 반복 출력하세요.
public class pb_while_ex01 {
	public static void main(String[] args) {
		String st = "Hello Java";
		int i = 0;
		while(i<5) {
			System.out.println(st);
			i++;
		}
	}
}
