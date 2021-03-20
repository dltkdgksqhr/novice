package JavaSample;
import java.util.Scanner;



/*  method란 무엇인가?
 *  메소드는 특정한 조건을 지니는 조건문이나 반복문을 함수 형태로 만들어서 사용하는 방법을 말합니다. 
 *  메소드 구분 기준 4가지 형태
 * -----------------------------
 *       반환형       전달인자
 * -----------------------------
 *  1.    O           O
 * 	2.    O           X
 *  3.    X           O
 *  4.    X           X
 * -----------------------------
 * 
 */

public class MethodExam2_1_319_505_2 {
	
//	예제 2번을기반으로 int를 double로 변환
//	필드영역 : 클래스 변수 = 멤버 변수 = static 변수 = 전역 변수
      
	 private static double sum() { //|바꾼곳 1
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

	public static void main(String[] args) {// 메인범위

       //      3월 19일 오후3시
      //문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
      //2. 반환형O     전달인자X , 지역변수(if문, for문, main문 안에 선언된것은 지역변수이다.)     |두개 다 있는 경우



              //55
         double i = sum(); //argument  //반환받는것|바꾼곳 1
           System.out.println("2. 반환형O     전달인자X : " + i); //55


		
		
		
		
	}

}
