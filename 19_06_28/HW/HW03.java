package HW;

import java.util.Scanner;

// 과제3]컴퓨터와 숫자 맞추기 게임을 합니다.
//하나의 난수는 컴퓨터가 발생하여 저장하고, 그 숫자를 사람이 맞추어가는 형태로 진행합니다.
// 카운트하여 몇번만에 맞추었는지도 출력하고 게임을 계속 진행 하려면
//yes(1)를 그만 두려면 no(2)를 입력합니다.
public class HW03 {
	public static void main(String[] args) {
		int status = 0, count=0;
		int search_num;
		Scanner sc = new Scanner(System.in);
		
		do {
		
			System.out.println("------------컴퓨터와 숫자 맞추기 게임------------");
			System.out.println("맞출 숫자는 1~20사이의 수입니다.");
			int Random_num = (int)(Math.random()*20+1);
			System.out.println("Random 숫자 발생");
			while(true) {
				System.out.println("숫자를 입력하세요");
				//Random_num = (int)(Math.random()*20+1);
				search_num = sc.nextInt();
				//System.out.println(Random_num);
			
				if(Random_num != search_num) {
					System.out.println("숫자를 틀리셨습니다.");
					count+=1;
					System.out.println("반복횟수 : " + count);
				
				}else {
					System.out.println("정답입니다!!!!!");
					System.out.println("반복횟수 : " + (count+1));
					count=0;
					System.out.println("다시하려면 yes(1) 중지하려면  no(2) 입력");
					status = sc.nextInt();
					if(status == 2) {
						System.out.println("프로그램 종료");
						System.exit(0);
					}else if(status == 1) {
						Random_num = (int)(Math.random()*20+1);
					}
				}
			}
		}while(true);
	}
}
