package problem_ex;
// 5의 배수와 7의 배수가 되는 첫번째 숫자를 구하여 출력하세요.
public class pb_break_ex03 {
	
	public static void main(String[] args) {
		int result = 0;
		int i;
		for(i =1; true; i++) {
			if(i%5==0 && i%7==0) {
				break;
			}
		}
		System.out.println(i);
	}
}
