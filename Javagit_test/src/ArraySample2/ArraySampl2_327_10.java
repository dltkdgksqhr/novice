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
 *  1. 스캐너 공동 선언
 *  2. input 메소드 전달인자 과목
 *  3. 점수선언
 *  4. while문 
 *  5. while문안에 과목 점수입력 출력식
 *  6. 점수 입력받기위한 코드 만들기	
 * 
 * 
 * 
 */

public class ArraySampl2_327_10 {

	static Scanner sc = new Scanner(System.in);
/*
	private static int input(String kwamok) {
		int jumsu;

		

		while(true) {
			System.out.println(kwamok + "점수입력");
			jumsu = sc.nextInt();
			if(jumsu >=0 && jumsu <=100) break;
			System.out.println(kwamok + "점수 입력이 잘못됐습니다. 다시 입력해주세요.");
		}
		return jumsu;
	}
*/
/*
public static void main(String[] args) {*/
/*  1. 학생이름 입력받는 문자열타입 식 작성
 * 	2. 자바,jsp,spring 점수 초기값 식 작성(input으로 호출하기)
 * 	3. 총점식 작성
 * 	4. 평균 식 작성
 * 	5. 등급 선언
 */

/*
	
	Scanner sc = new Scanner(System.in);

	

	System.out.println("학생 이름을 입력하세요.");
	String name = sc.next();

	

	int java = input("java");
	int jsp = input("제이에스피");
	int spring = input("스프링");

	

    int total = java + jsp + spring;
    double aver= total / 3.0;
    String grade;

    

    switch((int) aver / 10) {
    case 10:
    case 9: grade = "A"; break;
    case 8: grade = "B"; break;
    case 7: grade = "C"; break;
    case 6: grade = "D"; break;
   default: grade = "F";

    }

          

    System.out.println("--------------------------");  
    System.out.println(name + "님의 성적표");
    System.out.println("--------------------------");  
    System.out.println("총점 : "+ total + "점");   
    System.out.println("평균 : " + aver + "점"); 
    System.out.println("학점 : " + grade + "점"); 
*/
	
	/*   3번씩
	 *  1. 스캐너 공동 선언
	 *  2. input 메소드 전달인자 과목
	 *  3. 점수선언
	 *  4. while문 
	 *  5. while문안에 과목 "점수입력" 출력식
	 *  6. 점수 입력받기위한 코드 만들기	
	 *  7. if문으로 0점미만 100점 초과 식만들기 (잘못된 점수범위), break선언
	 *  8. 왠지 모르겠는데 출력식마다 과목을 넣어줘야한다.
	 *  9. retrun호출 명령어 작성
	 * 
	*/
	/*
	static Scanner sc = new Scanner(System.in);
		
	private static void input(String kawmok) {
		int jumsu =0;
		
		while(true) {
			System.out.println(kawmok + "점수입력");
			jumsu = sc.nextInt();
			if(jumsu<0 && jumsu > 100) break;
			System.out.println(kawmok + jumsu);
			
		}
		return jumsu;
	}
	
	*/




/*
	private static int input(String kawmok) {
		int jumsu =0;
		
		while(true) {
			System.out.println(kawmok + "학생 점수를 입력해주세요");
			jumsu = sc.nextInt();
			if(jumsu >0 && jumsu <100) break;
			System.out.println(kawmok +"점수를 잘못입력하셨습니다.");
			
		}
		return jumsu;
	}


*/





	
	
