	// 반복문 : 특정 조건을 반복합니다.

		/*for문 (초기값; 조건식; 증감식) : 가장 많이 됩니다.

		 * 

		 * while(조건식) { .... } : 두번째로 많이 됩니다.

		 * 

		 * do {

		 *     ......

		 * } while(조건식)

		 * 

		 */



import java.util.Scanner;

public class hakwon316 {

	public static void main(String[] args) {
//	 3월 16일 배운것	
	
		 

		
		 

//		
//				// 조건 > 5명의 성적을 입력받아서, 학점을 출력하세요.
//
//			 Scanner sc = new Scanner(System.in);
//
//			 
//
////			 	    덧셈과 뺼셈 대부분은 초기값을 0으로 합니다. (암기)
//
////			        곱셈과 나눗셈은 대부분은 초기값을 1로 합니다. (암기)
//
//			 
//
////		            초기값  3 < 5  3  	 
//
//			   for(int i=0; i < 5;i++) { //조건식이 참인 경우에는 반복하다가 거짓이되면 실행을 중지합니다.
//
//				   System.out.println("성적을 입력해주세요 : ");
//
//			   int score = sc.nextInt(); //96 , 45, 88, 34, 100, 67, 76
//
//				
//
////			     만약에 96 >= 90, 	45 >= 80 , 88 >= 90 , 34 >= 90
//
//				if(score>=90)
//
//					System.out.println("점수가 90점 이상이고, A학점입니다.");
//
////				     45 >= 80, 88 >= 80, 34 >= 80
//
//				else if(score>=80)
//
//					System.out.println("점수가 80점 이상이고, B학점입니다.");
//
////				     45 >= 70, 34 >= 70
//
//				else if(score>=70)
//
//					System.out.println("점수가 70점 이상이고, C학점입니다.");
//
////				     45 >= 60, 34 >= 70
//
//				else if(score>=60)
//
//					System.out.println("점수가 60점 이상이고, D학점입니다.");
//
//				
//
//				else {
//
//					System.out.println("F학점입니다.");
//
//				
//
//				}
//
//				// 여기로 탈출합니다.
//
//			   }

				

//			   문제1 : 1 ~ 100사이의 3의배수를 구하여 개수가 몇개인지 출력하고, 합계를 출력하세요.  (문제들 집에서 다시 풀어보기)

//				for(     )해결

			   int count =0, sum =0; // 1,3

			   

			   for(int su =3; su <= 100; su++) {

				   if(su % 3 == 0)

				   {

				   count++;

				   sum += su; //0+3 = 3, 6 + 3=  

				   System.out.println("번호 : " + count + " " +"숫자 : " + su);

				   }

					   

			   }

			   System.out.println("3의 배수의 개수: " + count);

			   System.out.println("3의 배수의 합계: " + sum);

			

				

				

				   

//				문제2 : 이젠컴퓨터아카데미라는 문자열을 5번 반복하여 출력하세요.

			   		

			   for(int k=0; k < 5;k++) {

			     String str = "이젠컴퓨터아카데미";

				 System.out.println(str);

			   }

				
//-------------------------------------------------------------------------------------------

		 

				

			}

		 

		

	}


