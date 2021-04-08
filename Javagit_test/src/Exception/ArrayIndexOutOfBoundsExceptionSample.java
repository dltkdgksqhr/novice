package Exception;
import java.util.Scanner;



/*

 * ArrayIndexOutOfBoundsException : 배열 범위가 초과되었을 때 발생

 * 

 */

public class ArrayIndexOutOfBoundsExceptionSample {

 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	      

	      int Data[] = new int[5];//[0] ~[4]

	      

	      System.out.println("숫자를 입력해 주세요.");

	      

	      for(int i=0; i < Data.length; i++) {

	          Data[i] = sc.nextInt();

	      }

	      

	      try {

	      System.out.println(Data[4]);//[5] : java.lang.ArrayIndexOutOfBoundsException

	      }catch(ArrayIndexOutOfBoundsException e) {

	         System.out.println("배열의 범위는 [0] ~[4]까지 입니다.");

	      }

	   }

	 

	}