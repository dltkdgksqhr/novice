package Exception;


import java.util.InputMismatchException;

import java.util.Scanner;



/*

* InputMismatchException: 데이터 형이 다르게 입력되어서 발생합니다.(한글 , 영문자, 실수형 입력시 발생) 

* 

* 1~100사이의 합계를 구하는 프로그램을 작성하세요.

* 단, 예외처리를 합니다.

* 

*/

public class InputMismatchExceptionSample {

	



	private static void addsum(int startNumber, int endNumber) {

		int sum =0;

		

		for(int i=startNumber;i<=endNumber;i++) {

			sum+=i;

			

		}

		System.out.println("1~100의 합은 : " + sum);

	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

		

		try {

		System.out.println("2개의 값을 입력해주세요.");

		int startNumber =sc.nextInt();

		int endNumber =sc.nextInt();

		

		addsum(startNumber,endNumber);

		}catch(InputMismatchException e) {

			System.out.println("숫자 2개 모두 정수형으로 입력해주세요.");

		}

 

		

		

 

	}

 

}