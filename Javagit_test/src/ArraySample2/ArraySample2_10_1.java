package ArraySample2;
import java.util.Scanner;



/*   이름, 자바, JSP, Spring, 점수를 입력받아서 성적 처리  

 *    

 *   총점, 평균, 학점 구하기   

 * --------------------------  

 *  홍길동님의 성적표

 * --------------------------   

 *   총점 :

 *   평균 :

 *   학점 :

 *----------------------------

 *  메소드 2개사용

 *  	

 * 

 * 

 * 

 */
public class ArraySample2_10_1 {

	/*

	static String grade;

	static String name; 

	static int total;

	static double aver;

	/*

	private static void calculator(int java, int jsp, int spring) {

 

		total = java + jsp + spring;

		 aver = total / 3.0;

	   

	    

		

	}

	

	private static void hakjum() {

		  switch((int)aver/10) {

		    case 10: 

		    case 9 : grade = "A학점입니다."; break;

		    case 8 : grade = "B학점입니다."; break;

		    case 7 : grade = "C학점입니다."; break;

		    case 6 : grade = "D학점입니다."; break;

		    default : grade = "F학점입니다.";

		    	

		    

		    }

		

	}

	private static void sungjukOutput() {

 

	    System.out.println("------------------------------");

	    System.out.println(name + "님의 성적표");

	    System.out.println("------------------------------");

	    System.out.println("총점 : " + total);

	    System.out.println("평균 : " + aver);

	    System.out.println("등급 : " + grade);

		

	}

	

	

	

	private static int input(String kawmok) {

		int jumsu =0;

		

		while(true) {

			System.out.println(kawmok + "점수를 입력해주세요.");

			jumsu = sc.nextInt();

			

			if(jumsu >0 && jumsu<100) break;

			System.out.println(kawmok + "점수를 잘못 입력하셨습니다. 다시 입력해주세요.");

			

		}

		return jumsu;

	}

	public static void main(String[] args) {

	

		System.out.println("학생 이름을 입력해주세요.");

		name = sc.next();

		

		int java = input("자바");

		int jsp = input("제이에스피");

		int spring = input("스프링");

		

	  

	    

	    

	    

	    

	  //총점 구하기

		//학점 구하기

		//성적 출력하기

 

 

		calculator(java,jsp,spring);

		hakjum();

	    sungjukOutput();

*/

	    		

	/*   이름, 자바, JSP, Spring, 점수를 입력받아서 성적 처리  

	 *    

	 *   총점, 평균, 학점 구하기   

	 * --------------------------  

	 *  홍길동님의 성적표

	 * --------------------------   

	 *   총점 :

	 *   평균 :

	 *   학점 :

	 *----------------------------

	 *  메소드 2개사용

	 *  	

	 * 

	 * 

	 * 

	 */

	static Scanner sc = new Scanner(System.in);

	private static int input(String kawmok) {

		int jumsu=0;

		System.out.println(kawmok + "학생의 점수를 입력해주세요.");

		jumsu = sc.nextInt();

		

		for(int i=0; i<jumsu;i++) {

			

			

			if(jumsu>0 && jumsu<100) break;

			System.out.println(kawmok + "점수를 잘못 입력하셨습니다. 다시 입력해주세요.");

			

		}

		return jumsu;

	}

	

	

	

	public static void main(String[] args) {

	    

		System.out.println("이름을 입력해주세요.");

		String name = sc.next();

		

		int java = input("자바");

		int jsp = input("제이에스피");

		int spring = input("스프링");

	

		int total = java + jsp + spring;

		double aver = total / 3.0;

		String grade;

		

		switch((int)aver/10) {

		case 10 :

		case 9  : grade = "A학점입니다."; break;	

		case 8  : grade = "B학점입니다."; break;	

		case 7  : grade = "C학점입니다."; break;	

		case 6  : grade = "D학점입니다."; break;	

		default : grade = "F학점입니다.";

		

		

		

		

		}

		

		System.out.println("--------------------------------------");

		System.out.println(name + "님의 성적표");

		System.out.println("--------------------------------------");

		System.out.println("총점 : " + total);

		System.out.println("평균 : " + aver);

		System.out.println("등급 : " + grade);

		

		

		
	}

}
