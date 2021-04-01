package OOP;
import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;

 

/*   

 *  문제> 다음과 같은 과목의 성적이 존재합니다. 

 *  학번(serial),이름(name),자바(java),jsp(jsp),Spring(spring), 총점(total), 평균(average)를 구하여 출력하세요.

 *  setter()라는 메소드를 이용하여 데이터를 저장하고

 *  getter()라는 메소드를 이용하여 데이터를 출력하세요.

 *  --------------------------------------------

 *   학번(serial) :

 * 	 이름(name) : 

 *   자바(java) :

 *   jsp(jsp) :

 * 	 Spring(spring) :

 *  --------------------------------------------

 *  평균(average) :

 *  총점(total) :

 *  --------------------------------------------  

 */

 

/*  1. 파일 이름을 이용해서 객체를 만든다.

 *  2. 객체 위에 입력받는 값을 만든다.

 *  3. 객체 변수명. ~~호출명을 정해준다.

 *  4. 호출명 괄호()안에 전달인자값을 넣어준다.

 *  5. 생성자를 만든다.

 *  6. 각 생성자 안에 this.전달인자값을 만들어준다.

 *  7. 출력해본다.

 *   */
public class OOPsample1_16_getset2_401 {

	//필드영역 : 속성을 변수로 표현해준다.

	

	  private String serial;  //null ==>

	  private String name;  //null ==>

	  private int java; //null ==>

	  private int jsp;  //0 ==>

	  private int spring;   //0 ==>

	  private double average;  //0 ==>

	  private int total;  //0 ==>

	  private static OOPsample1_16_getset2_401 oop17_gs =new  OOPsample1_16_getset2_401();

	  

	  

	  

	  

	  

	  

	  public String getSerial() {

		return serial;

	}









	public void setSerial(String serial) {

		this.serial = serial;

	}









	public String getName() {

		return name;

	}









	public void setName(String name) {

		this.name = name;

	}









	public int getJava() {

		return java;

	}









	public void setJava(int java) {

		this.java = java;

	}









	public int getJsp() {

		return jsp;

	}









	public void setJsp(int jsp) {

		this.jsp = jsp;

	}









	public int getSpring() {

		return spring;

	}









	public void setSpring(int spring) {

		this.spring = spring;

	}









	public double getAverage() {

		return average;

	}









	public void setAverage(double average) {

		this.average = average;

	}









	public int getTotal() {

		return total;

	}









	public void setTotal(int total) {

		this.total = total;

	}









	public static OOPsample1_16_getset2_401 getOop17_gs() {

		return oop17_gs;

	}







	private void sungjukOperation() {

		total = java + jsp + spring;

		average = total / 3.0;

		

	}

	

		

	

	

	private void sungjukResult() { //getter

		

		

	  System.out.println("--------------------------------------------");

    System.out.println("학번(serial) : " + oop17_gs.getSerial());

    System.out.println("이름(name) : " + oop17_gs.getName());

    System.out.println("자바(java) 점수 : " + oop17_gs.getJava());

    System.out.println("jsp(jsp) 점수 : " + oop17_gs.getJsp());

    System.out.println("Spring(spring) 점수 : "+ oop17_gs.getSpring());

    System.out.println("--------------------------------------------");

    System.out.println("평균(average) : " + average +" 점");

    System.out.println("총점(total) : " + total +" 점");

    System.out.println("--------------------------------------------");

   

   

   

 }

	

	

	

	

public static void main(String[] args) {

	

	

         Scanner sc = new Scanner(System.in);

         

	   System.out.println("학번(serial)을 입력해 주세요.");

     String serial = sc.next(); 

     System.out.println("이름(name)을 입력해 주세요.");

     String name = sc.next(); 

     System.out.println("자바(java) 점수를 입력해 주세요.");

     int java = sc.nextInt(); 

     System.out.println("jsp(jsp) 점수를 입력해 주세요.");

     int jsp = sc.nextInt(); 

     System.out.println("Spring(spring) 점수를 입력해 주세요.");

     int spring = sc.nextInt(); 

	

     

     

	   //DataInput(setter)

     oop17_gs.setSerial(serial); //(전달인자값)

     oop17_gs.setName(name);

     oop17_gs.setJava(java);

     oop17_gs.setJsp(jsp);

     oop17_gs.setSpring(spring);

     

//     DataProcessing

     oop17_gs.sungjukOperation();

   

     

	   

//	   DataOutput

     oop17_gs.sungjukResult();

  

     


			}// main method end







} // class end
