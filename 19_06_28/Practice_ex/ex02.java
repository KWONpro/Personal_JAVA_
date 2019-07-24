package Practice_ex;
// 1에서 100까지 짝수와 홀수 구하기
public class ex02 {
	public static void main(String[] args) {
		int i=1;
		while(i<=100) {
			if(i%2==0) {
				System.out.print("짝수는["+ i +"] ");
			}else if(i%2==1) {
				System.out.print("홀수는["+ i +"]");
			}
			i++;
		}
	}
}
