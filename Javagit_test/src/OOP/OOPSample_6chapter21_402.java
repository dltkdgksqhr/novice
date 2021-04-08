package OOP;
import java.util.Scanner;



class Singleton {

	   

	   private static Singleton singleton = new Singleton();

	   

	   Singleton() {

//		   defualt 생성자

	   }

	   

	   static Singleton getInstance() {

		   return singleton;

	   }

	   
	   

}
public class OOPSample_6chapter21_402 {

	public static void main(String[] args) {

		 

//		Singleton obj1 = new Singleton(); //같은 주소가 아니다.

//		Singleton obj2 = new Singleton(); //prototype 방식

		

		Singleton obj1 = Singleton.getInstance(); //같은 주소이다. , singleton방식

		Singleton obj2 = Singleton.getInstance();

		

		if(obj1 == obj2) {

			System.out.println("같은 Singleton 객체 입니다.");

		}else {

			System.out.println("같은 Singleton 객체가 아닙니다.");			

		}

		

		

 

	}

 

 

 

}
