package ArraySample;
import java.util.InputMismatchException;

import java.util.Scanner;

/*  배열이란? 하나의 이름으로 여러개의 많은 데이터 변수들을 선언하는 정적인 구조의 자료구조.
 *  문제> 번호    , 이름     , 자바,     JSP    , Spring,   총점,     평균     구하여 출력하세요.
 *      int     Stiring   Double   Double   Double  Double   Double  (타입)
 *      
 *   - index를 기준으로 처리합니다. 시작은 항상 0번으로부터 시작
 *   
 *   try{
 *   문제가 발생할만한 소스 기입
 *   } catch(java.util.InputMismatchException e){
 *   System.out.println("문자열이 입력되었습니다. 숫자로 입력해주세요.");}
 *   
 */

public class ArraySample1_2_323 {

	public static void main(String[] args) {
		/*

//      index

int bunho[]  = new int[3];
    bunho[0] = 100;
    bunho[1] = 200;
    bunho[2] = 300;

System.out.println("번호 : " + bunho[0]); //100
System.out.println("번호 : " + bunho[1]); //200
System.out.println("번호 : " + bunho[2]); //300


         for(int i =0;i< bunho.length; i++) {
       System.out.println("번호" + (i+1) +":" + bunho[i]);

       }

 

*/  // 1번째 2번째가 for문으로 바꿈 

 

System.out.println("---------------------구분선----------------");

/*
Scanner sc = new Scanner(System.in);
int bunho[]  = new int[3];
String name[]  = new String[3];
double JSP[]  = new double[3]; 
double Java[]  = new double[3];
double SPring[]  = new double[3];
double total[] = new double[3];
 double aver[] = new double[3];

 

 

 

 for(int i =0;i< bunho.length; i++) {
	  System.out.println("값을 입력해주세요.");
  	 bunho[i] = sc.nextInt(); //bunho[] 배열의 데이터 저장
   	 System.out.println("이름을 입력해주세요.");
 	   name[i] = sc.next(); //name[] 배열의 데이터 저장
 	 System.out.println("값을 입력해주세요.");
	   Java[i] = sc.nextDouble(); //Java[] 배열의 데이터 저장
	   System.out.println("값을 입력해주세요.");
	    JSP[i] = sc.nextDouble(); //JSP[] 배열의 데이터 저장
	    System.out.println("값을 입력해주세요.");
       SPring[i] = sc.nextDouble(); //SPring[] 배열의 데이터 저장
       total[i] = Java[i] + JSP[i] + SPring[i];
       aver[i] = total[i]  / bunho.length;

 

 }

 

 

 

 for(int i =0;i< bunho.length; i++) {
	  System.out.println("번호" + (i+1) +":" + bunho[i]);
	  System.out.println("이름은" + (i+1) +":" + name[i]);
	  System.out.println("Java" + (i+1) +":" + Java[i]);
   	 System.out.println("JSP" + (i+1) +":" + JSP[i]);
   	 System.out.println("SPring" + (i+1) +":" + SPring[i]);
   	 System.out.println("Total" + (i+1) +":" + total[i]);
   	 System.out.println("aver" + (i+1) +":" + aver[i]);

 

 }

 

 

*/

 

 

System.out.println("---------------------구분선----------------");

/*

 

//               3월23 오후 1시
//           sysout출력식 적을때 값을 입력해주세요로 통일해서 쓰지말기.

 

            Scanner sc = new Scanner(System.in);
            System.out.println("성적처리 인원수를 입력해주세요.");
            int Inwon = sc.nextInt();

 

           int bunho[]  = new int[Inwon];// bunho[] 배열의 데이터 저장
           String name[]  = new String[Inwon];
           double Java[]  = new double[Inwon];
           double JSP[]  = new double[Inwon]; 
           double SPring[]  = new double[Inwon];
           double total[] = new double[Inwon];
           double aver[] = new double[Inwon];

 

 
           for(int i =0;i< Inwon; i++) {
            System.out.println("번호를 입력해주세요.");
         	bunho[i] = sc.nextInt(); // bunho[] 배열의 데이터 저장

            	

        	 System.out.println("이름을 입력해주세요.");
     	   name[i] = sc.next(); //name[] 배열의 데이터 저장

     	   

     	   try { 
     	   for(int j=0;j < 1;j++) {
           System.out.println("JAVA점수를 입력해주세요.");
           double javajumsu = sc.nextDouble();

           

         //0이상 100이하이면 점수를 나타내라 | try cath(예외처리) 공부하기 
           if(javajumsu>=0 && javajumsu<=100) {
        	   Java[i] = javajumsu; 
        	           }

           else {
        	   System.out.println("점수의 범위는 0이상 100이하입니다.");
        	   j--;
        	      continue;

             }

     	    }

     	   }catch(InputMismatchException e) {
     		   //e.printStackTrace(); // 어디서 오류가 발생하는지 확인할때 사용합니다.
     		   System.out.println("문자열이 입력되었습니다. 숫자로 입력해주세요.");

     	   } 

     	   

     	   

     	  try {
     	  for(int k=0;k < 1;k++) {
           System.out.println("JSP점수를 입력해주세요.");
           double jspjumsu = sc.nextDouble();

           

           if(jspjumsu >=0 && jspjumsu <= 100) {
           JSP[i] = jspjumsu; 
           }

           else {
        	   System.out.println("점수의 범위는 0이상 100이하입니다.");  
        	   k--;
        	   continue;

            }

     	   }

     	  }catch(InputMismatchException e) {
     		 System.out.println("문자열이 입력되었습니다. 숫자로 입력해주세요.");
     	  }

     	  

     	  

     	 try {
     	 for(int m=0;m < 1;m++) {
           System.out.println("Spring점수를 입력해주세요.");
           double SPringjumsu = sc.nextDouble();

           

           if(SPringjumsu >= 0 && SPringjumsu<=100) {
        	   SPring[i] = SPringjumsu; 

           }

           else {
        	   System.out.println("점수의 범위는 0이상 100이하입니다.");
        	   m--;
            	   continue;

             }

     	  }

     	 }catch (InputMismatchException e) {
     		 System.out.println("문자열이 입력되었습니다. 숫자로 입력해주세요.");

     	  }

           total[i] = Java[i] + JSP[i] + SPring[i];
           aver[i] = total[i]  / 3.0;// 인원수로 나눠도 상관없다.


           }

 

 

 

       System.out.println("========================성 적 처 리====================================");
       System.out.println("번호\t이름\tjava\tJSP\tSpring\ttotal\taver");
       System.out.println("----------------------------------------------------------------------");

 

 

 

for(int i =0;i< Inwon; i++) {
            // System.out.print(bunho[i] + "\t"+ name[i] +"\t"+ Java[i]+"\t"+ JSP[i]+"\t"+ SPring[i]+"\t"+ total[i]+"\t"+aver[i]+"\t"); //print만함
             System.out.print(bunho[i] + "\t"+ name[i] +"\t"+ Java[i]+"\t"+ JSP[i]+"\t"+ SPring[i]+"\t" ); //print만함
             System.out.printf("%5.2f \t %5.2f \n", total[i],aver[i]);

}

 

System.out.println("======================================================================");

 

 

 

*/

 

 

 

System.out.println("---------------------구분선----------------");

 

/*

 

String name[] = new String[3];
      name[0] = "홍길동";
      name[1] = "이길동";
      name[2] = "김길동";

System.out.println("이름1 : " + name[0]);	
System.out.println("이름2 : " + name[1]);	
System.out.println("이름3 : " + name[2]);

 

 

 

System.out.println("간결하게 for문으로 작성 ");

for(int i =0;i< name.length; i++) {

System.out.println("이름" + (i+1) +":" + name[i]);

 

}

 

*/

 

 

 

System.out.println("---------------------구분선----------------");

 

/*

 

 

 

String name[]  = new String[3];
Scanner sc = new Scanner(System.in);

 

 

 

 

 

for(int i =0;i < name.length; i++) {
Scanner sc = new Scanner(System.in);
int bunho[]  = new int[3];
String name[]  = new String[3];
double JSP[]  = new double[3]; 
double Java[]  = new double[3];
double SPring[]  = new double[3];
double total[] = new double[3];
 double aver[] = new double[3];

 

}

for(int i =0;i< name.length; i++) {
System.out.println("이름은" + (i+1) +":" + name[i]);

 

}

 
*/

 
System.out.println("---------------------구분선----------------");

 /*

double Java[] = new double[3];
      Java[0] = 100;
      Java[1] = 90;
      Java[2] = 80;

 

System.out.println("자바1 : " + Java[0]);
System.out.println("자바2 : " + Java[1]);
System.out.println("자바3 : " + Java[2]);

 System.out.println("간결하게 for문으로 작성 ");

 

for(int i =0;i< Java.length; i++) {

 

System.out.println("점수" + (i+1) +":" + Java[i]);

 

}

 

*/

 

System.out.println("---------------------구분선----------------");

 

/*

 

 

 

double Java[]  = new double[3];
Scanner sc = new Scanner(System.in);

 

 

 

 

 

for(int i =0;i< Java.length; i++) {
System.out.println("값을 입력해주세요.");
Java[i] = sc.nextDouble(); //Java[] 배열의 데이터 저장

}


for(int i =0;i< Java.length; i++) {
System.out.println("Java" + (i+1) +":" + Java[i]);

 

}


*/

 

System.out.println("---------------------구분선----------------");

/*

double JSP[] = new double[3];
      JSP[0] = 100;
      JSP[1] = 75;
      JSP[2] = 80;

 

System.out.println("JSP1 : " + JSP[0]);
System.out.println("JSP2 : " + JSP[1]);
System.out.println("JSP3 : " + JSP[2]);
System.out.println("간결하게 for문으로 작성 ");

for(int i =0;i< JSP.length; i++) {
	 System.out.println("점수" + (i+1) +":" + JSP[i]);

}

 

*/

 

System.out.println("---------------------구분선----------------");

 

/*

 

double JSP[]  = new double[3];

 

Scanner sc = new Scanner(System.in);

 

 

 

 

 

for(int i =0;i< JSP.length; i++) {

 

System.out.println("값을 입력해주세요.");

 

JSP[i] = sc.nextDouble(); //JSP[] 배열의 데이터 저장

 

}

 

 

 

for(int i =0;i< JSP.length; i++) {

 

System.out.println("JSP" + (i+1) +":" + JSP[i]);

 

}

 

 

 

*/

 

 

 

 

 

 

 

System.out.println("---------------------구분선----------------");

 

/*

 

double SPring[] = new double[3];
      SPring[0] = 90;
      SPring[1] = 80;
      SPring[2] = 70;

 

System.out.println("Spring1 : " + SPring[0]);
System.out.println("Spring2 : " + SPring[1]);
System.out.println("Spring3 : " + SPring[2]);
System.out.println("간결하게 for문으로 작성 ");
for(int i =0;i< SPring.length; i++) {
 System.out.println("점수" + (i+1) +":" + SPring[i]);

 
}

 

*/

 

System.out.println("---------------------구분선----------------");

 

/*

  

 double SPring[]  = new double[3];
 Scanner sc = new Scanner(System.in);

 

   for(int i =0;i< SPring.length; i++) {
  System.out.println("값을 입력해주세요.");
   SPring[i] = sc.nextDouble(); //JSP[] 배열의 데이터 저장

 

     }


   for(int i =0;i< SPring.length; i++) {
    System.out.println("SPring" + (i+1) +":" + SPring[i]);

 

}

 

 

*/

 

 

 

System.out.println("---------------------구분선----------------");

 

 

//선언부분

 

   /*

String name[] = new String[3];

double Java[] = new double[3];

double JSP[] = new double[3];

double SPring[] = new double[3];

double total[] = new double[3];

double aver[] = new double[3];

*/

/*
//                3/23일 오후3시
//      문제> 데이터 5개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
//           데이터는 정수형입니다 , 반복문 사용
//           이 데이터중에서 홀수 데이터의 합계를 구하고, 짝수데이터의 합계를 구해서 출력합니다.

	

     Scanner sc = new Scanner(System.in);
     System.out.println("반복할 횟수 입력해주세요.");
    int j = sc.nextInt();

     

     int[] aptdong = new int[j];
     int[] apthosu = new int[j];
     String[] aptname = new String[j];
     int[] familynumber = new int[j];
     int[] elevatorsu = new int[j];

     

     for(int i =0; i<aptdong.length;i++) {
    	 System.out.println("동 수를 입력해주세요. ");
    	 aptdong[i] = sc.nextInt();
    	 System.out.println("호 수를 입력해주세요. ");
    	 apthosu[i] = sc.nextInt();
    	 System.out.println("아파트 이름을 입력해주세요. ");
    	 aptname[i] = sc.next();
    	 System.out.println("거주하는 가족 수 를 입력해주세요. ");
    	 familynumber[i] = sc.nextInt();
    	 System.out.println("엘리베이터 개수를 입력해주세요. ");
    	 elevatorsu[i] = sc.nextInt();

    	 if(i%2 ==0) {

    		 

    	 }

     }

     

  System.out.println("---------------------총 정리 ---------------------------------------------------");   

  System.out.println("아파트이름\t호수\t동수\t가족 수\t엘레베이터갯수\t");   

     

     

     

     for(int i =0; i<aptdong.length;i++) {

    	 System.out.println(aptname[i]+"\t"+ apthosu[i]+"\t"+ aptdong[i]+"\t"+ familynumber[i]+"\t"+ elevatorsu[i]);

     }

 

     System.out.println("---------------------총 정리 ---------------------------------------------------");

 

 

*/

 

 

 

//                        3/23일 오후3시

//문제> 데이터 5개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
//데이터는 정수형입니다 , 반복문 사용
//이 데이터중에서 홀수 데이터의 합계를 구하고, 짝수데이터의 합계를 구해서 출력합니다.(연습하기)
/*

Scanner sc = new Scanner(System.in);
System.out.println("반복할 횟수 입력해주세요.");
int j = sc.nextInt();

 
int[] elevatorsu = new int[j];
int hol =0, jjack=0;

for(int i =0; i<elevatorsu.length;i++) {
System.out.println("엘리베이터 개수를 입력해주세요. ");
elevatorsu[i] = sc.nextInt();

}

 

System.out.println("---------------------총 정리 ---------------------------------------------------");   
System.out.println("엘레베이터갯수\t");   

 
for(int i =0; i<elevatorsu.length;i++) {

	if(elevatorsu[i]%2 == 0) {
		 jjack +=elevatorsu[i];
}else {
	     hol +=elevatorsu[i];


}

	

}

          System.out.println("홀수의 합: " +hol);
          System.out.println("짝수의 합: " +jjack);

System.out.println("---------------------총 정리 ---------------------------------------------------");

*/

 

 

 

//              3/23일 오후3시

//문제> 데이터 5개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
//데이터는 정수형입니다 , 반복문 사용
//이 데이터중에서 음수 데이터는 skip을 하고, 양수데이터의 합계와 개수를 구해서 출력합니다.(연습하기)
//
/*  깨달은것

 * 	1. 음수 양수 짝수 홀수 if문 조건 줄 때 배열 변수 사용해도된다.

 * 

 */

 

/*

 

Scanner sc = new Scanner(System.in);

System.out.println("반복할 횟수 입력해주세요.");

int j = sc.nextInt();

 

 

double[] elevatorsu = new double[j];

int count = 0, count2=0;

double positive =0, negative=0;

 

for(int i =0; i<elevatorsu.length;i++) {

 

System.out.println("엘리베이터 개수를 입력해주세요. ");

elevatorsu[i] = sc.nextInt();

 

}

 

 

 

System.out.println("---------------------총 정리 ---------------------------------------------------");   

 

for(int i =0; i<elevatorsu.length;i++) {

	if(elevatorsu[i] >= 0) {

		

		positive +=elevatorsu[i];

		count++; 

}

	else {

		negative +=elevatorsu[i];

	     count2++;

}

	

}

          System.out.println("양수의 합: " +positive +",  양수의 개수는: " +count);

          System.out.println("음수의 합: " +negative+ ",   음수의 개수는: " +count2);

System.out.println("---------------------총 정리 ---------------------------------------------------");

 

*/

 

 

//            3/23일 오후3시
// 문제> 데이터 5개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
// 데이터는 정수형입니다 , 반복문 사용
// 이 데이터중에서 음수 데이터는 skip을 하고, 양수데이터의 합계와 개수를 구해서 출력합니다.(연습하기)
//
/*  깨달은것
* 	1. 음수 양수 짝수 홀수 if문 조건 줄 때 배열 변수 사용해도된다.
*   2. 건너뛰는 건 continue;
*/

 


Scanner sc = new Scanner(System.in);
System.out.println("반복할 횟수 입력해주세요.");
int j = sc.nextInt();

 

 

double[] elevatorsu = new double[j];
int count = 0;
double positive =0;

 

for(int i =0; i<elevatorsu.length;i++) {
System.out.println("엘리베이터 개수를 입력해주세요. ");
elevatorsu[i] = sc.nextInt();

 
}

 

 

 

System.out.println("---------------------총 정리 ---------------------------------------------------");   

 

for(int i =0; i<elevatorsu.length;i++) {
	if(elevatorsu[i] >= 0) {
		positive +=elevatorsu[i];
		count++; 

}

	else {

		continue;

}

	

}

          System.out.println("양수의 합: " +positive +",  양수의 개수는: " +count);

          

System.out.println("---------------------총 정리 ---------------------------------------------------");

 

 
		

	}

}
