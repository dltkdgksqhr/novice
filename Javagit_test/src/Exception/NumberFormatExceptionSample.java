package Exception;


import java.util.Scanner;



/*

* NumberFormatException : 문자열 데이터를 숫자로 변경하는 경우에 자주 발생

*/
public class NumberFormatExceptionSample {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

		

		

	String data1 = "100";

	String data2 = "a100";

	

	try {

	int value1 = Integer.parseInt(data1);

	int value2 = Integer.parseInt(data2);

	

	int result = value1 + value2;

	System.out.println("합의 결과는 : " + result);

	}catch(NumberFormatException e) {

		System.out.println("숫자가 아닌 데이터가 입력되었습니다.");

	}

	

	

	}

 

}
