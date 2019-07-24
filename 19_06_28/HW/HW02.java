package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//과제2] 국어, 영어 점수를 입력받아서 처리하되, 
//0점이상 100점이하로 성적이 입력되도록 하여 합계와 평균을 구합니다.
public class HW02 {
	public static void main(String[] args) throws IOException {
			int sum = 0;
			int avg;
			int kor, eng;
			int menu;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("---국어와 영어 점수의 합계와 평균 연산 프로그램---");
			while(true) {
				System.out.println("1. 합계 / 2.평균 /3. 종료를 입력하면 종료됩니다.");
				String subject = br.readLine();
				menu = Integer.parseInt(subject);
				if(menu == 3) {
					System.out.println("시스템을 종료합니다.");
					System.exit(0);
				} else if(menu == 1){
					System.out.println("합계 프로그램");
					System.out.println("국어 점수와 영어 점수를 입력하세요 (한 줄씩 입력)");
					kor = Integer.parseInt(br.readLine());
					eng = Integer.parseInt(br.readLine());
					if((kor >= 100 || kor <= 0) || (eng >= 100 || eng <= 0)){
						System.out.println("0~100 사이로 다시 입력하세요");
						continue;
					}
					sum = kor + eng;
					System.out.println("국어 점수 : " + kor + ", 영어 점수 : " + eng + " / 합계 : " + sum);
				}else if(menu == 2) {
					System.out.println("평균 프로그램");
					System.out.println("국어 점수와 영어 점수를 입력하세요 (한 줄씩 입력)");
					kor = Integer.parseInt(br.readLine());
					eng = Integer.parseInt(br.readLine());
					if((kor >= 100 || kor <= 0) || (eng >= 100 || eng <= 0)){
						System.out.println("0~100 사이로 다시 입력하세요");
						continue;
					}
					avg = sum/2;
					System.out.println("국어 점수 : " + kor + ", 영어 점수 : " + eng + " / 평균 : " + avg);
				}
			}
	}
}