		/*  1. 학생이름 입력받는 문자열타입 식 작성
		 * 	2. 자바,jsp,spring 점수 초기값 식 작성(input으로 호출하기)
		 * 	3. 총점식 작성
		 * 	4. 평균 식 작성
		 * 	5. 등급 선언
		 *  6. 스위치식 조건에 평균을 10으로 나누는 식만들기 평균 인트형으로 캐스팅하기
		 *  7. 스위치 식에는 등급이 들어간다.
		 *  8. 최종 출력식 작성하기.
		 */
		/*
		System.out.println("학생이름을 입력해주세요.");
		String name = sc.next();
		
		int java = input("자바");
		int jsp = input("제이에스피");
		int spring = input("스프링");
		
		int total = java + jsp + spring;
		double aver = total / 3.0;
		String grade;
		
		switch((int)aver /10) {
		case 10:
		case 9: grade ="A학점입니다."break;
		case 8:grade ="B학점입니다."break;
		case 7:grade ="C학점입니다."break;
		case 6:grade ="D학점입니다."break;
		default : grade ="F";
		}
		System.out.println("------------------------");
		System.out.println(name + "님의 점수");
		System.out.println("------------------------");
		System.out.println("총점 : " + total + "입니다.");
		System.out.println("평균 : " + aver + "입니다.");
		System.out.println("등급 : " + grade + "입니다.");
	input();
	*/
     
/*
	System.out.println("학생 이름을 입력하세요.");
	String name = sc.next();

	

	int java = input("java");
	int jsp = input("제이에스피");
	int spring = input("스프링");

	

    int total = java + jsp + spring;
    double aver= total / 3.0;
    String grade;

    

    switch((int) aver / 10) {
    case 10:
    case 9: grade = "A"; break;
    case 8: grade = "B"; break;
    case 7: grade = "C"; break;
    case 6: grade = "D"; break;
   default: grade = "F";

    }

          

    System.out.println("--------------------------");  
    System.out.println(name + "님의 성적표");
    System.out.println("--------------------------");  
    System.out.println("총점 : "+ total + "점");   
    System.out.println("평균 : " + aver + "점"); 
    System.out.println("학점 : " + grade + "점"); 
*/


		/*  1. 학생이름 입력받는 문자열타입 식 작성
		 * 	2. 자바,jsp,spring 점수 초기값 식 작성(input으로 호출하기)
		 * 	3. 총점식 작성
		 * 	4. 평균 식 작성
		 * 	5. 등급 선언
		 *  6. 스위치식 조건에 평균을 10으로 나누는 식만들기 평균 인트형으로 캐스팅하기
		 *  7. 스위치 식에는 등급이 들어간다.
		 *  8. 최종 출력식 작성하기.
		 */
		/*
		System.out.println("학생 이름을 입력해주세요.");
		String name = sc.next();
		
		int java = input("자바");
		int jsp = input("제이에스피");
		int spring = input("스프링");
				
		int total = java + jsp + spring;
		double aver = total /3.0;
		String grade;
		
		switch((int)aver/10) {
		case 10:
		case 9: grade = "A";break;
		case 8: grade = "B";break;
		case 7: grade = "C";break;
		case 6: grade = "D";break;
		default : grade = "F";
		}
		
		System.out.println("--------------------------");
		System.out.println(name + "님의 성적표");
		System.out.println("--------------------------");
		System.out.println("총점: " + total);
		System.out.println("평균: " + aver);
		System.out.println("등급: " + grade);


*/
	/*
	private static int input(String kawmok) {
		int jumsu=0;
		
		while(true) {
			System.out.println(kawmok + "점수를 입력해주세요.");
			jumsu = sc.nextInt();
			
			if(jumsu >0 && jumsu<100) break;
			System.out.println("점수를 잘못 입력했습니다. 다시 입력해주세요.");
			
		}
		return jumsu;
	}
		
		
		
	public static void main(String[] args) {
		
		System.out.println("학생 이름을 입력해주세요.");
		String name = sc.next();
		
		int java = input("자바");
		int jsp = input("제이에스피");
		int spring = input("스프링");
		
		int total = java + jsp +spring;
		double aver = total / 3.0;
		String grade;
		
		switch((int)aver / 10) {
		case 10:
		case 9 : grade = "A학점";break;
		case 8 : grade = "B학점";break;
		case 7 : grade = "C학점";break;
		case 6 : grade = "D학점";break;
		default : grade = "f학점";
		
		}
		
		System.out.println("--------------------------");
		System.out.println(name + "님의 성적표");
		System.out.println("--------------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + aver);
		System.out.println("등급 : " + grade);
		
		

}

*/
	/*
	private static int input(String kawmok) {
		int jumsu =0;
		
		while(true) {
			System.out.println("점수를 입력해주세요.");
			jumsu = sc.nextInt();
			
			if(jumsu>0 && jumsu<100) break;
			System.out.println("점수를 잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		return jumsu;
	}
	public static void main(String[] args) {
	
		
		
		int total = java + jsp + spring;
		double aver = total / 3.0;
		String grade;
		
		switch((int)aver / 10) {
		case 10:
		case 9 : grade ="A학점"; break;
		case 8 : grade ="B학점"; break;
		case 7 : grade ="C학점"; break;
		case 6 : grade ="D학점"; break;
		default : grade ="A학점"; 
		
		}
		
		System.out.println("------------------------------");
		System.out.println(name + "님의 성적표");
		System.out.println("------------------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + aver);
		System.out.println("등급 : " + grade);
		
		*/
		
