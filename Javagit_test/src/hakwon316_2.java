
import java.util.Scanner;

// while : 조건식이 참이면 실행
public class hakwon316_2 {

	public static void main(String[] args) {
		
//		3월 16일 모든 문제 다시풀어보기
		
//		문제1 while문으로 [설명: while문은 증감식 밑으로 초기값 위로]
        int count = 0, sum =0, su =3; // su틀림


	   while(su < 100) {
		   
		   
		   count++; //1, 2 , 3
		   sum += su; // 0 + 3 = 3 , 9 + 9 = 18 |누적 sum = sum + su
		   System.out.println("번호 : " + count + " " +"숫자 : " + su);
		   su+=3; //위치 틀림 | 3+3=6, 6+3=9, 9+3=12
		   
		   
		   
		   }
			   
	   
	   System.out.println("3의 배수의 개수: " + count);
	   System.out.println("3의 배수의 합계: " + sum);

		
//		문제2 : 이젠컴퓨터아카데미라는 문자열을 5번 반복하여 출력하세요.
		int k=0; // 초기값 설정
//		      0 < 5
	   while( k < 5) {
	     String str = "이젠컴퓨터아카데미";
		 System.out.println(str);
		 k++; //증감식 : 1 증가(0부터 시작), 1, 2, 3, 4
	   }
//		여기로 탈출합니다.
	   
		
//	   문제 3 for문을 while문으로 변환
	   
	   Scanner sc = new Scanner(System.in);
		 
	   int i=0;
  while( i < 2) { 
	   System.out.println("성적을 입력해주세요 : ");
  int score = sc.nextInt(); //96 , 45, 88, 34, 100, 67, 76
	

	if(score>=90)
		System.out.println("점수가 90점 이상이고, A학점입니다.");

	else if(score>=80)
		System.out.println("점수가 80점 이상이고, B학점입니다.");

	else if(score>=70)
		System.out.println("점수가 70점 이상이고, C학점입니다.");

	else if(score>=60)
		System.out.println("점수가 60점 이상이고, D학점입니다.");
	
	else {
		System.out.println("F학점입니다.");
	
	}
	// 여기로 탈출합니다.
	i++; //증감식은 바깥(아래)쪽으로
  }
	   
	   
//  문제4> for문을 이용하여 구구단을 출력하세요. (다중 for문)
  
  for(int i2=2;i2<10;i2++) {
	  System.out.println("**********" + i2 + "단" + "**********");
	  for(int i3=1;i3<10;i3++) {
	  System.out.println(  i2 + "*" + i3 + "=" + (i2*i3)); //3 x 3 = 값 형식을 못나타내줌
	  
	  }
	  System.out.println(); //줄바꿈
  }
	   
	   
//	   문제5> 1 ~ 100 사이의 홀수의 합과 짝수의 합을 구하여 합계를 출력하세요. (홀수 합 나오도록 코딩하기)
//     홀수의 합 : 2500
//     짝수의 합 : 2550
//     합계     : 5050
	   
  		int even=0,odd=0;
  
	   for(int i4=1; i4<=100;i4++) {
		  
		   if(14 % 2 == 0) //짝수이면
			   even+=i4;
		   
		   else 
			   odd+=i4; //홀수이면
	   }
	   
		   System.out.println("짝수: " + even);
		   System.out.println("홀수: " + odd);
		   System.out.println("총합계 : " + (even + odd));
		   
	   
//	   1~5까지의 합계 구하기
		   int sum4=0;
		   for(int i6=1; i6<=5; i6++) {
			    sum4 += i6;
			   
			   
		   }
	   System.out.println(sum4);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

		
		
		
		


	
		
		
		
		

	}

}
