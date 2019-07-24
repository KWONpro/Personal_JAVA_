package problem_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제] 두 수를 입력 받아서 ,큰 값과 작은 값을 구별하여 출력하세요 (do-while)
public class pb_dowhile_ex03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ex;
		int num1, num2, MAX = 0, MIN = 0;
		do {
			System.out.println("두 수를 입력하세요 / yes : 진행 no : 중지");
			ex = br.readLine();
			if(ex.equals("yes")) {
				System.out.println("진행하겠습니다.");
				num1 =Integer.parseInt(br.readLine());
				num2 = Integer.parseInt(br.readLine());
				System.out.println("입력한 수는 " + num1+ " , " + num2);
				if(num1 > num2) { // 
					MAX = num1; // MAX = (num1 > num2) ? num1:num2;
					MIN = num2;
				}else if(num1 < num2){
					MAX = num2; // MIN = (num1 < num2) ? num1:num2;
					MIN = num1;
				}else {
					System.out.println("두 수가 같습니다.");
				}
				System.out.println("두 수 중 최댓값 : " + MAX + "\n최솟값 : " + MIN);
			}
			}while(!ex.equals("no"));
		System.out.println("프로그램을 종료하겠습니다.");
	}
}
