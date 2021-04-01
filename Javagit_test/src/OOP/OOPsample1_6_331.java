package OOP;
import java.util.Scanner;



/*   문제> 2개의 숫자를 입력받아서 합계를 구하는 프로그램을 작성하세요.

 *  OOPsample1_4_1_331에 있는 method()를 가져다가(접근하여) 호출하면 4가지 method를 실행할 수 있습니다.

 *  

 */
public class OOPsample1_6_331 {
	static double sum() { //|바꾼곳 1

		Scanner sc = new Scanner(System.in);

		System.out.println("-- 첫번째 숫자를 입력하세요.");         //

		double x = sc.nextDouble(); //50.123   |바꾼곳 1

		System.out.println("-- 두번째 숫자를 입력하세요.");
		
		int y = sc.nextInt(); //5

		

//		===================================================

		double sum = x + y;  //55 ||바꾼곳 1

		return sum; //55   

//		=================================================== 필드영역, 전역변수 = 클래스변수

 

		

		

		

	}

 

		public static void main(String[] args) {

			OOPsample1_6_331 os5 = new OOPsample1_6_331();

			double i= os5.sum();

 

			System.out.println("1. 반환형O     전달인자X : " + i); //55

			

			

			

 

			

			

			

		}

 

	

 

 

	}