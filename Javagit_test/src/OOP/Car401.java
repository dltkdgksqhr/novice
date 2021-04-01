package OOP;

public class Car401 {
	   static String companys ="현대자동차" ; 

	   static String model = "그랜저";

	   static String color = "노란색";

	   static  int maxspeed = 350;

	   static  int speed;

	   

	   @SuppressWarnings("static-access")

	public Car401(String company, String model, String color, int maxspeed, int speed) {

		   

		companys = company;  // 변수명이다르면 this (x)

		this.model = model;

		this.color = color;

		this.maxspeed = maxspeed;

		this.speed = speed;

		

		

		

	}

	public Car401() { //디폴트 초기화

		

	}

	   

}