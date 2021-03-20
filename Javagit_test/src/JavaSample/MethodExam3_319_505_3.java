package JavaSample;
import java.util.Scanner;

public class MethodExam3_319_505_3 {

	private static void sum(int x, int y) { 

//		===================================================
		int sum = x + y;  //55 |  
//		=================================================== 필드영역, 전역변수 = 클래스변수
		System.out.println("3. 반환형X     전달인자O : " + sum); //55


	}
	
	
	public static void main(String[] args) {// 메인범위

                   //      3월 20일 오후2시
               // 문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
				/*	1,2번 유형이랑 다른점 반환형이 없는것의 특징
				 * 	1. void(없음으로 작성되어있음)
				 * 	2. 전달인자 있음
				 * 	3. 리턴 명령문이 없다.
				 * 	4. 메인 메소드 리턴값을 받는 변수 식이 없다.(private메소드에는 있음)
				 * 	5. 출력을 private 메소드에서 해준다.
				 */
               //3. 반환형X     전달인자O , 지역변수(if문, for문, main문 안에 선언된것은 지역변수이다.)     |두개 다 있는 경우



                             Scanner sc = new Scanner(System.in);
                             System.out.println("-- 첫번째 숫자를 입력하세요.");         
                             int x = sc.nextInt(); //50
                             System.out.println("-- 두번째 숫자를 입력하세요.");
                             int y = sc.nextInt(); //5


                              sum(x,y); //argument  //




		

	}

}
