package OOP;


import java.util.Scanner;

//		합칠때 public제거

  class Calculator2 {

	   //	  10     20

	   public static int add(int i, int j) {

		   int sum = i + j;

		   return sum;

}

	   

//		메소드 오버로딩 

	   public static double add(double x2, double y2) {

		    double sum = x2 + y2;

		   	return sum;

}



}
public class OOPSample_6chapter2_401 {

	// 실행은 메인에서 한다.

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("값을 입력해주세요");

			int x = sc.nextInt();

		    int y = sc.nextInt();

			

		int result1 = Calculator2.add(10,20);

		int result2 = Calculator2.add(x,y);

		

		System.out.println("값을 입력해주세요(실수형)");

		double x2 = sc.nextDouble();

		double y2 = sc.nextDouble();

	    

		double result3 = Calculator2.add(x2,y2);

		

		System.out.println("add1 : " + result1);  // 30

		System.out.println("add2 : " + result2);  // 입력값 연산 결과값 나옴(정수형)

		System.out.println("add3 : " + result3);  // 입력값 연산 결과값 나옴(실수형) //12.1

		

		

		}

	 

	}
