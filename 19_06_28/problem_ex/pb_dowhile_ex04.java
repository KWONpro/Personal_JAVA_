package problem_ex;
 // 5!을 dowhile로 작성하시오
public class pb_dowhile_ex04 {
	public static void main(String[] args) {
		int i=1, result=1;;
		do {
			result *= i;
			System.out.println("i= " + i + ", result : "+ result);
			i++;
		}while(i<=5);
		
	}
}
