package problem_ex;
// 2. while. break
public class pb_while_break_ex04 {
	public static void main(String[] args) {
	
		int i = 1;
		while(true) {
			
			if(i%5==0 && i%7==0) {
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}
