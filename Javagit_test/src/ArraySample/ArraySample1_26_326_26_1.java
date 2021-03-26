package ArraySample;
import java.util.*;

import java.math.*;

 

/* 

 *       문제5> 학생 수를 입력받아서 점수를 입력하고, 점수 리스트를 출력하는 프로그램을 작성합니다.

 *       메뉴 형식

 *       --------------------------------------------------------

 *       1. 학생수 입력 메뉴

 *       2. 점수 입력 메뉴

 *       3. 점수 리스트 출력

 *       4. 데이터 분석(최고점수와 평균점수 구해서 출력) 메뉴

 *       5. 종료 메뉴

 *       --------------------------------------------------------

 *       

 *       문제6> 임의의 수 N개를 입력받아서, 배열에 저장하고, 내림차순 정렬을 합니다. 

 *        데이터> 100 300 400 200

 *        1. 1번 회전결과 : 400 100 300 200

 *        2. 2번 회전결과 : 400 300 100 200

 *        3. 3번 회전결과 : 400 300 200 100

 *        -------------과정을 출력----------------------------

 *        

 */
public class ArraySample1_26_326_26_1 {

	public static void main(String[] args) {
		 /*   1. 학생의 점수를 나타내줄 총합변수를(더블타입) 설정한다.

		    *   2  학생수를 입력받을 출력식을 작성한다.

		    *   3. 배열변수를 설정한다. 타입[] 배열변수명 = new 타입[학생수 배열변수명]

		    *   4. 1for문 조건식에서 i<학생변수명 설정

		    *   5. 1for문 안에 학생 + (초기값 +1) 점수 출력식을 작성한다.

		    *   5-1. 배열변수명[1for문 초기값] = 입력받는 스캐너식 

		    *   6. 1for문 안에 if조건식 배열변수명 > 100 ||(or) 배열변수명 <0 식을 작성한다. (의미는 0미만 100초과)

		    *   7. 잘못된 점수 출력식 작성 및 초기값 --식 작성후 넘어간다 

		    *   일단 여기까지 4번 반복하기.

		    */

		 /*

		   Scanner sc = new Scanner(System.in);

		   

		   double total = 0.0;

		   

		   System.out.println("학생 수를 입력해주세요.");

		   int NumSt = sc.nextInt();

		   

		   int[] Starr =new int[NumSt];

		   

		   for(int i=0; i<NumSt;i++) {

			   System.out.println("학생" + (i+1) + "의 점수는?");

			   Starr[i] =  sc.nextInt();

			   if(Starr[i]<0 ||Starr[i]>100) {

				   System.out.println("점수를 잘못 입력하셨습니다.");

				   i--;

				   continue;

				   

			   }

		   }

		  

		*/

		  

		   

		   

		   /* 

		    *       문제5> 학생 수를 입력받아서 점수를 입력하고, 점수 리스트를 출력하는 프로그램을 작성합니다.

		    *       메뉴 형식

		    *       --------------------------------------------------------

		    *       1. 학생수 입력 메뉴

		    *       2. 점수 입력 메뉴

		    *       3. 점수 리스트 출력

		    *       4. 데이터 분석(최고점수와 평균점수 구해서 출력) 메뉴

		    *       5. 종료 메뉴

		    *       --------------------------------------------------------

		   */ 

		   /*    1. 총합 변수명 선언

		    *    2. 학생수 입력받을 변수명 선언

		    *    3. 학생 배열변수명 선언 (인덱스 값 학생수)

		    *    4. for문 1 조건식은 초기값에 학생 수 변수명

		    *    5. 학생의 점수를 입력받을 식 작성하기 | 학생배열변수명 = 입력식

		    *    6. if문 0미만 100초과하는 식 작성하기.

		    *    7. 점수 잘못입력했다는 문구 출력식 만들고, 초기값 --;, 건너뛰기 명령문 작성

		    *    3번째

		    */

		/*

		   제5> 학생 수를 입력받아서 점수를 입력하고, 점수 리스트를 출력하는 프로그램을 작성합니다.

		    *       메뉴 형식

		    *       --------------------------------------------------------

		    *       1. 학생수 입력 메뉴

		    *       2. 점수 입력 메뉴

		   */

		/*

		   Scanner sc = new Scanner(System.in);

		   

		   double total =0.0;

		   

		   System.out.println("학생 수를 입력해주세요.");

		   int StNum = sc.nextInt();

		   

		   int[] Starr = new int[StNum];

		   

		   for(int i =0; i<StNum;i++) {

			   System.out.println("학생" + (i+1) + "점수를 입력해주세요. : ");

			   Starr[i] = sc.nextInt();

			   if(Starr[i]<0||Starr[i]>100) {

				   System.out.println("점수 잘못 입력하셨습니다");

				   i--;

				   continue;

				   

			   }

			   

		   }

		   

		

		   */

		   

		   

		   

		   /*  1. for문2 총합 = 총합 + 학생배열변수

		    *  2. 출력식1 학생수변수명 + 총합변수명으로 이뤄져있다.

		    *  3. 출력식2 학생변수명 + Math.round(총합변수/학생수*100) /100f ==> 이런식으로 세워놓은 이유가 타입맞춰주기위해서 이런식으로 작성해놓음

		    *  4번 반복하기

		    */

		  /* 

		   for(int i=0;i<StNum;i++) {

			   total +=Starr[i];

					   }

		   System.out.println("학생"+StNum+"의 총합은 : "+total);

		   System.out.println("학생"+StNum+"의 평균은 : "+(total/StNum*100)/100f);

		   */

		   

		   /*

		   

		   for(int i=0;i<StNum;i++) {

			   total += Starr[i];

		   }

		   System.out.println("학생" +StNum + "명의 총합은"+total);

		   System.out.println("학생" +StNum + "명의 평균은"+(total / StNum *100)/100f );

		   */

		   

		   

		   /* 4번 반복하기

		   제5> 학생 수를 입력받아서 점수를 입력하고, 점수 리스트를 출력하는 프로그램을 작성합니다.

		    *       메뉴 형식

		    *       --------------------------------------------------------

		    *       1. 학생수 입력 메뉴

		    *       2. 점수 입력 메뉴

		   */

		   /*

		   Scanner je = new Scanner(System.in);

		   

		   double total = 0.0;

		   

		   System.out.println("학생 수를 입력해주세요");

		   int StNum = je.nextInt();

		   

		   int[] Starr = new int[StNum];

		   

		   for(int i=0;i<StNum;i++) {

			   System.out.println("학생의 점수를 입력해주세요.");

			   Starr[i] = je.nextInt();

			   if(Starr[i]<0 ||Starr[i]>100) {

				   System.out.println("범위에 맞지않는 점수를 입력하셨습니다.");

				   i--;

				   continue;

			   }

		   }

		   

		   for(int i=0;i<StNum;i++) {

			   total += Starr[i];

		   }

		   System.out.println("학생"+StNum+"명의 점수 총합은: "+total);

		   System.out.println("학생"+StNum+"명의 점수 평균은: "+Math.round(total/StNum*100)/100f);

		   */

		   

		   

		   /* 4번 반복하기

		   제5> 학생 수를 입력받아서 점수를 입력하고, 점수 리스트를 출력하는 프로그램을 작성합니다.

		    *       메뉴 형식

		    *       --------------------------------------------------------

		    *       1. 학생수 입력 메뉴

		    *2       2. 점수 입력 메뉴

		   */

		   /*

		   

		   Scanner je = new Scanner(System.in);

		   

		   double total = 0.0;

		   

		   System.out.println("학생 수 입력해주세요.");

		   int StNum = je.nextInt();

		   

		   int[] Starr = new int[StNum];

		   

		   for(int i=0;i<StNum;i++) {

			   System.out.println("학생의 점수를 입력해주세요.");

			   Starr[i] = je.nextInt();

			   

			   if(Starr[i]<0||Starr[i]>100) {

				   System.out.println("점수를 잘못 입력하셨습니다.");

				   i--;

				   continue;

				   }

		   }

		   for(int i=0;i<StNum;i++) {

			   total += Starr[i];

		   }

		   

		   System.out.println("학생" + StNum + "명의 총합은 : " + total);

		   System.out.println("학생" + StNum + "명의 평균은 : " + (total/StNum*100)/100f);

		   */

		   /* 4번 반복하기

		   제5> 학생 수를 입력받아서 점수를 입력하고, 점수 리스트를 출력하는 프로그램을 작성합니다.

		    *       메뉴 형식

		    *       --------------------------------------------------------

		    *       1. 학생수 입력 메뉴

		    *3       2. 점수 입력 메뉴

		   */

		   /*

		   Scanner je = new Scanner(System.in);

		   

		   double total = 0.0;

		   

		   System.out.println("학생수를 입력해주세요.");

		   int StNum = je.nextInt();

		   

		   int[] Starr = new int[StNum];

		   

		   for(int i=0;i<StNum;i++) {

			   System.out.println("학생의 점수를 입력해주세요.");

			   Starr[i] = je.nextInt();

			   if(Starr[i]<0||Starr[i]>100) {

				   System.out.println("점수를 잘못 입력하셨습니다.");

				   i--;

				   continue;

				   

			   }

		   }

		   

		   for(int i=0;i<StNum;i++) {

			   total += Starr[i];

		   }

		   

		   System.out.println("학생" + StNum+ "명의 총합은 : "+total);

		   System.out.println("학생" + StNum+ "명의 평균은 : "+Math.round(total/StNum*100)/100f);

		   

		   */

		   /*

		   제5> 학생 수를 입력받아서 점수를 입력하고, 점수 리스트를 출력하는 프로그램을 작성합니다.

		    *       메뉴 형식

		    *       --------------------------------------------------------

		    *       1. 학생수 입력 메뉴

		    *4       2. 점수 입력 메뉴

		   */

		   

		   Scanner sc = new Scanner(System.in);

		   

		   double total = 0.0;

		   

		   System.out.println("학생수를 입력해주세요.");

		   

		   int StNum = sc.nextInt();

		   

		   int[] Starr = new int[StNum];

		   

		   for(int i =0;i<StNum;i++) {

			   System.out.println("점수를 입력해주세요.");

			   Starr[i] = sc.nextInt();

			   

			   if(Starr[i]<0||Starr[i]>100) {

				   System.out.println("점수를 잘못 입력하셨습니다.");

				   i--;

				   continue;

			   }

		   }

		   for(int i=0;i<StNum;i++) {

			   total += Starr[i];

		   }

		   System.out.println("학생" + StNum+"명의 총합은 : "+total);

		   System.out.println("학생" + StNum+"명의 평균은 : "+Math.round(total/StNum*100)/100f);

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   

		   /*

		   

			Scanner sc = new Scanner(System.in);

			

			double total = 0.0;

			

			System.out.print("학생수 : ");

			int stNum = sc.nextInt();

			

			int[] arrSt = new int[stNum];

			

			for(int i = 0; i < stNum; i++) {

				System.out.print("학생" + (i + 1) + "의 점수 : ");

				arrSt[i] = sc.nextInt();

				if(arrSt[i] > 100 || arrSt[i] < 0) { // 점수가 0미만이거나 100초과인 경우

					System.out.println("잘못된 점수 입니다. 다시 입력해 주세요.");

					i--;

					continue;

				}

			}

			

			for(int i = 0; i < stNum; i++) {

				total += arrSt[i];

			}

			System.out.println("학생 " + stNum + "명의 총합은 " + total +  "점 입니다.");

			System.out.println("학생 " + stNum + "명의 평군은 " +Math.round(total / stNum * 100) / 100f +  "점 입니다.");

			*/

	}

}
