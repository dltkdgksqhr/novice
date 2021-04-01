package OOP;
import java.util.Scanner;
public class OOPSample_6chapter5_401 {
	   

	  static String company; // 자동초기화

	  static String model;

	  static String color;

	  static int maxspeed;

	  static int speed;

	   

	   

	// 실행은 메인에서 한다.

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);

		System.out.println("5개를 입력해주세요");

		String company = sc.next();

		String model = sc.next();

		String color = sc.next();

	    int maxspeed = sc.nextInt();

	    int speed = sc.nextInt();

		

	

	

	System.out.println("제작회사 : " + company);   // 현대자동차

	System.out.println("모델명 : " + model);      // 그랜저

	System.out.println("색상 : " + color);       // 검정색

	System.out.println("최고속도 : " + maxspeed); // 350

	System.out.println("현재속도 : " + speed);    // 0

	

	

	}



}