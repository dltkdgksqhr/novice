package JavaSample;
import java.util.Scanner;

public class MethodExam2_319_505_2 {
	
	private static int sum() { 

		Scanner sc = new Scanner(System.in);
		System.out.println("-- 첫번째 숫자를 입력하세요.");         //1.숫자 입력
		int x = sc.nextInt(); //50
		System.out.println("-- 두번째 숫자를 입력하세요.");
		int y = sc.nextInt(); //5

		

//		===================================================

		int sum = x + y;  //55 | //2.x+y=55값이 sum에 담긴다.
		return sum; //55         //3. sum을 리턴해준다. 밑으로 내려감

//		=================================================== 필드영역, 전역변수 = 클래스변수
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		
//	        3월 19일 오후3시

//		    문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
//			2. 반환형O     전달인자X , 지역변수(if문, for문, main문 안에 선언된것은 지역변수이다.)     |두개 다 있는 경우
//			   55
			int i = sum(); //argument  //반환받는것 //4.반환받아서 i변수에 담긴다 .

			System.out.println("2. 반환형O     전달인자X : " + i); //55 | 5. 여기서 출력된다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
