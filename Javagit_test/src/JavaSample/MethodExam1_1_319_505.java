package JavaSample;
import java.util.Scanner;



public class MethodExam1_1_319_505 {
//	1번예제를 기반으로 float하나 추가

//	필드영역 : 클래스 변수 = 멤버 변수 = static 변수 = 전역 변수

	

//	               void ==> int로 바꿔 줌(반환기능) |순서6 

	private static float sum(float x, int y) { //x =50, y =5의 값이 밑에서 여기로 전달된다. , 매개변수 = parameter (전달받았을땐 parameter) |순서3|바꾼곳3

//		===================================================

		float sum =x + y;  //55 |순서4 |바꾼곳4

		return sum; //55   |순서5

//		=================================================== 필드영역, 전역변수 = 클래스변수
	}

	 
	public static void main(String[] args) {// 메인범위

//      3월 19일 오후3시

//문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.

//1. 반환형O     전달인자O , 지역변수(if문, for문, main문 안에 선언된것은 지역변수이다.)     |두개 다 있는 경우

                     Scanner sc = new Scanner(System.in);
                     System.out.println("-- 첫번째 숫자를 입력하세요.");         //순서 1
                             float x = sc.nextFloat(); //50.123 |바꾼곳1
                     System.out.println("-- 두번째 숫자를 입력하세요.");
                             int y = sc.nextInt(); //5



//                  변수 이름이 같아도 오류가 안나는이유가 저장되는 메모리 위치가 다르기때문
//                               55

                    float i = sum(x, y); //argument(전달했냐할땐 argument), x = 50, y =5, call by value, 비객체지향적 프로그래밍   | 메소드 이름 |순서2 |순서7 |바꾼곳2
                    System.out.println("1. 반환형O     전달인자O : " + i); //55
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