		/*
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("이름을 입력해주세요.");
		String name = sc.next();
		
		int java = input("자바");
		int jsp = input("제이에스피");
		int spring = input("스프링");
		
		
		
		
		
	
		
		*/
	/*
	static double aver;
	static String grade;
	static String name;
	static int total;
	
	private static int input(String kawmok) {
		int jumsu = 0;
		
		while(true) {
			System.out.println("점수를 입력해주세요.");
			jumsu = sc.nextInt();
			
			if(jumsu >0 && jumsu <100) break;
			System.out.println(kawmok + "점수를 잘못 입력하셨습니다.");
		}
		return jumsu;
	}
	
	private static void calculator(int java, int jsp, int spring) {
		total = java + jsp + spring ;
		 aver = total / 3.0;
		 
		
	}
	private static void hakjum() {
		switch((int)aver / 10) {
		case 10:
		case 9 : grade = "A학점"; break;
		case 8 : grade = "B학점"; break;
		case 7 : grade = "C학점"; break;
		case 6 : grade = "D학점"; break;
		default : grade = "F학점";
		}
		
	}
		
	private static void sungjukOutput() {
		System.out.println("-----------------------");
		System.out.println(name +"님의 성적표");
		System.out.println("-----------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + aver);
		System.out.println("등급 : " + grade);
		
		
	}
		
	public static void main(String[] args) {
		
		System.out.println("학생의 이름을 입력해주세요.");
		name = sc.next();
		
		int java = input("자바");
		int jsp = input("제이에스피");
		int spring = input("스프링");
		
		
		

		//총점 구하기
		//학점 구하기
		//성적 출력하기

	  
		calculator(java, jsp, spring);

		hakjum();

	    sungjukOutput();
		*/
		static String grade;
		static String name;
		
		static double aver;
		static int total;
		
		
	private static void calculator(int java, int jsp, int spring) {
		 
		total = java + jsp + spring;
		aver = total / 3.0;
		
		
	}

	private static void hakjum() {

		switch((int)aver / 10) {
		case 10:
		case 9 : grade = "A학점";break;
		case 8 : grade = "B학점";break;
		case 7 : grade = "C학점";break;
		case 6 : grade = "D학점";break;
		default : grade = "F학점";	
		}
		
	}
	
	private static void sungjukOutput() {

		System.out.println("-------------------------------");
		System.out.println(name + "님의 성적표");
		System.out.println("-------------------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + aver);
		System.out.println("등급 : " + grade);
		
		
	}


	private static int input(String kawmok) {
		int jumsu = 0;
		
		while(true) {
			System.out.println(kawmok +"학생의 점수를 입력해주세요");
			jumsu = sc.nextInt();
			
			if(jumsu>0 && jumsu <100) break;
				System.out.println(kawmok + "점수를 잘못 입력하셨습니다.");
				
			
		}
		return jumsu;
	}
	
	
	
		
	 public static void main(String[] args) {
		
		 System.out.println("학생의 이름을 입력해주세요.");
		 name = sc.next();
		 
		 int java = input("자바");
		 int jsp = input("제이에스피");
		 int spring = input("스프링");
		
		
		
		
		
		
		
		
		    //총점 구하기
				//학점 구하기
				//성적 출력하기

			  
				calculator(java, jsp, spring);

				hakjum();

			    sungjukOutput();
				
		
		
		
	

 }

	





	
	



	



}
