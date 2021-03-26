package ArraySample;
import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;

 

/* 

 * 문제6> 임의의 수를 N개를 입력 받아서, 배열에 저장하고, 내림차순 정렬을 합니다.

 * 데이터> 100 300 400 200

 * 1회전 결과 : 400 100 300 200

 * 2회전 결과 : 400 300 100 200

 * 3회전 결과 : 400 300 200 100

 * 

 */
public class ArraySample1_26_326_26_2 {
	private static int number[];

	 
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	      System.out.print("입력할 수의 갯수 : ");

	      int n=sc.nextInt();

	      int maxnum=0;

	      number = new int[n];

	     for(int i=0;i<n;i++) {

	        System.out.print("입력 : ");

	        number[i] = sc.nextInt(); 

	     }



	     for(int k=0;k<n;k++) {

	        int max = number[k];

	        for(int i=k;i<n;i++) {

	            if(max <= number[i]) {

	               max = number[i];

	               maxnum = i;

	            }

	           }

	          

	        for(int i=maxnum;i>k;i--) {

	           number[i] = number[i-1]; 

	        }

	        

	        number[k] = max;

	        

	        for(int i=0;i<n;i++) {

	           System.out.print(number[i] + " ");

	        }

	        System.out.println();

	     }
	}

}
