package OOP;
import java.util.Scanner;

/* 항상 작성의 시작은 Main메소드에서 시작

 * =================================

 * 매개변수의 개수를 모르는 경우

 * 

 */

class Computer {

 

	public int sum1(int[] values1) {

		int sum =0;

		

		for(int i =0;i<values1.length;i++) {

			sum += values1[i];

		}

		

		return sum;

	}

 

//	    매개변수를 모르는경우   배열형식 

	public int sum2(int ... aaa) { //가변 배열 선언

		

	int sum =0;

		

		for(int i =0;i<aaa.length;i++) {

			sum += aaa[i];

		}

		

		return sum;

	}

	

	

	

	

}
public class OOPSample_6chapter15_402 {

	public static void main(String[] args) {

		

		Computer mycom = new Computer();

		

		

		int[] values1 = {1, 2, 3};

		int result1 = mycom.sum1(values1);

		System.out.println("values1[]의 결과는 : "  + result1); //6

		

		int result2 = mycom.sum1(new int[] {1, 2, 3, 4, 5 });

		System.out.println("values1[]의 결과는 : "  + result2); //15

		

		System.out.println("=========================================");

		

		int result3 = mycom.sum2(10, 20, 30);

		System.out.println("aaa[]의 결과는 : "  + result3); //60

		

		int result4 = mycom.sum2(10, 20, 30, 40, 50);

		System.out.println("aaa[]의 결과는 : "  + result4); //150

	

		

		

		

	

		

		

		}

 

	

 

 

	

 }