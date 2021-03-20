package JavaSample;

import java.util.Scanner;

public class Javamathod1_319_home {

/*
	//필드영역
	private static int sum(int x, int y) {
		
		int sum = x+y;
		return sum;
	
		
	}
	*/
	
	
	
	
	
//	public static void main(String[] args) { //메인범위
		//문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
		/*1. 스캐너 명령어적고
		 *2. x,y초기값 설정
		 *3. 전달인자(리턴값), 반환인자(입력값) 둘다 존재하는 메소드를 작성해야한다.
		 *4. 리턴값을 받아줄 변수를 메인범위에 작성해준다.(주의사항: 리턴 값 받을 변수명에 괄호를 열고,닫고 입력값 변수를 적어줘야한다)
		 *5. 메인 메소드 위에 리턴값 입력값에 대한 메소드를 작성하고 중괄호 열고,닫는다.
		 *6. 2번째 메소드 안에 메소드명을 변수로 설정후 덧셈연산식을 작성한다.
		 *7. 리턴명령어를 적고, 변수는 메소드명을 적는다.
		 */
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("값을 입력해주세요.");
		int y = sc.nextInt();
				
		int i = sum(x,y);
		System.out.println("최종값은 : "+ i);
				
		
		
		
		
		
		
	}
*/
	/*
	private static int sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요");
		int x = sc.nextInt();
		System.out.println("값을 입력해주세요");
		int y = sc.nextInt();
		
		int sum = x + y;
		return sum;
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {//메인범위
		
		//문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
		/*1. 스캐너 명령어적고
		 *2. x,y초기값 설정
		 *3. 전달인자(리턴값), 반환인자(입력값) 둘다 존재하는 메소드를 작성해야한다.
		 *4. 리턴값을 받아줄 변수를 메인범위에 작성해준다.(주의사항: 리턴 값 받을 변수명에 괄호를 열고,닫고 입력값 변수를 적어줘야한다)
		 *5. 메인 메소드 위에 리턴값 입력값에 대한 메소드를 작성하고 중괄호 열고,닫는다.
		 *6. 2번째 메소드 안에 메소드명을 변수로 설정후 덧셈연산식을 작성한다.
		 *7. 리턴명령어를 적고, 변수는 메소드명을 적는다.
		 *
		 *반환형O     전달인자X
		 */
		
	/*
		
		int i = sum();
		System.out.println("최종 값은 : " + i);
		*/
		/*
		private static int sum(int x, int y)
		{
			int sum = x + y;
			return sum;
			
			
		}
		
		
	public static void main(String[] args) {//메인범위
		//문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
				/*1. 스캐너 명령어적고
				 *2. x,y초기값 설정
				 *3. 전달인자(리턴값), 반환인자(입력값) 둘다 존재하는 메소드를 작성해야한다.
				 *4. 리턴값을 받아줄 변수를 메인범위에 작성해준다.(주의사항: 리턴 값 받을 변수명에 괄호를 열고,닫고 입력값 변수를 적어줘야한다)
				 *5. 메인 메소드 위에 리턴값 입력값에 대한 메소드를 작성하고 중괄호 열고,닫는다.
				 *6. 2번째 메소드 안에 메소드명을 변수로 설정후 덧셈연산식을 작성한다.
				 *7. 리턴명령어를 적고, 변수는 메소드명을 적는다.
				 *
				 *반환형O     전달인자O
				 */
		/*
	Scanner sc = new Scanner(System.in);
	
	System.out.println("값을 입력해주세요.");
	int x = sc.nextInt();
	System.out.println("값을 입력해주세요.");
	int y = sc.nextInt();
	
	int i = sum(x,y);
	System.out.println("최종 값은 : " + i);
	*/
	/*
	private static int sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("값을 입력해주세요.");
		int y = sc.nextInt();
		int sum = x + y;
		return sum;
		
		
		
	}
	
	
	
	public static void main(String[] args) {//메인범위 4번 반복하기
		//문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
		/*1. 스캐너 명령어적고
		 *2. x,y초기값 설정
		 *3. 전달인자(리턴값), 반환인자(입력값) 둘다 존재하는 메소드를 작성해야한다.
		 *4. 리턴값을 받아줄 변수를 메인범위에 작성해준다.(주의사항: 리턴 값 받을 변수명에 괄호를 열고,닫고 입력값 변수를 적어줘야한다)
		 *5. 메인 메소드 위에 리턴값 입력값에 대한 메소드를 작성하고 중괄호 열고,닫는다.
		 *6. 2번째 메소드 안에 메소드명을 변수로 설정후 덧셈연산식을 작성한다.
		 *7. 리턴명령어를 적고, 변수는 메소드명을 적는다.
		 *
		 *반환형O     전달인자X
		 */
