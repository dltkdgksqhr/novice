package JavaSample;
import java.util.Scanner;

public class MethodExam5_1_319_505 {
	
          private static String str = null;
		private static Object String;
		private static java.lang.String str2;

		private static String sungjuk() {

		      String sungjuk = str;
		      
		       Scanner sc = new Scanner(System.in);
		       			   System.out.println("성적을 입력해주세요 : ");
		      int score = sc.nextInt(); //96 , 45, 88, 34, 100, 67, 76
		  		if(score >= 90) {
				  String str = "점수가 90점 이상이고, A학점입니다.";
		  		}
		  		else if(score >= 80) {
		  			String str = "점수가 80점 이상이고, B학점입니다.";
		  		}

				else if(score >= 70) {
					String str = "점수가 70점 이상이고, C학점입니다.";
				}
				else if(score >= 60) {
					String str = "점수가 60점 이상이고, D학점입니다.";
				}
				else{
					String str = "F학점입니다.";
				}
		  		return sungjuk;
          }
		  		
		  		private static String sungjuk2() { 
		  			Scanner sc = new Scanner(System.in);
		  				   System.out.println("성적을 입력해주세요 : ");
		  			      int score = sc.nextInt(); //96 , 45, 88, 34, 100, 67, 76
		  			  		if(score >= 90) {
		  					  str = "점수가 90점 이상이고, A학점입니다.";
		  			  		}

		  			  		else if(score >= 80) {
		  			  			str = "점수가 80점 이상이고, B학점입니다.";
		  			  		}

		  					else if(score >= 70) {
		  						str = "점수가 70점 이상이고, C학점입니다.";
		  					}
		  					else if(score >= 60) {
		  						str = "점수가 60점 이상이고, D학점입니다.";

		  					}
		  					else{
		  						str = "F학점입니다.";
		  					}
		  			  return sungjuk2();

		  		}
	
	public static void main(String[] args) {
		                      // 메인범위
                   //      3월 19일 오후3시
              //문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
             //3. 반환형O     전달인자X , 지역변수(if문, for문, main문 안에 선언된것은 지역변수이다.)     |두개 다 있는 경우





                         sungjuk();
                   for(int i=0; i < 2;i++)
                   str2 = sungjuk2();
             System.out.println("학점은 : " + str2);






























	}

}
