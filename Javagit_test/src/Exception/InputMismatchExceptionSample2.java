package Exception;
import java.util.InputMismatchException;

import java.util.Scanner;

 

/* 4월8일

 * InputMismatchException: 데이터 형이 다르게 입력되어서 발생합니다.(한글 , 영문자, 실수형 입력시 발생) 

 * 

 * 3과목 점수를 입력받아서 총점, 평균을 구하는 프로그램을 작성하세요.

 * 단, 예외처리를 합니다.(InputMismatchException)

 * getter / setter 이용

 * 

 */

class sungjuk{

	static int spring;

	 static int java;

	 static int jsp;

	 static int total;

	 static double aver;

 

	 public static int getJava() {

		return java;

	}

 

 

	public static void setJava(int java) {

		sungjuk.java = java;

	}

 

 

	public static int getJsp() {

		return jsp;

	}

 

 

	public static void setJsp(int jsp) {

		sungjuk.jsp = jsp;

	}

 

 

	public static int getSpring() {

		return spring;

	}

 

 

	public static void setSpring(int spring) {

		sungjuk.spring = spring;

	}

 

 

	

	void setspring(int spring) {

		this.spring = spring;

		

	}

 

 

	void setjsp(int jsp) {

		this.jsp=jsp;

		

	}

 

 

	void setjava(int java) {

	    this.java =java;

		

	}

	void operation() {

		

		 total = java + jsp + spring;

		 aver = total / 3.0;

	}

 

	void result() {

		System.out.println("java : " + java);

		System.out.println("jsp : " + jsp);

		System.out.println("spring : " + spring);

		System.out.println("-----------------------");

		System.out.println("총점 : " + total);

		System.out.println("평균 : " + aver);

		 

	}

}

 

 

public class InputMismatchExceptionSample2 {

	 static int java;

	 static int jsp;

	 static int spring;

	public static void main(String[] args) {
sungjuk ip1 = new sungjuk();

		

		Scanner sc = new Scanner(System.in);

		

		try {

		System.out.println("3과목의 값을 입력해주세요.");

		 java = sc.nextInt();

		jsp = sc.nextInt();

		  spring = sc.nextInt();

		}catch(InputMismatchException e) {

			System.out.println("정수형 숫자로 입력해주세요.");

		}

		

		// Data입력

		ip1.setjava(java);

		ip1.setjsp(jsp);

		ip1.setspring(spring);

		

		// Data연산

		ip1.operation();

		

		// Data결과

		ip1.result();

	}

 

 

	

 

	

 

}

