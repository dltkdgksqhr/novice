package ArraySample2;
import java.util.Scanner;



/*   이름, 자바, JSP, Spring, 점수를 입력받아서 성적 처리  
 *   처리 조건> 1.method()이용 합니다.
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
 */
public class ArraySampl2_327_11 {

	static Scanner sc = new Scanner(System.in);
	static double aver; //0.0
	static int total;
	static String name;
	static String grade;

	

	

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

	

	private static void calculator(int java, int jsp, int spring) {
		  total = java + jsp + spring;
	// System.out.println(total);
	  aver= total / 3.0;
		  String grade;

	}

	private static void hakjum() {

     

     switch((int) aver / 10) {
     case 10:
     case 9: grade = "A"; break;
     case 8: grade = "B"; break;
     case 7: grade = "C"; break;
     case 6: grade = "D"; break;
    default: grade = "F";


     }

         

           

	}

	private static void sungjukOutput() {

		System.out.println("--------------------------");  
        System.out.println(name + "님의 성적표");
        System.out.println("--------------------------");  
        System.out.println("총점 : "+ total + "점");   
        System.out.println("평균 : " + aver + "점"); 
        System.out.println("학점 : " + grade + "점");

	}

	

public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
      System.out.println("학생 이름을 입력하세요.");
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
