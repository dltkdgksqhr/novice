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
public class ArraySample1_26_326_26 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in); 

		   //int StuNum =sc.nextInt();

		   int StuNum =0;

		   int[] score = null;

		    

		   	 

		       while(true){

		    System.out.println("--------------------------------------------------------"); 

		           System.out.println("1. 학생수 입력 메뉴"); 

		           System.out.println("2. 점수 입력 메뉴"); 

		           System.out.println("3. 점수 리스트 출력"); 

		           System.out.println("4. 데이터 분석(최고점수와 평균점수 구해서 출력) 메뉴"); 

		           System.out.println("5. 종료 메뉴");              

		    System.out.println("--------------------------------------------------------");

		      

		      System.out.println("원하는 메뉴를 선택해주세요."); 

		      int menu = sc.nextInt();

		      

		     if(menu == 1) { 

		    	 System.out.println("학생수는?");

		    	 StuNum =sc.nextInt();

		    	 score = new int[StuNum];

		     }else if(menu == 2) { 

		    		 System.out.println("점수를 입력해주세요.");

		    		 for(int i=0; i<score.length;i++) {

		    			 score[i] = sc.nextInt();

		    		 }

		    			 

		    	 }else if(menu == 3){ 

		    			 System.out.println("--- 배열에 들어있는 학생의 점수를 출력 ---");

		    			 for(int i=0; i<score.length;i++) {

			    			System.out.println("score[" + i + "] = " + score[i]); // score[5] = 90

			    		 }

		    		 }else if(menu == 4) { 

		    			 int max =0, sum=0;

		    			 double aver = 0.0;

		    			 

		    			 for(int i=0; i<score.length;i++) {

		    				 	max = (max < score[i] ? score[i]:max); //삼항연산자

				    			sum += score[i];

		    			 }

		    			 aver = sum / StuNum;

		    			 

		    			 System.out.println("최고 점수는? " + max);

		    			 System.out.println("평균 점수는? " + aver);

		    			 }else if(menu == 5) {

		    				 System.out.println("계속하시겠습니까?(y/n)");

		    				 String keeping = sc.next();

		    				 

		    				 if(keeping.equals("y")) {

		    					 continue;

		    				 } else if(keeping.equals("n")) {

		    					 System.out.println("프로그램을 종료합니다.");

		    					 break;

		    				 }

		    				 

		    				 

		    				 		    				 }

		       }

		      

	}

}
