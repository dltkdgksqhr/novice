package OOP;
import java.util.Scanner;



class Car402_2 {

  static String company = "현대자동차";

  static String model;

  static String color;

  static int maxSpeed;

  

  Car402_2(){

     //default constructor

  }

  

  Car402_2(String model){

     this(model, "은색", 250);

  }

  

  Car402_2(String model, String color){

     this(model, color, 250);

  }

  

  Car402_2(String model, String color, int maxSpeed){

     this.model = model;

     this.color = color;

     this.maxSpeed = maxSpeed;

  }

  

}
public class OOPSample_6chapter9_402 {

	public static void main(String[] args) {

		 

		   

		   

		/*

				

				   Scanner sc = new Scanner(System.in);

	 

			

	 

			System.out.println("5개를 입력해주세요");

	 

			String company = sc.next();

			String model = sc.next();

			String color = sc.next();

		    int maxspeed = sc.nextInt();

		    int speed = sc.nextInt();

			   */

			

	 

			Car402_2 car1 = new Car402_2();

		     System.out.println("car1.company : " + car1.company);

		     System.out.println(); //줄바꿈 용도

		    

		     Car402_2 car2 = new Car402_2("자가용");

		     System.out.println("car2.company : " + car2.company);

		     System.out.println("car2.model : " + car2.model);

		     System.out.println(); //줄바꿈 용도

		     

		     Car402_2 car3 = new Car402_2("자가용","빨강");

		     System.out.println("car3.company : " + car3.company);

		     System.out.println("car3.model : " + car3.model);

		     System.out.println("car3.color : " + car3.color);

		     System.out.println(); //줄바꿈 용도

	 

		     Car402_2 car4 = new Car402_2("자가용","빨강",500);

		     System.out.println("car4.company : " + car4.company);

		     System.out.println("car4.model : " + car4.model);

		     System.out.println("car4.color : " + car4.color);

		     System.out.println("car4.maxSpeed: " + car4.maxSpeed);

		     System.out.println(); //줄바꿈 용도

		     

	 

		

	 

		}

	 }