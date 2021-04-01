package ArraySample2;
import java.util.Scanner;



/* Name, Java, JSP, Spring 점수를 입력 받아서 성적 처리 

 * 처리 조건> 1.method()이용 합니다.

 * 

 * 총점, 평균, 학점 구하기

 * -------------------

 * 홍길동님의 성적표

 * -------------------

 * 총점 : 

 * 평균 :

 * 학점 :

 * -------------------

 * 

 */
public class ArraySample2_12_329 {

	private static Scanner sc = new Scanner(System.in);
	   private static String grade;


	   static boolean k = true;
	   static int n;
	   static int num = 1;
	   private static double sum;// 0.0 = > ?
	   private static double aver;// 0.0 = > ?
/*  1. while문 작성
 * 	2. while문 안에 학생인원수 입력식
 * 	3. k = false 이것은 빠져나오게하려고 만든 식이다.
 *  4. 점수 더블형 2차원배열 행은 n명 열은 7개
 *  5. 이름을 받는 스트링타입 1차원 배열식 작성하기. 
 * 
 * 
 *   
 */

public static void main(String[] args) {

	

	
/*
	 while (k) {
      System.out.println("몇명의 학생 성적 처리를 하시겠습니까?");
      n = sc.nextInt();
      k = false;

   }



   // double jumsu[][] = new double[n][7];// 과목(3), 총점, 평균, 학점 포함 7자리
   double[][] jumsu = new double[n][7];// 과목(3), 총점, 평균, 학점 포함 7자리
   // String name[] = new String[n];//이름 배열
   String[] name = new String[n];// 이름 배열


   k = true;


   
   while (k) {

      for (int i = 0; i < jumsu.length; i++) {
         System.out.println(num + "번 학생의 성적을 입력해 주세요.");
         System.out.println("이름을 입력해 주세요.");

         name[i] = sc.next();

/*  1. for2문 작성 조건식 <5 
 * 	2. for2문 안에 switch작성 
 *  3. case안에 0은 jumsu2차원배열 = num;
 *  4. case안에 1~3까지는 점수 2차원배열 = 점수 입력받는 식
 *  5. 각 case마다 break;
 *  
 */
 /*
         for (int j = 0; j < 5; j++) {

            switch (j) {
            case 0:
               jumsu[i][j] = num;
               break;
            case 1:
               System.out.println("자바 점수를 입력 하세요.");
               jumsu[i][j] = sc.nextInt();
               break;
            case 2:
               System.out.println("JSP 점수를 입력 하세요.");
              jumsu[i][j] = sc.nextInt();
              break;
            case 3:
               System.out.println("스프링 점수를 입력 하세요.");
               jumsu[i][j] = sc.nextInt();
               break;
            }
         }
        num++;
      }
      k = false;

   }



   for (int i = 0; i < jumsu.length; i++) {
      sum = jumsu[i][1] + jumsu[i][2] + jumsu[i][3];// 총점 구하기
     jumsu[i][4] = sum;
      aver = jumsu[i][4] / 3.0;// 평균 구하기
      jumsu[i][5] = aver;



   }



   // 성적 출력하기
   System.out.println("-----------------------------------------------------------");
   System.out.println("번호\t이름\t자바\tJSP\t스프링\t총점\t평균\t학점");
   System.out.println("-----------------------------------------------------------");



   for (int i = 0; i < jumsu.length; i++) {
      System.out.print((int) jumsu[i][0] + "\t" + name[i] + "\t" + jumsu[i][1] + "\t" + jumsu[i][2] + "\t"
            + jumsu[i][3] + "\t" + jumsu[i][4] + "\t" + jumsu[i][5] + "\t");



      // 학점 구하기

      switch ((int) jumsu[i][5] / 10) {
      case 10:
      case 9:
         grade = "A";
         break;
      case 8:
         grade = "B";
         break;
      case 7:
         grade = "C";
         break;
      case 6:
         grade = "D";
         break;
      default:
         grade = "F";

      }

      System.out.println(grade);

   }

	
	/*
	while(k) {
		System.out.println("학생 수를 입력해주세요.");
		n = sc.nextInt();
		k = false;
	}
	
	double[][] jumsu = new double[n][7]; //번호 이름 과목3 총점 평균
	String[] name = new String[n];
	*/
	/*
	 while (k) {
	      System.out.println("몇명의 학생 성적 처리를 하시겠습니까?");
	      n = sc.nextInt();
	      k = false;

	   }



	   // double jumsu[][] = new double[n][7];// 과목(3), 총점, 평균, 학점 포함 7자리
	   double[][] jumsu = new double[n][7];// 과목(3), 총점, 평균, 학점 포함 7자리
	   // String name[] = new String[n];//이름 배열
	   String[] name = new String[n];// 이름 배열
	
	*/
	
	/*  1. while문 작성
	 * 	2. while문 안에 학생인원수 입력식
	 * 	3. k = false 이것은 빠져나오게하려고 만든 식이다.
	 *  4. 점수 더블형 2차원배열 행은 n명 열은 7개
	 *  5. 이름을 받는 스트링타입 1차원 배열식 작성하기. 
	 *   3번 반복하기
	 */
	
	/*
	while(k) {
		System.out.println("학생 수를 입력해주세요.");
		n = sc.nextInt();
		k=false; //while문 빠져나오기위해서
	}
	
	double[][] jumsu = new double[n][7]; // 학생은 무한대로입력 |열은 번호 이름 과목3 총점 평균
	String[] name = new String[n];
	*/
	
	
	
	/*
	while(k) {
		System.out.println("학생수를 입력해주세요.");
		n = sc.nextInt();
		k=false;
	}
	
	double[][] jumsu = new double[n][7];
	String[] name = new String[n];
	*/
	
	
	
	


	

/*  1. while2문 들어가기위해서 다시 k를 true값을 준다.
 * 	2. while2문 작성
 * 	3. while2문안에 for 초기값,조건식(점수.length),증감식
 * 	4. for1문 안에 num(번호)출력식 작성
 * 	5. 이름을입력해주세요. 출력식 작성
 * 	6. name 1차원배열 입력받는식 만들기.
 * 
 */
	/*
	k = true;
	
	while(k) {
		for(int i=0;jumsu.length;i++) {
			System.out.println(num + "의 학생의 성적을 입력해주세요.");
			System.out.println("이름을 입력해주세요.");
			
			name[i] = sc.next();
		}
	}
	*/
	
	
	
	
	
	/*  1. while2문 들어가기위해서 다시 k를 true값을 준다.
	 * 	2. while2문 작성
	 * 	3. while2문안에 for 초기값,조건식(점수.length),증감식
	 * 	4. for1문 안에 num(번호)출력식 작성
	 * 	5. 이름을입력해주세요. 출력식 작성
	 * 	6. name 1차원배열 입력받는식 만들기.
	 * 
	 */
	
	/*
	k = true;
	
	while(k) {
		for(int i =0;i<jumsu.length;i++) {
			System.out.println(num + "번의 성적을 입력해주세요.");
			System.out.println("이름을 입력해주세요.");
			
			name[i] = sc.next();
			
		}
	}
	
	*/

	/*
	k = true;
	
	while(k) {
		for(int i=0;i<jumsu.length;i++) {
		System.out.println(num + "번의 성적을 입력해주세요");
		System.out.println("이름을 입력해주세요.");
		
		name[i] = sc.next();
		}
	}
	
	*/
	
	/*
	while(k) {
		System.out.println("학생수를 입력해주세요.");
		n = sc.nextInt();
		k = false;
		
	}
	
	double[][] jumsu = new double[n][7];
	String[] name = new String[n];
	*/

	/*
	 k = true;


	   
	   while (k) {

	      for (int i = 0; i < jumsu.length; i++) {
	         System.out.println(num + "번 학생의 성적을 입력해 주세요.");
	         System.out.println("이름을 입력해 주세요.");

	         name[i] = sc.next();
*/
	/*
	while(k)
	{
		System.out.println("학생수를 입력해주세요.");
		n = sc.nextInt();
		k=false;
	}
	
	double[][] jumsu = new double[n][7];
	String[] name = new String[n];
	
	k = true;
	
	while(k) {
		for(int i=0;i<jumsu.length;i++) {
			System.out.println(num + "번 학생의 성적을 입력해주세요.");
			System.out.println("이름을 입력해주세요.");
			
			name[i] = sc.next();
		}
	}
		*/	
		
	

	
	/*
	while(k) {
		System.out.println("학생수를 입력해주세요.");
		n = sc.nextInt();
		k = false;
		
	}
	
	double[][] jumsu = new double[n][7];
	String[] name = new String[n];
	
	k = true;
	
	while(k) {
		for(int i=0;i<jumsu.length;i++) {
			System.out.println(num + "번의 성적을 입력해주세요.");
			System.out.println("이름을 입력해주세요.");
			name[i] = sc.next();
		}
	}
	*/
	

	/*  1. while문 작성
	 * 	2. while문 안에 학생인원수 입력식
	 * 	3. k = false 이것은 빠져나오게하려고 만든 식이다.
	 *  4. 점수 더블형 2차원배열 행은 n명 열은 7개
	 *  5. 이름을 받는 스트링타입 1차원 배열식 작성하기. 
	 *   3번 반복하기
	 */
	/*  6. while2문 들어가기위해서 다시 k를 true값을 준다.
	 * 	7. while2문 작성
	 * 	8. while2문안에 for 초기값,조건식(점수.length),증감식
	 * 	9. for1문 안에 num(번호)출력식 작성
	 * 	10. 이름을입력해주세요. 출력식 작성
	 * 	11. name 1차원배열 입력받는식 만들기.
	 * 
	 */
	/*
	while(k) {
		System.out.println("학생수를 입력해주세요.");
		n = sc.nextInt();
		k = false;
	}
	
	double[][] jumsu = new double[n][7];
	String[] name = new String[n];
	
	k = true;
	
	while(k) {
		for(int i =0; i<jumsu.length;i++) {
			System.out.println(num + "번의 성적을 입력해주세요.");
			System.out.println("이름을 입력해주세요.");
			
			name[i] = sc.next();
		}
	}
	
	*/
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    }



}
