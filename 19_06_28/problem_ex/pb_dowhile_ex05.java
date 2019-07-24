package problem_ex;
 // 1 ~ 100사이에 3의 배수이면 건너뛰세요. 3의 배수가 아니면, 출력합니다.
public class pb_dowhile_ex05 {
	public static void main(String[] args) {
		int i =0;
		do {
			i++;
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
			
		}while(i<100);
	}
}
