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
public class ArraySample1_1_323 {
	

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
	}

}
