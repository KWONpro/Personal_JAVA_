package problem_ex;
 // 문제] -1+3-5+7....-97+99 = ?
public class pb_while_ex03 {
	public static void main(String[] args) {
		
		int i = 1, sum=0, sw=1; // (true)
		while(i <= 99) {
			sw = sw *-1; // 1 * -1 = -1
			sum = sum+(i *sw); // 1 * -1 ,3 *1 = 3+ -1 = 2
			i+=2; // 50
		}
		System.out.println(sum);
	}
}
