package OOP;
import java.util.Scanner;

/* 추상(abstract) : 실체간에 공통되는 특성을 추출한 것

 * 새, 곤충, 물고기 : 동물

 * 삼성, 현대, LG : 회사

 * 

 *  class Parent : (일반)실체 클래스 

 *  public abstract class parent33 : 추상 클래스 

 *  추상 클래스는 객체를 생성하지 못합니다. 그러므로 추상 클래스의 추상 메소드는 일반 클래스에서 상속을 받아서

 *  추상 메소드 오버라이딩을 통하여 메소드를 실행합니다.

 *  

 *  추상 클래스의 용도>

 *  1. 실체 클래스들의 공통적인 필드와 메소드의 이름을 통일할 목적

 *  2. 실체 클래스 작성 할 때 시간을 절약할 수 있다.

 *  

 *  

 * 

 */

 

	abstract class Phone{

 

//              	필드

		  static String owner;

		 

		 

//	              생성자

		public Phone(String owner) {

			this.owner = owner;

			

		}

		

//	               메소드

		public void trunOn() {

			System.out.println("폰의 전원을 켭니다.");

			

		}	

		

		public void turnOff() {

			System.out.println("폰의 전원을 끕니다.");

		}

 

		public void NameResult() {

			System.out.println(owner);

		}

		

		public abstract void AAA(); // 추상 메소드 선언

		

		

		

		

		

		

		

		

	}

	

	

 

 

	class SmartPhone extends Phone {

 

	public SmartPhone(String owner) { //매개변수(parameter)

		super(owner);

		

		}

 

	public void internetSearch() {

		System.out.println("인터넷 검색을 합니다.");

		

	}

 

	@Override

	public void AAA() {

		System.out.println("AAA");

		

	}

 

	

}

 

 

public class InheritanceSample_7chapter8{

	public static void main(String[] args) {
//		Phone phone = new Phone(); 에러

		

		SmartPhone smartphone = new SmartPhone("홍길동");

		

		smartphone.trunOn(); //폰의 전원을 켭니다.

		smartphone.internetSearch(); // 인터넷 검색을 합니다.

		smartphone.turnOff(); // 폰의 전원을 끕니다.

//		Phone.owner;  //클래스명.클래스변수 => 추상클래스이므로 접근허용이 안됨.

		smartphone.NameResult(); // 홍길동

		

		

	}