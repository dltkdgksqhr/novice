package OOP;
import java.util.Scanner;



class Person {

//	    field area

/* 상수값 : Korea,123456-1234567,계백장군

* 변수	: nation,ssn,name  

* final : 고정된 값을 지정하여 사용시 활용, pi = 3.141592.......

* 

*/

	  final String nation = "Korea"; //final은 수정불가라는 뜻 

	   String ssn; //123456-1234567

	   String name; //계백장군

	   

//	   private final static double pi = 3.1415927582;   이런 형식으로 작성가능

	   

	   

	   

	   

	   

	public Person(String ssn, String name) {

		this.ssn = ssn;

		this.name = name;

		

		}

	   

	   

}
public class OOPSample_6chapter22_402 {

	public static void main(String[] args) {

		 

		Person p1 = new Person("123456-1234567","계백장군");

		

		System.out.println(p1.nation);

		System.out.println(p1.ssn);

		System.out.println(p1.name);

 

		/*

		p1.nation = "USA"; final때문에 변경 안됨.

		*/

		p1.ssn = "521876-6854727";

		System.out.println(p1.ssn);

		

		p1.name = "을지문덕";

		System.out.println(p1.name);

		

		

	}

 

 

 

}