package JavaSample;
import java.util.Scanner;

public class MethodExam4_319_505_4 {
private static void sum() { 

		Scanner sc = new Scanner(System.in);
		System.out.println("-- 첫번째 숫자를 입력하세요.");         //
		int x = sc.nextInt(); //50
		System.out.println("-- 두번째 숫자를 입력하세요.");
		int y = sc.nextInt(); //5
//		===================================================
		int sum = x + y;  //55 |  
//		=================================================== 필드영역, 전역변수 = 클래스변수
		System.out.println("4. 반환형X     전달인자X : " + sum); //55


	}
	public static void main(String[] args) {// 메인범위
//                           3월 19일 오후3시
//                      문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
//                       4. 반환형X     전달인자X , 지역변수(if문, for문, main문 안에 선언된것은 지역변수이다.)     |두개 다 있는 경우





                                 sum();

	}

}
