package OOP;
import java.util.Scanner;



import A2Sample.A2;

import A2Sample.B2;
public class OOPSample_6chapter24_402 {

	public static void main(String[] args) {

		 

		//A2 a;  //[X]  public없어서 공유안됨

		A2 a = new A2();  //[O] 

		a.Adder();

		

		

		B2 b = new B2(); //[O] 공유가 돼서 import나옴

		b.Adder();

		

	}

 

 

 

}