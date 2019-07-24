package problem_ex;
// do ~ while : 무조건 실행을 하고 조건을 나중에 체크하여 거짓이면 종료.
public class pb_dowhile_ex01 {
	public static void main(String[] args) {
		//1~100까지 7의 배수의 합과 갯수를 구하여 출력합니다.
		int i=1, count=0, sum=0;
		do {
			if(i%7==0) {
				sum += i;
				count+=1;
			}
			i++;
		}while(i<=100);
		System.out.println("1~100까지의 7의 배수의 합 : "+sum + "\n 갯수 :" + count);
	}
}

