package ex_HW;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



//[과제4] 반지름을 입력 받아서, 원의 넓이와 둘레를 구하여 출력하세요.

//계속하려면 yes를 입력하고, no이면 중단합니다.	

//원의 넓이 구하는 공식 : 파이 * r * r

//원의 둘레를 구하는 공식 : 2 * 파이 * r

public class HW04 {

	public static void main(String[] args) throws IOException {

//		final float PI = 3.14f;
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		System.out.println("원의 반지름을 입력하세요!");
//
//		System.out.println("원의 넓이 : 파이 * r * r");
//
//		System.out.println("원의 둘레를 구하는 공식 : 2 * 파이 * r");
//
//		String r;
//
//		float r_float;
//
//		
//
//		boolean run = true;
//
//		while(run) {
//
//			System.out.println("반지름을 입력하세요");
//
//			r = br.readLine();
//
//			r_float = Float.parseFloat(r);
//
//			System.out.println("반지름 : " + r_float);
//
//			System.out.println("원의 넓이 : " + (PI*r_float*r_float));
//
//			System.out.printf("원의 둘레 : %.2f\n" , (2.0 * PI * r_float));
//
//			
//
//			System.out.println("\n다시 하시겠습니까? 예 : yes 아니요 : no");
//
//			r = br.readLine();
//
//			if(r.equals("yes")) {
//
//				continue;
//
//			}else if(r.equals("no")) {
//
//				System.out.println("프로그램을 종료합니다.");
//
//				run = false;
//
//			}
//
//		}
		double radian;
		
		for( ; true; ) {
			System.out.println("반지름 입력");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			radian = Double.parseDouble(br.readLine());
			
			double d = radian * radian * 3.14;
			double e = radian * 2 * 3.14;
				System.out.println("원의 넓이 : " + d);
				System.out.println("원의 둘레 : " + e);
				System.out.println("계속하시겠습니다? yes : no");
			String y = br.readLine();
			
			if(!y.equals("yes")) {
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			}
		}
		
	}

}