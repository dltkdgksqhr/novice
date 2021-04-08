package Practice;
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
 *  1. 메인메소드부터 생각하자.
 *  2. 학생이름 입력받고, 각 과목 점수 입력받고, 총점,평균 계산
 *  3. 등급 선언해주기
 *  
 * 
 * 
 * 
 */

/*

	static Scanner sc = new Scanner(System.in);

	

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
         *  1. 메인메소드부터 생각하자.
         *  2. 학생이름 입력받고, 각 과목 점수 입력받고, 총점,평균 계산
         *  3. 등급 선언해주기
         *  
         * 
         * 
         * 
         */
/*

	Scanner sc = new Scanner(System.in);
	
	System.out.println("학생 이름을 입력해주세요.");
	String name = sc.next();
	
	int java = input("자바");
	int jsp = input("제이에스피");
	int spring = input("스프링");
	
	int total = java + jsp + spring;
	double aver = total / 3.0;
	String grade;
	
	switch((int)aver/10) {
	case 10:
	case 9:
	case 8:
	case 7:
	case 6:
	
	}
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
 *  1. 메인메소드부터 생각하자.
 *  2. 학생이름 입력받고, 각 과목 점수 입력받고, 총점,평균 계산
 *  3. 등급 선언해주기
 *  
 * 
 * 
 * 
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
*/

/*
public class sihummunjae1 {
	
	private static int input(String kawmok) {
		// TODO Auto-generated method stub
		return 0;
	}

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("학생 이름을 입력해주세요.");
	String name = sc.next();
	
	int java = input("자바");
	int jsp = input("jsp");
	int spring = input("spring");
	
	int total = java + jsp + spring;
	double aver = total / 3.0;
	String grade;
	
	switch((int)aver / 10) {
	case 10:
	case 9 : grade = "A학점입니다."; break;
	case 8 : grade = "B학점입니다."; break;
	case 7 : grade = "C학점입니다."; break;
	case 6 : grade = "D학점입니다."; break;
	default : grade = "F학점입니다."; break;
	}
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
 *  1. 메인메소드부터 생각하자.
 *  2. 학생이름 입력받고, 각 과목 점수 입력받고, 총점,평균 계산
 *  3. 등급 선언해주기
 *  4. switch문으로 각 등급 작성해주기
 *  5. 최종 출력식 만들기.
 * 
 * 
 * 
 */
/*
public class sihummunjae1 {
	
	private static int input(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("학생 이름을 입력해주세요.");
    	String name = sc.next();
    	
    	int java = input("자바");
    	int jsp = input("jsp");
    	int spring = input("spring");
    	
    	int total = java + jsp + spring;
    	double aver = total / 3.0;
    	String grade;
    	
    	switch((int)aver / 10) {
    	case 10:
    	case 9 : grade = "A학점"; break;	
    	case 8 : grade = "B학점"; break;	
    	case 7 : grade = "C학점"; break;	
    	case 6 : grade = "D학점"; break;
    	default : grade = "F학점"; 
    	
    	}
*/
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

	static Scanner sc = new Scanner(System.in);
	
	private static int input(String kawmok) {
		
		int jumsu;
		
		
		while(true) {
			
			System.out.println(kawmok + "점수를 입력해주세요");
			jumsu = sc.nextInt();
			
			if(jumsu > 0 && jumsu < 100) break;
			System.out.println("점수를 잘못 입력하셨습니다.");
			
		}
		return jumsu;
	}


	
	
    	
    	
    	
    	System.out.println("학생 이름을 입력해주세요.");
    	String name = sc.next();
    	
    	int java = input("자바");
    	int jsp = input("jsp");
    	int spring = input("spring");
    	
    	int total = java + jsp + spring;
    	double aver = total / 3.0;
    	String grade;
    	
    	switch((int)aver/3) {
    	case 10:
    	case 9 : grade = "A학점"; break;
    	case 8 : grade = "B학점"; break;
    	case 7 : grade = "C학점"; break;
    	case 6 : grade = "D학점"; break;
    	default : grade = "F학점"; 
    	}
	
	
	System.out.println("-------------------------------------");
	System.out.println(name + " 님의 성적표");
	System.out.println("-------------------------------------");
	System.out.println("총점 : " + total);	
	System.out.println("평균 : " + aver);	
	System.out.println("등급 : " + grade);	
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
 *  1. 메인메소드부터 생각하자.
 *  2. 학생이름 입력받고, 각 과목 점수 입력받고, 총점,평균 계산
 *  3. 등급 선언해주기
 *  4. switch문으로 각 등급 작성해주기
 *  5. 최종 출력식 만들기.
 * 
 * 
 * 
 */
public class sihummunjae1 { 	

	static Scanner sc = new Scanner(System.in);
	
	private static int input(String kawmok) {
		int jumsu;
		while(true) {
			System.out.println(kawmok + "점수를 입력해주세요");
			jumsu = sc.nextInt();
			
			if(jumsu >0 && jumsu <100) break;
			System.out.println("점수를 잘못 입력하셨습니다.");
		}
		return jumsu;
	}
            public static void main(String[] args) {
	
		
		System.out.println("학생 이름을 입력해주세요.");
		String name = sc.next();
		
		int java = input("자바");
		int jsp = input("jsp");
		int spring = input("spring");
		
		int total = java + jsp + spring;
		double aver = total / 3.0;
		String grade;
		
		switch((int)aver / 10) {
		case 10:
		case 9 : grade ="A학점"; break;
		case 8 : grade ="B학점"; break;
		case 7 : grade ="C학점"; break;
		case 6 : grade ="D학점"; break;
		default : grade ="F학점"; 
		}
		
		System.out.println("-----------------------------------");
		System.out.println(name + "님의 성적표");
		System.out.println("-----------------------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + aver);
		System.out.println("등급 : " + grade);
		System.out.println("-----------------------------------");

	
	
	
	}


	

 

	

 

}