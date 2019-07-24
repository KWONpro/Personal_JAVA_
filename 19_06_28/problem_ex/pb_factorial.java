package problem_ex;
 // 1+2+3+4+5+6+7+8+9+10 = 55
public class pb_factorial {
	public static void main(String [] args) {
//		int i = 10, sum=0;
//		for(i = 1; i <= 10; i++) {
//			sum+=i;
//			System.out.print(i);
//			if(i==10) {
//				break;
//			}
//			System.out.print("+");
//		}
//		System.out.print("=");
//		System.out.print(sum);
		
		for(int i =1, sum = 0; i <= 10; i++) {
			sum+=i;
			System.out.print(i);// 1~10 출력
			if(i==10) {
				System.out.print(" = ");
				System.out.println(sum);
			}else {
				System.out.print(" + ");
			}
		}
	}
}
