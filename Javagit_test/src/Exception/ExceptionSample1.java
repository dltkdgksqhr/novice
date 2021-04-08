package Exception;
import java.util.InputMismatchException;

import java.util.Scanner;
public class ExceptionSample1 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

		  

		  System.out.println("성적처리 인원수를 입력해주세요.");

		  

		  try {

			  

		  int Inwon = sc.nextInt();

		 

		 

		 

		 

		 

		  int bunho[]  = new int[Inwon];

		 

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

		 

		  	 System.out.println("JAVA점수를 입력해주세요.");

		 

		    Java[i] = sc.nextDouble(); //Java[] 배열의 데이터 저장

		 

		    System.out.println("JSP점수를 입력해주세요.");

		 

		     JSP[i] = sc.nextDouble(); //JSP[] 배열의 데이터 저장

		 

		     System.out.println("Spring점수를 입력해주세요.");

		 

		     SPring[i] = sc.nextDouble(); //SPring[] 배열의 데이터 저장

		 

		     

		 

		     total[i] = Java[i] + JSP[i] + SPring[i];

		 

		     aver[i] = total[i]  / 3.0;// 인원수로 나눠도 상관없다.

		 

		  }

		 

		 

		 

		  System.out.println("==========성 적 처 리 ==================================================");

		 

		  System.out.println("번호\t이름\tjava\tJSP\tSpring\ttotal\taver");

		 

		  System.out.println("----------------------------------------------------------------------");

		 

		 

		 

		  for(int i =0;i< Inwon; i++) {

		 

		   

		 

		   System.out.print(bunho[i] + "\t"+ name[i] +"\t"+ Java[i]+"\t"+ JSP[i]+"\t"+ SPring[i]+"\t");

		 

		   System.out.printf("%5.2f" + "\t" + "%5.2f"+ "\n" ,total[i],aver[i]);

		 

		   //소수점 버리는것도 조정하기

		 

		//   System.out.println(String.format("%.2f",total[i] ));

		 

		//   System.out.println(String.format("%.2f",aver[i] ));

		 

		  }

		 

		  System.out.println("======================================================================");

		}catch(InputMismatchException e) {

			System.out.println("제대로 된 값을 입력해주세요.");

		}

		 

		 

				

				

			}

		 

		}