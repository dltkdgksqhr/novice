package OOP;


import java.util.Scanner;



/*   문제> 2개의 숫자를 입력받아서 합계를 구하는 프로그램을 작성하세요.

*  OOPsample1_4_1_331에 있는 method()를 가져다가(접근하여) 호출하면 4가지 method를 실행할 수 있습니다.

*  

*/
    public class OOPsample1_5_331 {

	public static void main(String[] args) {

		OOPsample1_4_1_331 os4 = new OOPsample1_4_1_331(); // 1000번지

		

		 Scanner sc = new Scanner(System.in);

		os4.Adder();

		

		 System.out.println("뺄셈에 참여할 데이터 2개를 입력하세요.");

	      int x = sc.nextInt();

	      int y = sc.nextInt();

		os4.Subtract(x,y);

		

		int sum = os4.multi();

		System.out.println("곱셈: " + sum);

		

		

		 System.out.println("나눗셈에 참여할 데이터 2개를 입력하세요.");

	      int x2 = sc.nextInt();

	      int y2 = sc.nextInt();

	     

		int sum2 = os4.divi(x2,y2);

		System.out.println("나눗셈: " + sum2); 

		


		

		

		

	}









}