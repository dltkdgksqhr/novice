package OOP;
import java.util.Scanner;
public class OOPSample_6chapter8_401 {

	// 실행은 메인에서 한다.

		public static void main(String[] args) {

			

			Scanner sc = new Scanner(System.in);

			System.out.println("5개를 입력해주세요");

			String company = sc.next();

			String model = sc.next();

			String color = sc.next();

		    int maxspeed = sc.nextInt();

		    int speed = sc.nextInt();

			

		     Car401 car = new Car401(company,model,color,maxspeed,speed);

		    

//		    클래스명으로 접근하여 출력하기

		System.out.println("제작회사 : " + Car401.companys);   // 현대자동차

		System.out.println("모델명 : " + Car401.model);      // 그랜저

		System.out.println("색상 : " + Car401.color);       // 노란색

		System.out.println("최고속도 : " + Car401.maxspeed); // 350

		System.out.println("현재속도 : " + Car401.speed);    // 0

		

//		   객체명으로 접근하여 출력하기

		System.out.println("제작회사 : " + car.companys);   // 현대자동차

		System.out.println("모델명 : " + car.model);      // 그랜저

		System.out.println("색상 : " + car.color);       // 노란색

		System.out.println("최고속도 : " + car.maxspeed); // 350

		System.out.println("현재속도 : " + car.speed);    // 0

		

		}

	 

	}