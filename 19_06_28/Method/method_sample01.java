package Method;
//Method(함수 = function) : 자주 반복적으로 특정 작업을 실행하기 위한 명령어들의 집합입니다.
// 명령어: 연산자, 조건문, 반복문, 배열, 클래스, 오브젝트등을 말합니다.

import java.util.Scanner;

// 종류 4가지
//-------------------------
// 분류 기준
//-------------------------
// 전달 인자 값			결과 값의 리턴
//-------------------------
//1.	O			O  => 완성.
//2. 	O			X
//3.	X			O
//4.	X			X
//-------------------------
//메소드 = 함수는 원형의 정의시에 메소드 선언부, 메소드 정의부, 메소드 호출(실행)부



public class method_sample01 {
//field Area : 클래스 변수, 클래스 메소드, 생성자, 메소드.....
	
	/*
	 * public : 공개적인(열린): 누구든지 (public, protected, private)접근할 수 있다.
	 * static : 공유하는(클래스, 메소드, 변수)
	 * int : 정수형으로 반환하라
	 * Adder : 메소드명
	 * (int x1, int y1) : 매개 변수 값(파라메타)
	 * { : 메소드의 시작
	 * 	.........<코딩 부분>
	 * } : 메소드의 끝
	 * */
	//1
//	public static int Adder(int x1, int y1) { // 메소드 정의부(선언부 포함)
//		int sum=0;
//		sum = x1 + y1;
//		return sum;
//	}//static 이 있기에 공유할 수 있다.
	
	//2
//	public static void Adder(int x1, int y1) { // 메소드 정의부(선언부 포함)
//		int sum=0;
//		sum = x1 + y1;
//		System.out.println("2번 스타일 =" + sum);
//		
//	}//static 이 있기에 공유할 수 있다.
	
	//3
//	public static int Adder() { // 메소드 정의부(선언부 포함)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수형 값으로 두 수를 입력하세요.");
//		int sum3;
//		int x3 = sc.nextInt(); // 지역변수
//		int y3 = sc.nextInt();
//		
//		sum3 = x3 + y3;
//		return sum3; // 메소드 호출(실행)부, Adder(x, y) : x, y => 전달인자값 
//		
//	}//static 이 있기에 공유할 수 있다.
	
	//4
	public static void Adder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수형 값으로 두 수를 입력하세요.");
		int sum4; 
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		
		sum4 = x4 + y4;
		System.out.println("4.스타일 = " + sum4);
	}
	
	
	
	// 프로그램의 시작과 끝
	public static void main(String[] args) {
	//1번 스타일 두 수를 입력 받아서, 덧셈을 하여 출력합니다.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수형 값으로 두 수를 입력하세요.");
//		int x1 = sc.nextInt(); // 지역변수
//		int y1 = sc.nextInt();
//		
//		int result = Adder(x1, y1); // 메소드 호출(실행)부, Adder(x, y) : x, y => 전달인자값 
//		System.out.println("1번 스타일 =" + result);
		
		
		
		
	
	//2번 스타일 두 수를 입력 받아서, 덧셈을 하여 출력합니다.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수형 값으로 두 수를 입력하세요.");
//		int x1 = sc.nextInt(); // 지역변수
//		int y1 = sc.nextInt();
//		
//		Adder(x1, y1); // 메소드 호출(실행)부, Adder(x, y) : x, y => 전달인자값 
		


		
		
	//3번 스타일 두 수를 입력 받아서, 덧셈을 하여 출력합니다.
	
		
//		int result = Adder(); // 메소드 호출(실행)부, Adder(x, y) : x, y => 전달인자값 
//		System.out.println("3번 스타일 =" + result);
		
	//4번 스타일 두 수를 입력 받아서, 덧셈을 하여 출력합니다.
		Adder();
	}

	
}
