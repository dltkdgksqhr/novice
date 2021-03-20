import java.io.IOException;
import java.util.Scanner;

public class JavaExam318_1 {

	public static void main(String[] args) throws IOException {
		
		
		
		
//		 127쪽 예제 학원버전
/*		1.while반복문
 * 		2.boolean형 논리값 초기값 지정, 키코드 초기값 지정, 스피드 초기값 지정
 * 		3.while 조건식 true 지정
 * 		4.while문 안에 if문 조건 키코드 13이 아니고 10이 아니면 출력식 1.증속2.감속 3.중지 만들기
 * 		5.키코드 = 아스키코드 읽는 식만들기
 * 		6. 숫자 1 아스키코드값 49, 2가 50, 3이 51인것을 알아야됨
 * 		7. 윗 조건을가지고 2번째 if문을 만들어야 한다.
 * 		8. 거짓이어야 완전 빠져나올수 있으므로 result는 거짓이라는 식을 만들어준다 (맨 마지막 if문안에 )
 * 
 * 
 */
		/*
			boolean result = true;
			int keycode = 0;
			int speed = 0;
			
		while(result) {
			
			if(keycode !=13 && keycode != 10) {
				System.out.println("---------------------------------");
				System.out.println("1. 증가");  //숫자 1은 아스키코드 49
				System.out.println("2. 감소");  //숫자 2는 아스키코드 50
				System.out.println("3. 정지");  //숫자 3은 아스키코드 51
				System.out.println("---------------------------------");
				System.out.println("숫자를 입력해주세요.");
				}
			
			keycode = System.in.read();
			
			if(keycode == 49) {
				speed += 10;
				System.out.println("속도 10 증가합니다.");
			}
			else if(keycode == 50) {
				speed -= 10;
				System.out.println("속도 10 감소합니다.");
			}
			else if(keycode == 51) {
				System.out.println("정지합니다.");
				result = false;
			}

			
		}
				
				
				
				*/


//			-------------------------------------------------------------------------------------------------------------------

			

//			문제 1| 7명의 성적을 입력받아서, 학점을 출력하세요.
            
		    /*
		      Scanner sc = new Scanner(System.in);


		      int i=0; // 초기값

		         do {
			          i++; //0, 1, 2  |증감식
		          System.out.println("성적을 입력해주세요 : ");
			      int score = sc.nextInt(); //96 , 45, 88, 34, 100, 67, 


				   if(score>=90) {
			   	System.out.println("점수가 90점 이상이고, A학점입니다.");
				   }

				  else if(score>=80) {
					System.out.println("점수가 80점 이상이고, B학점입니다.");
				  }

				  else if(score>=70) {
					System.out.println("점수가 70점 이상이고, C학점입니다.");
				  }

        			else if(score>=60) {
					System.out.println("점수가 60점 이상이고, D학점입니다.");
        			}

				  else {
					System.out.println("F학점입니다.");
				}


		 }while(i < 3);

	*/
//     ------------------------------------------------------------------------------------------
//		                do while문을 for문으로
		
		/*
		
	      Scanner sc = new Scanner(System.in);


	       // 초기값

	         for(int i=0;i < 3;i++){
	        	 
	          System.out.println("성적을 입력해주세요 : ");
		      int score = sc.nextInt(); //96 , 45, 88, 34, 100, 67, 


			   if(score>=90) {
		   	System.out.println("점수가 90점 이상이고, A학점입니다.");
			   }

			  else if(score>=80) {
				System.out.println("점수가 80점 이상이고, B학점입니다.");
			  }

			  else if(score>=70) {
				System.out.println("점수가 70점 이상이고, C학점입니다.");
			  }

  			else if(score>=60) {
				System.out.println("점수가 60점 이상이고, D학점입니다.");
  			}

			  else {
				System.out.println("F학점입니다.");
			}


	 }
*/
		
//***********************************************************************************************************			
		
			

			

//			=======================================================================================================================

			/*

//		   문제5> 1 ~ 100 사이의 홀수의 합과 짝수의 합을 구하여 합계를 출력하세요. (홀수 합 나오도록 코딩하기) 원본문제

//	     홀수의 합 : 2500
//	     짝수의 합 : 2550
//	     합계     : 5050

	  		int even=0,odd=0;

		   for(int i4=1; i4<=100;i4++) {
			   if(14 % 2 ==0) //짝수이면
				   even+=i4;
			   else 
				   odd+=i4; //홀수이면
		   }

		   

			   System.out.println("짝수: " + even);
			   System.out.println("홀수: " + odd);
			   System.out.println("총합계 : " + (even + odd));

			

			*/

			

			

//			*****************************************************************************************

		/*

//		 문제2> 1 ~ 100 사이의 홀수의 합과 짝수의 합을 구하여 합계를 출력하세요. (홀수 합 나오도록 코딩하기)
//	     홀수의 합 : 2500
//	     짝수의 합 : 2550
//	     합계     : 5050

		   

	  		int even=0,odd=0,i4 =1;


	  		do {
	  			if(i4 % 2 ==0 ) {
	  				 even+=i4;
	  			}
	  			else
	  				odd+=i4;
	  			i4++;

	  		}while(i4<=100);
	  		System.out.println("짝수: " + even);
			 System.out.println("홀수: " + odd);
			 System.out.println("총합계 : " + (even + odd));

	  		

	  		*/

	  		

//	  		*******************************************************************************************

//		문제 3

		/*
		Scanner sc = new Scanner(System.in);
		int i=0;

		

		do {System.out.println("값을 입력해주세요.");

//	    charAt의 특성 1바이트밖에 입력받지 못한다.     index값
	    char charUpper = sc.next().charAt  (1); // 대문자 65
		char charLower = sc.next().charAt  (2); // 소문자 97
		char chardigit = sc.next().charAt  (3); // 숫자 0



		if((charUpper >= 65) && (charUpper <=90)) {
			System.out.println(charUpper);
			System.out.println("대문자입니다.");


		}

		if((charLower >= 97) && (charLower <= 122)) {
			System.out.println(charLower);
			System.out.println("소문자입니다.");

		}

			
     		if(!(chardigit < 48) && !(chardigit > 57)) {
			System.out.println(chardigit);
			System.out.println("0 ~ 9 사이의 숫자 입니다.");
     		}

			i++;
		}while(i <3);

		

		*/

		

		

//		*********************************************************************************

/*

		for문  (집에서 해보기) 윗 문제 본파일

		for(int i=0;i <3;i++) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("값을 입력해주세요.");

////	charAt의 특성 1바이트밖에 입력받지 못한다.     index값
//		char charUpper = sc.next().charAt  (1)  ; // 대문자 65
//		char charLower = sc.next().charAt  (2)  ; // 소문자 97
//		char chardigit = sc.next().charAt  (3)  ; // 숫자 0




//		if((charUpper >= 65) && (charUpper <=90)) {
//			System.out.println(charUpper);
//			System.out.println("대문자입니다.");



//		}



//		if((charLower >= 97) && (charLower <= 122)) {

//			System.out.println(charLower);
//			System.out.println("소문자입니다.");
//		}


//		if(!(chardigit < 48) && !(chardigit > 57)) {
//			System.out.println(chardigit);
//			System.out.println("0 ~ 9 사이의 숫자 입니다.");


		}



	}	

	*/	

		

//원본 문제

/*
		Scanner sc = new Scanner(System.in);

		System.out.println("반복할 횟수를 입력해주세요.");

		int i1 =sc.nextInt();

		int i2 =0;



		while(i2 <i1) {

		System.out.println("점수를 입력해주세요.");

		 int jumsu = sc.nextInt();



		  switch(jumsu / 10) {

		  case 10:
		  case  9:System.out.println("A학점"); break;

		  case  8:System.out.println("B학점"); break;

		  case  7:System.out.println("C학점"); break;

		  case  6:System.out.println("D학점"); break;

		  	default:
		  	System.out.println("F학점");

		  	i2++;
		  	if(i2 == i1)
	  		break;//반복문이나 무한루프를 탈출용도 사용


		  }



		}



		//여기로 탈출

	  		*/

//	  ******************************************************************************************************************

		/*

		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력해주세요.");
		int count = sc.nextInt(); //count 반복횟수
		int scount = 0;           //scount 처리된 횟수

		

//		do while문으로 바꾸기

		do {
			 int jumsu = sc.nextInt();

			  switch(jumsu / 10) {

			  case 10:
			  case  9:
				  System.out.println("A학점"); break;
			  case  8:
				  System.out.println("B학점"); break;
			  case  7:
				  System.out.println("C학점"); break;
			  case  6:
				  System.out.println("D학점"); break;
			default:
			  		  System.out.println("F학점");

			  	scount++;//1+1=2+1=3

			  }

			  //  3   < 3

		}while(scount < count);



		

		*/



//	  		-------------------------------------------------------------------------------------------------

//		 원본 문제 맨위에

	  		

	  		/*

		boolean result = true;
		int keycode =0;
		int speed = 0;

		

		do {

			if(keycode!=13 && keycode!=10) {

				System.out.println("------Menu------");
				System.out.println("1. 증속"); // 1 => 49
				System.out.println("2. 감속"); // 2 => 50
				System.out.println("3. 중지"); // 3 => 51
				System.out.println("----------------");
	            System.out.println("selected : ");

			}
			keycode = System.in.read();	
			if(keycode == 49) {// 메뉴 번호가 1번을 선택했으면
					speed+=10; // 10씩 증속한다.
					System.out.println("현재 속도는 : " + speed);
			} else if(keycode == 50) { // 메뉴 번호를 2번 선택했으면
				speed -=10;

				

			}else if (keycode == 51) { //		메뉴 번호를 3번 선택했으면
				System.out.println("프로그램 종료");
//                                break;
                                result = false;  

			}

			
		}while(result);

		

			*/

			

			

//			----------------------------------------------------------------------------------------------------

//            라인, 넥스트라인 차이점 알아보기 | 이퀄 더블이퀄 차이점 알아보기(중요)	

		/*

		Scanner sc = new Scanner(System.in);
		System.out.println("인사말을 입력해 주세요.");
		String inputString = sc.nextLine(); //"안녕하세요.", column =>80(글자)
		String inputString2 = sc.next(); //"안녕하세요.",    column =>5(글자)
		String inputString3 = sc.next(); //"안녕하세요."    
		String inputString4 = sc.next(); //"안녕하세요."   

		

			

		System.out.println(inputString);	//안녕하세요.
		System.out.println(inputString2);	
		System.out.println(inputString3);	
		System.out.println(inputString4);	

			*/

			

//		---------------------------------------------------------------------------------

		/*

		String inputString;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("인사말을 입력해 주세요.");
			inputString = sc.nextLine(); //"안녕하세요.", column =>80(글자)
			System.out.println(inputString);

			

		}while(!inputString.equals("stop"));

			

		while(true) {

		int num = (int) (Math.random()*6);	// 0~5사이의 난수 발생
		int num2 = (int) (Math.random()*6+1); //1~6사이의 난수 발생

		System.out.println(num);
		System.out.println(num2);
		if(num == 5 && num2 == 6) break;  //num이 5되고, num2가 6이되는 순간 끝난다.

	

		}

			*/

//			-------------------------------------------------------------------------------------------

			/*

			int count = 0;
			while(count < 6) {
				int num2 = (int) (Math.random()*6+1);
				System.out.println(num2);
					count++;
					}

		

		*/

		
//		 *******************************************************************************************************
//		                  for문을 dowhile문으로 변경하기
//		  String index out of range에러는 3글자 이상 안써줘서 나타나는 오류입니다.
		/*
		Scanner sc = new Scanner(System.in);
		int i=1;
		do {
			i++;
			System.out.println("값을 입력해주세요.");


//		    charAt의 특성 1바이트밖에 입력받지 못한다.            index값
			char charUpper = sc.next().charAt  (1)  ; // 대문자 65
			char charLower = sc.next().charAt  (2)  ; // 소문자 97
			char chardigit = sc.next().charAt  (3)  ; // 숫자 0

			if((charUpper >= 65) && (charUpper <=90)) {
				System.out.println(charUpper);
				System.out.println("대문자입니다.");
			}


			if((charLower >= 97) && (charLower <= 122)) {
				System.out.println(charLower);
				System.out.println("소문자입니다.");	}


			if(!(chardigit < 48) && !(chardigit > 57)) {
				System.out.println(chardigit);
				System.out.println("0 ~ 9 사이의 숫자 입니다.");
			}

		}while(i<3);
		
		
		
		*/
		
		
		
//		\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//		while문을 do while문으로 바꾸기
//		여기서 깨달것 하나 반복횟수가 안맞으면 증감식을 옮겨보기!!!!
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력해주세요.");
		int i1 =sc.nextInt();
		int i2 =0;

		do {
			System.out.println("점수를 입력해주세요.");
			 int jumsu = sc.nextInt();
			 i2++;


			  switch(jumsu / 10) {

			  case 10:
			  case  9:System.out.println("A학점"); break;
			  case  8:System.out.println("B학점"); break;
			  case  7:System.out.println("C학점"); break;
			  case  6:System.out.println("D학점"); break;

			  	default:
			  	System.out.println("F학점");

			  	
			  	if(i2 == i1) {
			  		break;//반복문이나 무한루프를 탈출용도 사용
			  	}
			  	
			  }
		}while(i2 < i1);
		
		


		//여기로 탈출

	*/
		    
			

		


	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
