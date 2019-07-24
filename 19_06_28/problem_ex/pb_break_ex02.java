package problem_ex;
//문제] 1~100사이의 덧셈의 합중에 합이 3000에 가까운 수를 구하여 출력합니다.
public class pb_break_ex02 {
	public static void main(String[] args) {
		int i=0, sum=0;
		for(i=0; i<=100; i++) {
			sum+=i;
			if(sum >= 3000) {
				break;
			}
			System.out.println("i = " +  i + ",sum = " +  sum);
		}
	}
}
