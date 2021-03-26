package ArraySample;
import java.lang.reflect.Array;

import java.util.Arrays;

import java.util.Collections;

import java.util.InputMismatchException;

import java.util.Scanner;


/*                 배열이란? 하나의 이름으로 여러개의 많은 데이터 변수들을 선언하는 정적인 구조의 자료구조.

*                 문제> 번호    , 이름     , 자바,     JSP    , Spring,   총점,     평균     구하여 출력하세요.

*                  int     Stiring   Double   Double   Double  Double   Double  (타입)

*                            3월 24일 12시 (집에서 분석해보기)

*   

*/

//                                3/24일 오후5시  (집에서 분석하고 연습하기)

//              문제> 데이터를 n개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.

//                   데이터는 정수형입니다 , 반복문 사용, mathod()적용 기준 선택: 4가지 중 하나 선택

//                   데이터 중에서 4번째 원소의 값을 100으로 변경하고 출력합니다.

//					  그리고 모든 원소의 값을 0으로 초기화 시키고 출력합니다.

//					옆으로 작성하고 싶으면 print명령어 작성 

//                  그 원소의 값을 변경시키고싶으면 배열 변수명[인덱스번호] = 100; 이런 형식으로 적으면 된다.
public class ArraySample1_4_324_7 {
	private static int j;

	  private static int[] ran = new int[j];



	

	private static void element2(int j) {

		int[] ran = new int[j];

		

		

		 //for(int i=0; i<ran.length;i++) {

			 //if(ran[3] == (ran[3])) {

				

			 //} else {

			 System.out.print(ran[3] + ", ");

			 //}

		// }   

		   

		   

		  System.out.println();

		

	}

	

	private static void element3(int j) {

		int[] ran = new int[j];

		

		  for(int i=0; i<ran.length;i++) {		

		  		ran[i] = 1000; //초기화 0값을 넣는다.

		  		System.out.print(ran[i] + ", ");

		  	}

	 

		

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		  System.out.println("반복할 횟수를 입력해주세요.");

		   int j = sc.nextInt();

		    

		    int[] ran = new int[j];

	 

		  	for(int i=0; i<ran.length;i++) {		

		  		ran[i] = sc.nextInt();

		  		System.out.print(ran[i] + ", ");

		  	}

				  

		System.out.println(); //입력,출력부분

		

		

		 ran[3] = 100; // 4번째 원소(방) |43~ 47한묶음

		 System.out.println(ran[3]);

			//element2(j);

			element3(j);
	}

}
