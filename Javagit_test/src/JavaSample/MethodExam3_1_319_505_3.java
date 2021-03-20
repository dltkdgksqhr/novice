package JavaSample;
import java.util.Scanner;

public class MethodExam3_1_319_505_3 {
	                //byte, 합은 double

		private static void sum(byte x, int y) { //|바꾼곳2
//			===================================================
			double sum = x + y;  //55, 묵시적 형변환  |바꾼곳3
//			=================================================== 필드영역, 전역변수 = 클래스변수
			System.out.println("3. 반환형O     전달인자X : " + sum); //55.0
		}
	public static void main(String[] args) {
//                    3월 19일 오후3시
//         문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
//         3. 반환형X     전달인자O , 지역변수(if문, for문, main문 안에 선언된것은 지역변수이다.)     |두개 다 있는 경우



                          Scanner sc = new Scanner(System.in);
                          System.out.println("-- 첫번째 숫자를 입력하세요.");     
                           byte x = sc.nextByte(); //50 |바꾼곳1
                           System.out.println("-- 두번째 숫자를 입력하세요.");
                             int y = sc.nextInt(); //5





                        //55

                         sum(x,y); //argument 
	}

}
