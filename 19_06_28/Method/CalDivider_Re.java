package Method;

import java.util.Scanner;

public class CalDivider_Re {

	public void Divider_Re() {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		sum = first % second;
		System.out.println("5. 나머지의 결과는 : " + sum);
		
	}

}
