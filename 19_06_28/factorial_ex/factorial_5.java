package factorial_ex;

import java.util.Scanner;

// 5의 factorial 구하기
public class factorial_5 {
	public static void main(String[] args) {
		int i = 5, sum = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼을 구할 숫자를 입력하세요");
		int x = sc.nextInt();
		for(i=1; i<=x; i++) {
			sum*=i;
			System.out.println("i = "+ i + ","+ i + "!의"+" 합계는 " +sum);
			 
		}
		
	}
}
