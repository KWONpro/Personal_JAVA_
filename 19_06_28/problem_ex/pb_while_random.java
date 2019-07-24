package problem_ex;

import java.util.Scanner;

// 문제] 2개의 난수를 발생하여 합이 50이 되면, 프로그램을 중지하고, 아니면 계속 난수가 발생됩니다.
public class pb_while_random {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int Plus_x, Random_num, sum=0, count=0;
		
		while(true) {
			System.out.println("두개의 수의 합이 50이 되면 프로그램이 중지되는 프로그램 입니다.");
			System.out.println("1개의 난수를 발생시키겠습니다.");
			Random_num=(int)(Math.random()*50);
			Plus_x = (int)(Math.random()*50);
			count++;
			System.out.println(count+", Random으로 나온수 : " + Random_num+ "," + Plus_x);
			//System.out.println("숫자 하나를 입력하세요");
			//Plus_x = sc.nextInt(); // (int)(Math.random()*49);
			
			
			if(Random_num+Plus_x == 50) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}




//
