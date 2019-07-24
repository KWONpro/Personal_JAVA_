package Method;
/*
 * 문제] 두 수를 입력 받아서 덧셈, 뺄셈, 곱셈, 나눗셈(몫), 나눗셈(나머지)를 구현하는 프로그램.
 * 1. 요구사항 파악 : 덧셈, 뺄셈, 곱셈, 나눗셈(몫), 나눗셈(나머지)
 * 2. 요구사항 분석 : 생략
 * 3. 요구사항 설계 : int, int 데이터, 변수명(first, second), 합계 (sum)
 * 3-1 메소드 명: 덧셈(Adder), 뺄셈(Suber), 곱셈(Multier), 나눗셈(Divider_Mok), 나눗셈(Divider_Re)
 * 		클래스명 : CalAdder, CalSuber, CalMultier, CalDivider_Mok, CalDivider_Re, main : method_sample05
 * 		object : add,        sub,        mul,          mok,             re              total
 * 
 * 
 * 
 * */
public class method_sample05 {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요");
		CalAdder add = new CalAdder();
		add.Adder(); // 객체명.메소드명
		
		System.out.println("두 수를 입력하세요");
		CalSuber sub = new CalSuber();
		sub.Suber();
		
		System.out.println("두 수를 입력하세요");
		CalMultier mul = new CalMultier();
		mul.Multier();
		
		System.out.println("두 수를 입력하세요");
		CalDivider_Mok mok = new CalDivider_Mok();
		mok.Divider_Mok();
		
		System.out.println("두 수를 입력하세요");
		CalDivider_Re re = new CalDivider_Re();
		re.Divider_Re();
	}
}