/*
		int i = sum();
		System.out.println("최종값은 : " + i);
		
		
		*/
	/*
	private static int sum(int x, int y) {
		
		int sum = x + y;
		return sum;
		
	}
	
		
	public static void main(String[] args) {//메인범위 4번 반복하기
		
		//문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
		/*  1. 스캐너식 작성
		 * 	2. 전달인자 초기값 작성하기
		 * 	3. 리턴최종식 작성하기
		 * 	4. private static 리턴값(전달인자=매개변수) 메소드 작성하기
		 * 	5. 리턴값 변수에 덧셈식을 집어넣는다.
		 * 	6. 리턴명령문을 작성한다.
		 * 
		 * 		반환형 ㅇ  전달인자 ㅇ 형식
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력해주세요.");
		int x = sc.nextInt();
		
		System.out.println("값을 입력해주세요.");
		int y = sc.nextInt();
		
		int j = sum(x,y);
		System.out.println("최종값 : " + j);
		
		*/
	/*
	private static int sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("값을 입력해주세요.");
		int y = sc.nextInt();

		int sum = x + y;
		return sum;
		
		
		
	}
	
	
	
	public static void main(String[] args) {//메인범위 4번 반복하기
	
		//문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
		/*	1. Scanner식을 작성한다. 
		 * 	2. 덧셈 연산식을 수행할 전달인자 변수를 설정해준다.
		 * 	3. 리턴값을 받아줄 리턴식을 메인메소드에 작성한다. //괄호 잘 붙여줘야한다.
		 * 	4. private static 리턴값(전달인자) 식을 작성한다. (전달인자 X)
		 * 	5. 전달인자변수를 private static에 옮겨준다.
		 * 	6. private static 메소드에 리턴식을 작성해주고, 리턴명령문(return 블라블라)을 작성해준다. 
		 * 	전달인자 X 반환값 O
		 */
		
		/*
		int i =sum();
		System.out.println(i);
	*/
	/*
	private static int sum(int x, int y) {
		
		int sum = x + y;
		return sum;
		
		
		
		
	}
	*/
	
	/*
	public static void main(String[] args) {//메인범위 4번 반복하기
		
		//문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
		/*	1. 입력받을 수 있게 만들어주는 Scanner식을 작성한다.
		 * 	2. 덧셈식을 수행할 초기값을 설정해준다.
		 * 	3. 리턴값을 받아서 최종 출력해줄 리턴식을 작성한다.
		 * 	4. private static 리턴값(전달인자) 식을 작성해준다.(필드영역)
		 * 	5.	private static 안에 덧셈식을 수행할 리턴변수를 설정해준다.
		 * 	6. 리턴명령문을 작성한다.
		 * 	전달인자 O 반환값 O
		 * 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("값을 입력해주세요.");
		int y = sc.nextInt();
		
		int i = sum(x,y);
		System.out.println("최종값은 : " + i);
		
	*/
	/*
	private static int i() {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("값을 입력해주세요.");
		int y = sc.nextInt();
		
		
		int i = x + y;
		return i;
		
		
		
		
	}
	
	public static void main(String[] args) {//메인범위 4번 반복하기
		//문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
		/*	전달인자 X 반환값(리턴값) O
		 * 	1.메인메소드에 리턴값을 받아줄 변수와 리턴명을 작성한다.
		 * 	2.private static 메소드명(전달인자) 식을 작성해준다. (전달인자 X)
		 * 	3.값을 입력시킬수 있게 해주는 Scanner식을 작성한다.
		 *  4. 타입 리턴명 = 덧셈식을 수행할 변수와 연산식을 작성한다.(형태1)
		 * 	5. 리턴명령문을 작성한다.(return 리턴변수명;)
		 * 
		 * 
		 */
	/*
		int j = i();
		System.out.println("최종값은 : " + j);
	
	*/
	/*
	private static int j(int a, int b) {
		int j = a + b;
		return j;
	}
	
	public static void main(String[] args) {//메인범위 4번 반복하기
		//문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
		
		/*	반환값 O 전달인자 O
		 * 	1. 두 수를 입력시킬수있게 해주는 Scanner식을 작성한다.
		 * 	2. 덧셈을 연산 할 수 있게 해주는 두 수의 변수를 설정해준다.
		 * 	3. 리턴값을 받아줄 리턴 변수명을 설정하고, 리턴변수를 작성해주고 괄호안에 전달인자를 작성한다.
		 * 	4. private static 타입 리턴명(전달인자)를 작성한다.
		 * 	5. 리턴변수에서 두 수의 덧셈 연산식을 작성한다.
		 * 	6. 마지막으로 리턴 명령문을 작성한다. ( return 변수명;)
		 * 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력해주세요.");
		int a = sc.nextInt();
		System.out.println("값을 입력해주세요.");
		int b = sc.nextInt();
	
	
		int i = j(a,b);
		System.out.println("최종값은 : " + i);
	*/
	/*
	private static int j() {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요.");
		int a = sc.nextInt();
		System.out.println("값을 입력해주세요.");
		int b = sc.nextInt();
		
		int j = a + b;
		return j;
	}
	
	
	public static void main(String[] args) {//메인범위 4번 반복하기
		/*	전달인자 X 반환값 O
		 * 1. 연산식을 받아줄 리턴 변수를 메인메소드에 작성한다.	
		 * 2. private static 타입 리턴변수명(전달인자값) 작성한다.
		 * 3. 연산식에 수를 입력시킬 Scanner식을 작성한다.
		 * 4. 덧셈 연산식을 수행해줄 변수 2개를 설정한다.
		 * 5. 리턴변수에 덧셈연산식을 작성해준다.
		 * 6. 리턴명령문을 작성한다.
		 * 
		 */
	/*
		int i = j();
		System.out.println(i);
	*/
	/*
	private static int sum(int a, int b) {
		
		int sum = a + b;
		return sum;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {//메인범위 4번 반복하기
	
		//문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
		/*	반환값 O 전달인자 O
		 * 1. 인수 입력할 수 있게 Scanner식 작성하기	
		 * 2. 덧셈 연산을 수행할 변수 2개 작성하기
		 * 3. 리턴값을 받을 변수와 식 작성하기 (x,y)
		 * 4. private static 리턴값(전달인수) 
		 * 5. 덧셈연산식 작성후 리턴변수 정하기
		 * 6. 리턴명령문 작성하기
		 * 
		 */
	/*
		Scanner sc = new Scanner(System.in);

		System.out.println("값을 입력해주세요.");
		int a = sc.nextInt();
		System.out.println("값을 입력해주세요.");
		int b = sc.nextInt();
		
		int i = sum(a,b);
		System.out.println(i);
		*/
		
	/*
	 private static int i(){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("값을 입력해주세요.");
	int a = sc.nextInt();
	System.out.println("값을 입력해주세요.");
	int b = sc.nextInt();
	
	int i = a+b;
	return i;
	
	
	
	
}
	
	
	
	
	
	
	
	public static void main(String[] args) {//메인범위 4번 반복하기
		     //문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
				/*	반환값 O 전달인자 X
				 *  1.메인 메소드에 리턴값 받을 변수명과 식을 작성하기
				 *  2.private static 리턴명(전달인자1,전달인자2,----) 작성하기
				 *  3.덧셈 인수를 입력시킬 Scanner식 작성하기
				 *  4.덧셈 변수와 데이터 식 만들기
				 *  5.덧셈 연산식을 받을 리턴식 만들어주기
				 *  6.리턴 명령문 작성
				 *  
				 */
	/*
		int j = i();
		System.out.println("최종값은 : " + j);
	
	*/
	public static void main(String[] args) { //메인범위
		
	}
}
