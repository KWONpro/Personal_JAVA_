package problem_ex;
//문제] 1~200 사이의 7의 배수의 합과 갯수를 구하여 출력한다.
public class pb_while_ex04 {
	 public static void main(String[] args) {
		 int i=1, sum=0, count=0;
		 while(i<=200) { // 14 < =200, 21 <= 200
			 if(i%7==0) { 
				 sum+=i; // 7+14 = 21, 21 + 21 =42
				 
				 count+=1; // 1 ,2 ,3
				 System.out.println("i값은 "+i+", 7의 배수 합 : "+ sum + "\n갯수 : " + count);
			 }
			 i++;
		 }
		 
	 }
}


//for(i=7; i<=200; i+=7)