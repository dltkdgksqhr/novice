package ArraySample;

import java.util.Arrays;

public class JavaArray_325_jungsuk {

	public static void main(String[] args) {
		/* 분석   3번 반복합시다.
		 * 1. ㅌ타입[] 배열변수명 = 각값들
		 * 2. 최대값, 최소값 초기화 변수명 설정 | 타입 변수명 = 점수변수명[0번지]; 
		 * 3. for문
		 * 4. if문 점수변수명[for문초기값] > max | else if점수변수명[for문초기값] < min
		 * 5.  최대값 = 점수변수명[for문 초기값];
		 * 6.  최소값 = 점수변수명[for문 초기값];
		 * 7. 최종 출력식 
		 * 
		 */
		/*
		int[] score = { 3,65,43,55,6,7,4};
		
		int max = score[0]; //초기값 3저장
		int min = score[0]; //초기값 3저장
		
		for(int i =1;i<score.length;i++) {
			if(score[i]>max) {
				max = score[i];			
			} else if(score[i]<min)
				min = score[i];			
		}
			System.out.println("최대값은 : " + max);
			System.out.println("최소값은 : " + min);
			*/
		

		int[] ball = new int[45]; //45개 정수값 저장하기
		
//		배열의 각 요소에 1 ~ 45의 값을 저장한다.
		for(int i=0; i<ball.length;i++) 
			ball[i] = i+1; // ball[0]에 1이 저장된다.
			int tmp= 0; //두 값을 바꾸는데 사용할 임시변수
			int j= 0; //임의의 값을 얻어서 저장할 변수
			// 배열i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 저장
//			   0번째부터 5번째 요소까지 모두 6개만 바꾼다.
			for(int i=0;i<6;i++) {
				j =(int)(Math.random()*45);// 0~44범위 임의 설정
				tmp = ball[i];
				ball[i] = ball[j];
				ball[j] = tmp;
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
  }
}