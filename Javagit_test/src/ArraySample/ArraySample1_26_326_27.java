package ArraySample;
import java.util.*;

import java.math.*;

 

/* 

 *       문제6> 임의의 수 N개를 입력받아서, 배열에 저장하고, 내림차순 정렬을 합니다. 

 *        데이터> 100 300 400 200

 *        1. 1번 회전결과 : 400 100 300 200

 *        2. 2번 회전결과 : 400 300 100 200

 *        3. 3번 회전결과 : 400 300 200 100

 *        -------------과정을 출력----------------------------

 *        

 */
public class ArraySample1_26_326_27 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 

		   System.out.println("정렬을 원하는 배열의 크기를 입력해주세요.");

		   int n =sc.nextInt(); //7

		   

		   int[] sortData = new int[n]; // 0 ~ 6

		   

		   System.out.println("==== 정렬 데이터 입력 =====");

		   for(int i=0; i<sortData.length;i++) {

			   System.out.println((i+1) + "번째 데이터 : ");

			   sortData[i] = sc.nextInt();

 		 }

		   	 

		  // 내림차순 정렬 

		   

		for(int i=0;i<sortData.length;i++) {

				for(int j =i+1; j<sortData.length;j++) {

					

					if(sortData[i] <sortData[j]) {

					int tem = sortData[i];

					sortData[i] = sortData[j];	

					sortData[j] = tem;

					}

					

					

				}

		

				

		}

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

				

		   /*

		   System.out.println((i+1) + "회전 결과 : "); //1회전 i가 0부터 돌아가서 +1해줌

		   

		  for(int k :sortData) { //가변배열

			  System.out.println(k + " ");

		  }

		   System.out.println();

		   

		} 

		   

		   

		   

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



*/



	}

}
