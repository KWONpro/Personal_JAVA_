package Method;

import java.util.Scanner;

public class CalAdder {

	public void Adder() {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		sum = first + second;
		System.out.println("1. 덧셈의 결과는 : " + sum);
		
	}

}
