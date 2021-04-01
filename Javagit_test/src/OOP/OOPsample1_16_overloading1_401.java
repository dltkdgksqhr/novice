package OOP;
import java.util.Random;

import java.util.Scanner;

 

 

/* 문제> 2개의 숫자를 입력 받아서 합계를 구하여 출력하세요.

 *  - 단, 생성자를 이용하여 데이터를 저장 합니다.

 * 	- 처리와 결과는 일반 메소드를 이용합니다.

 *  - 일반 메소드는 생성자 밑에 둬야한다.

 *  - 매개변타입이 달라야한다.

 */
public class OOPsample1_16_overloading1_401 {

	 private int num;//0 = > ?

	   private int count;//0 => 

	   private int rcount;//0 => 

	   private Scanner sc = new Scanner(System.in);

	   

	   public OOPsample1_16_overloading1_401(int num) {

	      this.num = num;

	   }

	 

	   private void suFit() {

	      do {

	         count++;

	         

	         System.out.println("사용자 데이터를 입력해 주세요.");

	         int userInput = sc.nextInt(); 

	 

	         System.out.println("컴퓨터가 발생한 난수 데이터 : " + num);

	         if (userInput == num) {

	            System.out.println("맞췄습니다.^^");

	            System.out.println("맞춘횟수 : " + ++rcount);

	         } else if (userInput > num) {

	            System.out.println("입력한 숫자 " + userInput + "컴퓨터 난수보다 큽니다.");

	            rcount++;

	         } else {

	            System.out.println("입력한 숫자 " + userInput + "컴퓨터 난수보다 작습니다.");

	            rcount++;

	         }

	         //if() //전체 반복 횟수

	            //break;

	      }while(count <= 9999999);

	      

	   } 

	      

	   public static void main(String[] args) {      

	            

	      Random rand = new Random();

	      int num = rand.nextInt(1000) + 1;// 1~1000

	      System.out.println("난수 발생 데이터 : " + num);       

	       

	      OOPsample1_16_overloading1_401 oop16_5 = new OOPsample1_16_overloading1_401(num);

	      oop16_5.suFit();

	            

	   }// main method end

	 

	} // class end