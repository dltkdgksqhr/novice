package ArraySample;
import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;
/* 

 * 문제5> 학생수를 입력받아서 점수를 입력하고, 점수 리스트를 출력하는 프로그램을 작성합니다.

 * 메뉴 형식

 * ----------------

 * 

 */

 
public class ArraySample1_26_326_26_3 {
	   private static int student;

	   private static int[] score;
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	      boolean trigger = true;

	      

	     System.out.println("--------------------------------");

	     System.out.println("1. 학생수 입력");

	     System.out.println("2. 점수 입력");

	     System.out.println("3. 점수 리스트 출력");

	     System.out.println("4. 데이터 분석(최고점수와 평균 점수 출력");

	     System.out.println("5. 종료");

	     System.out.println("--------------------------------");

	     

	      while(trigger) {

	         System.out.print("메뉴 선택 : ");

	         int ch = sc.nextInt();

	          if(ch == 1) {

	             System.out.print("학생수 입력 : ");

	             student = sc.nextInt();

	             score = new int[student];

	          }

	          else if(ch == 2) {

	             for(int i=1;i<=student;i++) {

	                System.out.print(i + "번 학생 성적 : ");

	                score[i-1] = sc.nextInt();  

	             }

	          }

	          else if(ch == 3) {

	             for(int i=1;i<=student;i++) {

	                System.out.println(i + "번 학생 성적 : " + score[i-1]);

	             }

	          }

	          else if(ch == 4) {

	             int max = score[0];

	             double aver = 0;

	             for(int i=0;i<student;i++) {

	              if(max <= score[i])

	                 max = score[i];

	              aver += score[i];

	             }

	             System.out.println("평균 : " + (aver/score.length) + " 최고점 : "+max);

	          }

	          else if(ch == 5) {

	             trigger = false;

	          }

	      }

	}

}
