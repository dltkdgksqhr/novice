package OOP;
/* 객체지향 프로그래밍

 * 클래스 : 객체를 구현하려면 먼저 클래스에서 선언해주어야합니다. 

 *  - 클래스로부터 객체가 생성되어 사용됩니다.

 * 객체  : 참조변수 = 객체의 인스턴스 = 포인터 = 주소값 

 *  - 속성 : 현실에 존재하는 내용

 *  - 기능 : 행위, 동작표현  => 메소드  

 *  종류 : 모니터, 본체, 마우스, 키보드, 주전자, 물, 바위, 동물 .........................

 *  

 * 

 * 

 * 

 */
public class OOPsample1_329 {


		private String productNo;  //기본이 null값 ==> coffee001

		private String productName; //null  ==> 카푸치노

		private String productPrice; //0   ---> 2500

		 

			//필드영역

			public static void main(String[] args) {

				OOPsample1_329 os1 = new OOPsample1_329(); 

				

				os1.productNo = "coffee001";

				os1.productName = "카푸치노";

				os1.productPrice = "2500";

				

				System.out.println("품목 번호 :" + os1.productNo); //coffee001

				System.out.println("품목명 : " + os1.productName); //카푸치노

				System.out.println("가격 :" + os1.productPrice); //2500

				

		 

			}

		 

		}
