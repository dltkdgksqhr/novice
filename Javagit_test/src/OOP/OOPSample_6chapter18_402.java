package OOP;
import java.util.Scanner;

/* 항상 작성의 시작은 Main메소드에서 시작

 * =================================

 * 매개변수의 개수를 모르는 경우

 * 객체 내부에서 호출

 */
public class OOPSample_6chapter18_402 {

	public static int sum1(int[] values1) {

		int sum1 =0;

		

		for(int i =0;i<values1.length;i++) {

			sum1 += values1[i];

		}

		

		return sum1;

	}



//	    매개변수를 모르는경우   배열형식 

	public static int sum2(int ... aaa) { //가변 배열 선언

		

	int sum2 =0;

		

		for(int i =0;i<aaa.length;i++) {

			sum2 += aaa[i];

		}

		

		return sum2;

	}

	



	

	public static void main(String[] args) {

/* method overloading



PrintStream.println(),

PrintStream.println(boolean),

PrintStream.println(char),

PrintStream.println(char[]),

PrintStream.println(double),

PrintStream.println(float),

PrintStream.println(int),

PrintStream.println(long),

PrintStream.println(java.lang.Object),

PrintStream.println(java.lang.String)

*/



int n =0;

Scanner sc  = new Scanner(System.in);

System.out.println("데이터 입력 개수를 설정해주세요.");

n = sc.nextInt();

int[] values1 = new int[n];





for(int i=0;i< n ; i++) {

System.out.println("[values1]숫자를 입력해주세요.");

	values1[i] = sc.nextInt();

}



int result1 =sum1(values1);

System.out.println("values1[]의 결과는 : "  + result1); 



//------------------------------------------------------------------------



int[] aaa = new int[n];



for(int i=0;i< aaa.length; i++) {

System.out.println("[aaa]숫자를 입력해주세요.");

		aaa[i] = sc.nextInt();

}



int result2 =sum2(aaa);

System.out.println("aaa[]의 결과는 : "  + result2); 





			}



}