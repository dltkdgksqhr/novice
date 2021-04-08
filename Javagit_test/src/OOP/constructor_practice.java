package OOP;

import java.util.Scanner;

/*  자바 생성자 연습
 * 1. 2개의 변수 덧셈
 * 2. 3개의 변수 덧셈
 * 3. 2개의 변수 뺄셈
 * 
 * ------------------------------------------------
 * 생성자 만드는 순서
 * 1. 메인메소드에 스캐너식과 변수식을 설정한다.
 * 2. 클래스 이름을 가지고 객체를 생성한다.
 * 3. 객체변수명을가지고 새로운 메소드를 생성하고, 괄호안에 전달인자변수명을 입력한다.
 * 4. 생성자 메소드 안에 연산식을 작성후 출력한다.
 
 * 
 */

public class constructor_practice {
	private int x;
	private int y;

	public constructor_practice(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	/*
	private int x;
	private int y;
	private String a;
	private int b;

	public constructor_practice(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public constructor_practice(String a, int b) {
		this.a = a;
		this.b = b;
		
	}
*/
	/*
	private int a;
	private int b;
	private String c;
	private int d;

	public constructor_practice(int a, int b) {
		this.a =a;
		this.b =b;
	}

	public constructor_practice(String c, int d) {
		this.c = c;
		this.d = d;
		
	}
*/
	/*
	
	private int a;
	private int b;
	private String c;
	private int d;

	public constructor_practice(int a, int b) {
		this.a=a;
		this.b=b;
	}

	public constructor_practice(String c, int d) {
		this.c = c;
		this.d = d;
		
	}
*/
	/*
	private int x;
	private int y;
	
	public constructor_practice(int x, int y) {
		this.x = x;
		this.y = y;
	}

	private void add(int x, int y) {
		int sum = x+y;
		System.out.println(sum);
		
	}
	/*
	private void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
		
		
	}
	
	private void adder(int c, int d, int e) {
		int sum = c + d + e;
		System.out.println(sum);
		
	}
	
	private void subtraction(int a, int b) {
		int sum = a -b;
		System.out.println(sum);
		
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 값을 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		constructor_practice op1 = new constructor_practice();
		op1.add(a,b);
		op1.subtraction(a,b);
		
		System.out.println("3개의 값을 입력해주세요.");
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		constructor_practice op2 = new constructor_practice();
		op2.adder(c,d,e);
		*/
	
	
	
	
	
	
	/*  자바 생성자 연습
	 * 1. 2개의 변수 덧셈
	 * 2. 3개의 변수 덧셈
	 * 3. 2개의 변수 뺄셈
	 * 
	 * ------------------------------------------------
	 * 생성자 만드는 순서
	 * 1. 메인메소드에 스캐너식과 변수식을 설정한다.
	 * 2. 클래스 이름을 가지고 객체를 생성한다.
	 * 3. 객체변수명을가지고 새로운 메소드를 생성하고, 괄호안에 전달인자변수명을 입력한다.
	 * 4. 생성자 메소드 안에 연산식을 작성후 출력한다.
	 
	 * 
	 */
	/*
	private void add(int x,int y) {
	int sum = x +y;
	System.out.println(sum);
		
	}

	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("2개의 값을 입력해주세요.");
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	constructor_practice os1 = new constructor_practice();
	os1.add(x,y);
	*/
	
	
	
	
	

	/*  자바 생성자 연습
	 * 1. 2개의 변수 덧셈
	 * 2. 3개의 변수 덧셈
	 * 3. 2개의 변수 뺄셈
	 * 
	 * ------------------------------------------------
	 * 객체 생성 메소드 만드는 순서
	 * 1. 메인메소드에 스캐너식과 변수식을 설정한다.
	 * 2. 클래스 이름을 가지고 객체를 생성한다.
	 * 3. 객체변수명을가지고 새로운 메소드를 생성하고, 괄호안에 전달인자변수명을 입력한다.
	 * 4. 생성자 메소드 안에 연산식을 작성후 출력한다.
	 *--------------------------------------------------------
	 *	생성자 만드는 순서
	 *	1. 클래스명 객체변수명 = new 클래스명(전달인자값);
	 *  2. 빨간 밑줄나오면 생성자 만든다.
	 *  3. 생성자안에 this.전달인자 변수명을 작성한다.
	 *  4. 최종 출력식은 객체 생성 메소드에서 실행한다.
	 *  
	 *   4번 반복하기
	 *  
	 */
	
	/*
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 값을 입력해주세요.");
		int x= sc.nextInt();
		int y= sc.nextInt();
		
	
		constructor_practice os2 = new constructor_practice(x,y);
		os2.add(x,y);
	
		}
	*/
		

	/*  자바 생성자 연습
	 * 1. 2개의 변수 덧셈
	 * 2. 3개의 변수 덧셈
	 * 3. 2개의 변수 뺄셈
	 * 
	 * ------------------------------------------------
	 * 객체 생성 메소드 만드는 순서
	 * 1. 메인메소드에 스캐너식과 변수식을 설정한다.
	 * 2. 클래스 이름을 가지고 객체를 생성한다.
	 * 3. 객체변수명을가지고 새로운 메소드를 생성하고, 괄호안에 전달인자변수명을 입력한다.
	 * 4. 생성자 메소드 안에 연산식을 작성후 출력한다.
	 *--------------------------------------------------------
	 *	생성자 만드는 순서
	 *	1. 클래스명 객체변수명 = new 클래스명(전달인자값);
	 *  2. 빨간 밑줄나오면 생성자 만든다.
	 *  3. 생성자안에 this.전달인자 변수명을 작성한다.
	 *  4. 필드영역에 전달인자 변수명을 private 타입 변수명; 형식으로 선언해준다.
	 *  5. 최종 출력식은 객체 생성 메소드에서 실행한다.
	 *  
	 *   4번 반복하기
	 *  
	 */
	/*
	private void add() {
		int z = Integer.parseInt(c);
		int sum = z + d;
		System.out.println(sum);
		
	}
	private void adder() {
		System.out.println("합계 : " + (a + b));
		
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2개의 값을 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		constructor_practice os2 = new constructor_practice(a,b);
		os2.adder();
		
		System.out.println("2개의 값을 입력해주세요");
		String c = sc.next();
		int d = sc.nextInt();
		constructor_practice os3 = new constructor_practice(c,d);
		os3.add();
	
	
	*/
	/*  자바 생성자 연습
	 * 1. 2개의 변수 덧셈
	 * 2. 3개의 변수 덧셈
	 * 3. 2개의 변수 뺄셈
	 * 
	 * ------------------------------------------------
	 * 객체 생성 메소드 만드는 순서
	 * 1. 메인메소드에 스캐너식과 변수식을 설정한다.
	 * 2. 클래스 이름을 가지고 객체를 생성한다.
	 * 3. 객체변수명을가지고 새로운 메소드를 생성하고, 괄호안에 전달인자변수명을 입력한다.
	 * 4. 생성자 메소드 안에 연산식을 작성후 출력한다.
	 *--------------------------------------------------------
	 *	생성자 만드는 순서
	 *	1. 클래스명 객체변수명 = new 클래스명(전달인자값);
	 *  2. 빨간 밑줄나오면 생성자 만든다.
	 *  3. 생성자안에 this.전달인자 변수명을 작성한다.
	 *  4. 필드영역에 전달인자 변수명을 private 타입 변수명; 형식으로 선언해준다.
	 *  5. 최종 출력식은 객체 생성 메소드에서 실행한다.
	 *  
	 *   4번 반복하기
	 *  
	 */
	/*
	private void add() {
		System.out.println("합계 : " + (a +b));
		
	}
	
	private void add2(String c, int d) {
		int y = Integer.parseInt(c);
		int sum = y + d;
		System.out.println(sum);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 값을 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		constructor_practice os3 =new constructor_practice(a,b);
		os3.add();
		
		System.out.println("2개의 값을 입력해주세요.");
		String c = sc.next();
		int d = sc.nextInt();
		
		constructor_practice os4 =new constructor_practice(c,d);
		os4.add2(c,d);
		
		
		*/
	/*

	private void add() {
		System.out.println("합계 : " + (x + y));
		
	}

	private void add2() {
		int z = Integer.parseInt(a);
		int sum = z +b;
		System.out.println(sum);
		
	}

		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("2개의 값을 입력해주세요.");
	
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	constructor_practice os3 = new constructor_practice(x,y);
	os3.add();
		
	String a = sc.next();
	int b = sc.nextInt();
	
	constructor_practice os4 = new constructor_practice(a,b);
	os4.add2();
		
		*/
	/*  자바 생성자 연습
	 * 1. 2개의 변수 덧셈
	 * 2. 3개의 변수 덧셈
	 * 3. 2개의 변수 뺄셈
	 * 
	 * ------------------------------------------------
	 * 객체 생성 메소드 만드는 순서
	 * 1. 메인메소드에 스캐너식과 변수식을 설정한다.
	 * 2. 클래스 이름을 가지고 객체를 생성한다.
	 * 3. 객체변수명을가지고 새로운 메소드를 생성하고, 괄호안에 전달인자변수명을 입력한다.
	 * 4. 생성자 메소드 안에 연산식을 작성후 출력한다.
	 *--------------------------------------------------------
	 *	생성자 만드는 순서
	 *	1. 클래스명 객체변수명 = new 클래스명(전달인자값);
	 *  2. 빨간 밑줄나오면 생성자 만든다.
	 *  3. 생성자안에 this.전달인자 변수명을 작성한다.
	 *  4. 필드영역에 전달인자 변수명을 private 타입 변수명; 형식으로 선언해준다.
	 *  5. 최종 출력식은 객체 생성 메소드에서 실행한다.
	 *  
	 *   4번 반복하기
	 *  
	 */
	private void add() {
		System.out.println("합계 : " + (x + y));
		
	}
		
   public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("2개의 값을 입력해주세요.");
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	constructor_practice os2 = new constructor_practice(x,y);
	os2.add();
	
	
	
	
	
		
	}

	
	

	

}
