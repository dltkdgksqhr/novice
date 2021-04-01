
package OOP;
/*   문제> 1~100사이의 합계를 구하는 프로그램을 작성하세요.
 *  연습 방법
 *  1. 비객체지향적으로만든후
 *  2. 객체지향으로 옮기기
 * 
 */


public class OOPsample1_3_331 {  	 
	 
	
	
	/*
	private void Adder() {
		int sum=0;
		
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		
		System.out.println(sum);
		
		객체지향
	}
	*/
	
//	비객체지향
//	반환값 :X 전달인자 : X
	private static void Adder() {
         int sum =0;
		
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		
		System.out.println(sum);
		
	}

	/*반환값 :X 전달인자 : O
	private static void Subtact(int sum) {
		
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		
		System.out.println(sum);
		
	}
*/
	/*
	private static int multi() {
		 int sum = 0;
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		
		return sum;
		
		
	}
*/
	
	/*
	private static int divi(int sum) {
		
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		return sum;
	}

	
	*/
		//필드영역
		public static void main(String[] args) {
			//OOPsample1_2_331 os2 = new OOPsample1_2_331(); // 1000번지
//			os2.Adder(); //객체명.메소드명 (공식)
			
			 
			Adder(); //반환값 :X 전달인자 : X
			//Subtact(sum); //반환값 :X 전달인자 : O
			 //반환값 :O 전달인자 : X
			//divi(); //반환값 :O 전달인자 : O
			
			/*
			   int b=multi();
			 System.out.println(b);
			 */

			/*
			 int sum = 0;
	
				int b = divi(sum);
			
			System.out.println(b);
			*/
			
			
			
			
			/*   문제> 2개의 숫자를 입력받아서 합계를 구하는 프로그램을 작성하세요.
			 *  method()
			 *  객체를 생성하여 메소드 호출
			 *  반환값  전달인자
			 *   X      X
			 *   X      O
			 *   O      X
			 *   O      O
			 *   
			 *   1. 절차지향적(비객체지향) 코드 작성 후
			 *   2. 객체지향적 코드 작성
			 *   
			 */
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}



	}