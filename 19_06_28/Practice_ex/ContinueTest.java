package Practice_ex;
//1에서 10까지 짝수와 홀수 구분하기
public class ContinueTest {
	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			if(i%2==0) {
//				continue; // skip
//			}
//			System.out.print("[" + i+ "]");
//		}
		
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
