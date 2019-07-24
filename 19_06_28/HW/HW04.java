package HW;

import java.util.Scanner;

//과제4] 피보나치 수열을 작성하고, n번째 항까지의 합을 구하여 출력하세요. 입력받기 n
// 1 , 1 ,2 , 3 , 5 ,8, ....
public class HW04 {
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int sum = 1;
		int total= 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("----------피보나치 수열 프로그램---------");
		System.out.println("ex) 1 , 1 , 2 , 3 , 5 , 8 , ....");
		System.out.println("n을 입력하세요");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.print(sum + " ");
			total +=sum;
			sum = num1 + num2;
			num1= num2;
			num2 = sum;
			
		} 
		System.out.println();
		System.out.println(num+ "까지의 수열 합은 " + total);
	}
}
	

