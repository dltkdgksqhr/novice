package Practice;

import java.util.Scanner;
/*
class student {

	public void add(int a, int b) {
		int sum =0;
		
		sum = a + b;
		System.out.println(sum);
		
	}
	
}
*/




	/*
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		student obj = new student();
		System.out.println("값을 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		obj.add(a,b);
		*/
		
/*
class ejttoa {
	
	
	public void add(int a, int b) {
		int sum = 0;
		
		sum = a +b;
		System.out.println(sum);
	}
	
	

}







		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		ejttoa os1 = new ejttoa();
		
		os1.add(a,b);
		
		
		*/
		
		
/*

class math{

	public void add(int a, int b) {
		int sum = 0;
		
		sum = a +b;
		System.out.println("덧셈 : " + sum);
		
	}

	public void multi(int a, int b) {
		int sum = 0;
		
		sum = a * b;
		System.out.println("곱셈 : " + sum);
		
	}
	
	
	
}







		

		math a1 = new math();
		
		Scanner je = new Scanner(System.in);
		System.out.println("두 변수의 값을 입력해주세요.");
		int a = je.nextInt();
		int b = je.nextInt();
		a1.add(a,b);
		
		a1.multi(a,b);
		
		*/
		
		
/*
 class math{

	public void add(int a, int b) {
		int sum = 0;
		
		sum = a + b;
		System.out.println("덧셈 : "  + sum);
		
	}

	public void multi(int a, int b) {
		int sum = 0;
		
		sum = a * b;
		System.out.println("곱셉 : " + sum);
		
	}

	public void add2(String a1, int b1) {
		int sum =0;
		
		int c = Integer.parseInt(a1);
		
		sum = c+b1;
		System.out.println("문자타입 + 정수형 : " + sum);
		
	}
	 
	 
	 
	 
 }
*/



		
		
  
		
		
		/*
		math os1 = new math();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 변수에 값을 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		os1.add(a,b);
		
		os1.multi(a,b);
		
		System.out.println("두 변수에 값을 입력해주세요.");
		String a1 = sc.next();
		int    b1 = sc.nextInt();
		os1.add2(a1,b1);
		*/
		/*
		
		class math{

	public void add(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.println("덧셈 : " + sum);
		
	}
			
		}






   public class practice1 {
	
	
	public static void main(String[] args) {
		
		
		  Scanner sc = new Scanner(System.in);
		  
		  math os2 = new math();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		os2.add(a,b);
		
		*/
		
		


 class sungjuck{

	public void sungjuck(int score) {
		
		
			if(score >= 90) {
				System.out.println("A학점입니다.");
			}
			else if(score >= 80) {
				System.out.println("B학점입니다.");
			
		}
		else if(score >= 70) {
			System.out.println("C학점입니다.");
		
	  }
	  else if(score >= 60) {
		System.out.println("D학점입니다.");
	  }
 
    else{
	 System.out.println("F학점입니다.");
     }
			
			
				
			
	
	}
	
 }









public class practice1 {
	
	
	public static void main(String[] args) {
		
		sungjuck os2 = new sungjuck();
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
		int score = sc.nextInt();
		os2.sungjuck(score);
		}
		
		
		
		
		
		
		
		
		
		

		
	}

}
