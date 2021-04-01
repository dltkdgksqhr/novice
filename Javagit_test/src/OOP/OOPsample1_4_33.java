package OOP;


import java.util.Scanner;



/*   문제> 2개의 숫자를 입력받아서 합계를 구하는 프로그램을 작성하세요.

*  method()

*  객체를 생성하여 메소드 호출

*  반환값  전달인자

*   X      X

*   X      O

*   O      X

*   O      O

*   

*   1. 절차지향적(비객체지향) 코드 작성 후

*   2. 객체지향적 코드 작성

*   

*/


	public class OOPsample1_4_33 {

		private static int divi(int x, int y) {

		

		int sum = x / y;

		return sum;

	}

	

	

	/*

	private static int multi() {

		Scanner sc = new Scanner(System.in);

		System.out.println("x의값을 입력해주세요.");

		int x = sc.nextInt();

		System.out.println("y의값을 입력해주세요.");

		int y = sc.nextInt();

		int sum = x * y;

		return sum;

	}

	*/

	

/*

	private static void Subtract(int x, int y) {

		int sum = x - y;

		System.out.println("뺄셈 :  " + sum);

		

	}

	*/



	

/*

	private static void Adder() {

		Scanner sc = new Scanner(System.in);

		System.out.println("x의값을 입력해주세요.");

		int x = sc.nextInt();

		System.out.println("y의값을 입력해주세요.");

		int y = sc.nextInt();

		

		int sum = x + y;

		System.out.println("덧셈 :  " + sum);

		

	}

	*/

		public static void main(String[] args) {

			//OOPsample1_4_331 os3 = new OOPsample1_4_331(); // 1000번지

			//os2.Adder(); //객체명.메소드명 (공식)

			

			/*

			Scanner sc = new Scanner(System.in);

			System.out.println("x의값을 입력해주세요.");

			int x = sc.nextInt();

			System.out.println("y의값을 입력해주세요.");

			int y = sc.nextInt();

			뺄셈전용

			*/

		

			//Adder(); //반환값 :X 전달인자 : X  덧셈

			

			//Subtract(x,y); //반환값 :X 전달인자 : O 뺼셈

			

			 //int sum = multi();//반환값 :O 전달인자 : X  곱셈

			 //System.out.println("곱셈 : " + sum);

			

			

			Scanner sc = new Scanner(System.in);

			System.out.println("x의값을 입력해주세요.");

			int x = sc.nextInt();

			System.out.println("y의값을 입력해주세요.");

			int y = sc.nextInt();

			int sum = divi(x,y); //반환값 :O 전달인자 : O  나눗셈

			System.out.println("나눗셈 : " + sum);

			

			

		
			

		}

 

	

 

 

	}