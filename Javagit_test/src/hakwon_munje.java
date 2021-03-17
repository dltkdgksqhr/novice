import java.util.Scanner;

public class hakwon_munje {

	public static void main(String[] args) {
	
//		   문제1 : 1 ~ 100사이의 3의배수를 구하여 개수가 몇개인지 출력하고, 합계를 출력하세요.  (문제들 집에서 다시 풀어보기) 10번채우기 16일 17일할차례
//            1. 1~100사이 조건     
//		      2. 3의배수를 만들어야한다.(만약에 3에 배수라면)
//            3. 개수 초기값 1개만들고, 합계(sum) 1개 만들고
//            
//            
	
//			while(     )해결 for문 ===> while문 while(조건식만남기고 초기값 위 , 증감식 while문 아래)
	

		   int count =0, sum =0, su =3; // 1,3

		   

		   while( su <= 100) {

			   
			   count++;

			   sum += su; //0+3 = 3, 6 + 3=  

			   System.out.println("번호 : " + count + " " +"숫자 : " + su);
			   su+=3;

			   

				   

		   }

		   System.out.println("3의 배수의 개수: " + count);

		   System.out.println("3의 배수의 합계: " + sum);

		
		
		
		
		
		
		
		
		
//	문제2 : 이젠컴퓨터아카데미라는 문자열을 5번 반복하여 출력하세요. 5번채우기 16일 17일할차례 19
//		
//	for(int i=0;i<5;i++) {
//		System.out.println("조요셉");
//		
//	}
		
		
		
	// 조건 > 5명의 성적을 입력받아서, 학점을 출력하세요. 10번채우기
		
//	1.입력받는 조건 식 scanner
//	2. 5명은 for문 조건식으로 만들기
//	3. for문 안에 점수 = 데이터.nextInt();만들기
//	4. if문으로 90점일때 80점일때 70점일때 60점일때 만들기
	
// 	Scanner sc = new Scanner(System.in);
// 	
// 	for(int i=0;i<5;i++) {
// 		System.out.println("성적을 입력해주세요.");
// 		
// 		int score = sc.nextInt();
// 		
// 		if(score >= 90) {
// 			System.out.println("A학점입니다.");
// 		}
// 		else if(score >= 80) {
// 			System.out.println("B학점입니다.");
// 		}
// 		else if(score >= 70) {
// 			System.out.println("C학점입니다.");
// 		}
// 		else if(score >= 60) {
// 			System.out.println("D학점입니다.");
// 		}
// 		else {
// 			System.out.println("A학점입니다.");
// 		}
// 		
// 	}
// 		
 		
 		
 		
 			
	 
	 
 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 	}

}
