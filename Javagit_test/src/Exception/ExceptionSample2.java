package Exception;
import java.util.InputMismatchException;

import java.util.Scanner;

 

   public class ExceptionSample2 {

	   

	private static double sum() { //|바꾼곳 1

		Scanner sc = new Scanner(System.in);

		int x=0,y=0;

		

		try {

		System.out.println("-- 첫번째 숫자를 입력하세요.");         

		 x = sc.nextInt(); //50.123   |바꾼곳 1

		System.out.println("-- 두번째 숫자를 입력하세요.");

		 y = sc.nextInt(); //5

 

		}catch(InputMismatchException e) {

			System.out.println("**** 정수형 데이터를 입력해주세요. ****");

		}

		double sum = x + y;

		return sum; 

		

		

	}

 

	public static void main(String[] args) {
		double i = sum(); //argument  //반환받는것|바꾼곳 1

		System.out.println("2. 반환형O     전달인자X : " + i); //55

		

		

		

	}

 

}
