package ArraySample;

import java.util.Arrays;

public class Array_javajungsuk {

	public static void main(String[] args) {
		// index : 0~3-1, 0~2
//		                    0     1   2
		/* 1. String타입 배열변수명 = 가위바위보
		 * 2. Arrays.tosting출력식 
		 * 3. for문 작성 조건식이 횟수를 결정
		 * 4. (for문 안에) 난수를위해서 int변수 = (int)(Math.randm()*3);// int형변환 시켜주는 이유 안하면 float형으로나옴 
		 * 5. 배열변수명[난수변수명] 
		 *    3번 반복하기 
		 */
		/*
		String[] Arr = {"가위","바위","보"};
		System.out.println(Arrays.toString(Arr));
		
		for(int i=0;i<10;i++) {
			int b =(int)(Math.random()*3); //0~2번
			System.out.println(Arr[b]);
		}
		*/

//		가위바위보게임 만들기
		/*
		String[] Arr = {"가위","바위","보"};
		System.out.println(Arrays.toString(Arr));
		
		for(int i=0;i<10;i++) {
			int b = (int)(Math.random()*3);
			System.out.println(Arr[b]);
		}
		*/
		
		/*  1.String타입에 배열변수식 만들기
		 * 	2.Arrays를 이용해서 출력해보기
		 * 	3.for문을 작성해서 가위바위보 횟수정하기
		 * 	4.for문안에 3개의 난수를 만들기
		 * 	5.배열변수명[b] 출력식 만들기
		 * 
		 */
		/*
		String[] Arr = {"가위","바위","보"};
		System.out.println(Arrays.toString(Arr));
		
		for(int i=0;i<10;i++) {
			int b = (int)(Math.random()*3);
			System.out.println(Arr[b]);
		}
		*/
		/*
		System.out.println("매개변수의 개수 : " + args.length);
		for(int i=0;i<args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i]+"\"");
		}
		*/
		
		/*  2차원 배열
		 * 	1. 2차원 배열은 대괄호를([])2개 입력하고 배열변수 사용한다.
		 * 	2. 100,20,30,40 리터럴을 입력해준다.
		 * 	3. 합에대한 변수 선언
		 * 	4. for문1 작성후 바로 for문2 작성한다. 조건식에 대괄호 쓴다.
		 * 	5. for문2에 점수 출력식, 각 for문 초기값, 점수 for문 각각 초기값을 []에 넣기
		 * 	6. 합에대한 연산식 주의사항 for문2에서는 무조건 for문1 2초기값을[]에 넣어줘야한다.
		 * 	7. 맨 마지막에 합에대한 출력식 나타내기
		 */
		 

		
		
		/*
		
		int[][] Arr = {
				{100, 100, 100},
				{10, 10, 10},
				{20, 20, 20},
				{20, 20, 20}
				
		};
		
		int sum =0;
		
		for(int i=0;i<Arr.length;i++) {
			for(int j=0;j<Arr[i].length;j++) {
				System.out.printf("Arr[%d][%d]=%d%n", i, j  + Arr[i][j]);
				sum += Arr[i][j];
				
			}
			
		}
		System.out.println("합계" + sum);
		
		*/
		
		/*   1. 점수 2차원 배열로 선언해준다.
		 *   2. 과목별 총점을 선언해준다. (3과목)
		 *   3. 번호,국어,영어,수학,총점,평균 순으로 출력식을 적어주고
		 *   4. for문 작성
		 *   5. 개인별 총점, 평균 식을 작성
		 *   6. 과목 총점 연산식 작성
		 *   7. 번호를 나타내줄 출력식 작성
		 * 
		 * 
		 */
		/*
		int[][] score = {
				{100, 100, 100},
				{80, 80, 80},
				{70, 70, 70},
				{60, 60, 60}
				
		};
		
		int korTotal =0; int engTotal=0; int mathTotal=0;
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("-------------------------");
		
		for(int i=0;i<score.length;i++) {
			int Total =0;
			int Aver =0;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.printf("%3d",i+1);
		}
		
		*/
		
		/*   1. 점수 2차원 배열로 선언해준다.
		 *   2. 과목별 총점을 선언해준다. (3과목)
		 *   3. 번호,국어,영어,수학,총점,평균 순으로 출력식을 적어주고
		 *   4. for문 작성
		 *   5. 개인별 총점, 평균 식을 작성
		 *   6. 과목 총점 연산식 작성
		 *   7. 번호를 나타내줄 출력식 작성
		 * 
		 * 
		 */
		/*
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{70, 70, 70},
				{80, 80, 80}
				
		};
		
		int krTotal =0; int engTotal =0; int MathTotal=0;
		
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("------------------------------");
		
		for(int i=0;i<score.length;i++) {
			int total = 0;
			int aver = 0;
			
			krTotal += score[i][0];
			engTotal += score[i][1];
			MathTotal += score[i][2];
			System.out.printf("%3d",(i+1)); //번호 출력식 
		}
		
		*/
		/*   1. 점수 2차원 배열로 선언해준다.
		 *   2. 과목별 총점을 선언해준다. (3과목)
		 *   3. 번호,국어,영어,수학,총점,평균 순으로 출력식을 적어주고
		 *   4. for문 작성
		 *   5. 개인별 총점, 평균 식을 작성
		 *   6. 과목 총점 연산식 작성
		 *   7. 번호를 나타내줄 출력식 작성
		 */
		/*
		int[][] score = {
				{100, 100, 100},	
				{80, 80, 80},	
				{70, 70, 70},	
				{60,60, 60}
		};
		
		int krTotal =0; int engTotal=0; int MathTotal=0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("--------------------------");
	
		for(int i=0;i<score.length;i++) {
			int total =0;
			int aver =0;
			
			krTotal +=score[i][0];
			engTotal +=score[i][1];
			MathTotal +=score[i][2];
			System.out.printf("%3d" , (i+1));
			
			
		}
		*/
		
		/*   1. 점수 2차원 배열로 선언해준다.
		 *   2. 과목별 총점을 선언해준다. (3과목)
		 *   3. 번호,국어,영어,수학,총점,평균 순으로 출력식을 적어주고
		 *   4. for문 작성
		 *   5. 개인별 총점, 평균 식을 작성
		 *   6. 과목 총점 연산식 작성
		 *   7. 번호를 나타내줄 출력식 작성
		 *   8. for문2 안에 총점연산식
		 *   9. for문2 안에 총점 출력식(5칸뛰기)
		 *   10. for2문 바깥에 평균계산식
		 *   11. for2문 출력식 총점(int)하고 평균(float) 출력식,정수형은 5칸, float형은 5칸뛰고1자리에서반올림
		 *   12. for1문 바깥에다 각 과목 총점 출력식 작성
		 *   
		 */
		/*
		int[][] score = {
				{100, 100, 100},	
				{90, 90, 90},
				{80, 80, 80},	
				{70, 70, 70}	
		};
		
		int krTotal =0; int engTotal=0; int mathTotal=0;
		
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("------------------------------");
		
		for(int i=0;i<score.length;i++) {
			int total =0;
			float aver =0;
			
			krTotal +=score[i][0];
			engTotal +=score[i][1];
			mathTotal +=score[i][2];
			
			System.out.printf("%3d" , i+1);
		*/
		
		/*
		for(int j=0;j < score[i].length;j++) {
			total+= score[i][j]; 
			System.out.printf("%5d", score[i][j]);
			}

		aver = total/(float)score[i].length;  // 평균계산
			System.out.printf("%5d %5.1f%n", total, aver);

		}
			System.out.println("=============================");
			System.out.printf("총점:%3d %4d %4d%n", krTotal, engTotal, mathTotal);
*/

		/*   1. 점수 2차원 배열로 선언해준다.
		 *   2. 과목별 총점을 선언해준다. (3과목)
		 *   3. 번호,국어,영어,수학,총점,평균 순으로 출력식을 적어주고
		 *   4. for문 작성
		 *   5. 개인별 총점, 평균 식을 작성
		 *   6. 과목 총점 연산식 작성
		 *   7. 번호를 나타내줄 출력식 작성
		 *   8. for문2 안에 총점연산식
		 *   9. for문2 안에 총점 출력식(5칸뛰기)
		 *   10. for2문 바깥에 평균계산식
		 *   11. for2문 바깥에 출력식 총점(int)하고 평균(float) 출력식,정수형은 5칸, float형은 5칸뛰고1자리에서반올림,줄바꿈
		 *   12. for1문 바깥에다 각 과목 총점 출력식 작성
		 *   
		 */
		/*
		for(int j=0;j<score[i];j++) {
			total +=score[i][j];
			System.out.printf(%5d,score[i][j]);
		}
		aver = total /(float)score[i].length; 
		System.out.printf("%5d %5.1f",total,aver);
	}
	System.out.printf("총점 : %5d %5d %5d",krTotal,engTotal,mathTotal);
		*/
		
		
		

		/*   1. 점수 2차원 배열로 선언해준다.
		 *   2. 과목별 총점을 선언해준다. (3과목)
		 *   3. 번호,국어,영어,수학,총점,평균 순으로 출력식을 적어주고
		 *   4. for문 작성
		 *   5. 개인별 총점, 평균 식을 작성
		 *   6. 과목 총점 연산식 작성
		 *   7. 번호를 나타내줄 출력식 작성
		 *   8. for문2 안에 총점연산식
		 *   9. for문2 안에 총점 출력식(5칸뛰기)
		 *   10. for2문 바깥에 평균계산식
		 *   11. for2문 바깥에 출력식 총점(int)하고 평균(float) 출력식,정수형은 5칸, float형은 5칸뛰고1자리에서반올림,줄바꿈
		 *   12. for1문 바깥에다 각 과목 총점 출력식 작성
		 *   
		 */
		/*
		
		for(int j=0;j<score[i];j++) {
			total += score[i][j];
			System.out.println("%5d",total[i][j]);
		}
		
		aver = total/(float)score[i].length;
		System.out.println("%5d %5.1f\n",total,aver);
		
	}
	System.out.println("총점 : %5d %5d %5d",krTotal,engTotal,mathTotal);
		
		*/
		
		

		/*   1. 점수 2차원 배열로 선언해준다.
		 *   2. 과목별 총점을 선언해준다. (3과목)
		 *   3. 번호,국어,영어,수학,총점,평균 순으로 출력식을 적어주고
		 *   4. for문 작성
		 *   5. 개인별 총점, 평균 식을 작성
		 *   6. 과목 총점 연산식 작성
		 *   7. 번호를 나타내줄 출력식 작성
		 *   8. for문2 안에 총점연산식
		 *   9. for문2 안에 총점 출력식(5칸뛰기)
		 *   10. for2문 바깥에 평균계산식
		 *   11. for2문 바깥에 출력식 총점(int)하고 평균(float) 출력식,정수형은 5칸, float형은 5칸뛰고1자리에서반올림,줄바꿈
		 *   12. for1문 바깥에다 각 과목 총점 출력식 작성
		 *   
		 */
		/*
		for(int j=0;j<score[i].length;i++) {
			total += score[i][j];
			System.out.println("%5d",score[i][j]);
		}
		aver = total /(float)score[i].length
				System.out.println("%5d%5.1f\n",total,aver);
	}
	System.out.println("%5d%5d%5d",krtotal,engtotal,mathtotal);	
		
		*/
		
		
		
		/*   1. 점수 2차원 배열로 선언해준다.
		 *   2. 과목별 총점을 선언해준다. (3과목)
		 *   3. 번호,국어,영어,수학,총점,평균 순으로 출력식을 적어주고
		 *   4. for문 작성
		 *   5. 개인별 총점, 평균 식을 작성
		 *   6. 과목 총점 연산식 작성
		 *   7. 번호를 나타내줄 출력식 작성
		 *   8. for문2 안에 총점연산식
		 *   9. for문2 안에 총점 출력식(5칸뛰기)
		 *   10. for2문 바깥에 평균계산식
		 *   11. for2문 바깥에 출력식 총점(int)하고 평균(float) 출력식,정수형은 5칸, float형은 5칸뛰고1자리에서반올림,줄바꿈
		 *   12. for1문 바깥에다 각 과목 총점 출력식 작성
		 *   
		 */
		
		/*
		for(int j=0;j<score[i].length;i++) {
			total +=score[i][j];
			System.out.printf("%5d",score[i][j]);
		}
		aver = total/(float)score[i].length
			System.out.printf("%5d%5.1f\n", total, aver);
	}
	System.out.printf("%5d%5d%5d", krTotal, engTotal,mathTotal);
		*/
		
		
		/*   1. 점수 2차원 배열로 선언해준다.
		 *   2. 과목별 총점을 선언해준다. (3과목)
		 *   3. 번호,국어,영어,수학,총점,평균 순으로 출력식을 적어주고
		 *   4. for문 작성
		 *   5. 개인별 총점, 평균 식을 작성
		 *   6. 과목 총점 연산식 작성
		 *   7. 번호를 나타내줄 출력식 작성
		 *   8. for문2 안에 총점연산식
		 *   9. for문2 안에 점수 출력식(5칸뛰기)
		 *   10. for2문 바깥에 평균계산식
		 *   11. for2문 바깥에 출력식 총점(int)하고 평균(float) 출력식,정수형은 5칸, float형은 5칸뛰고1자리에서반올림,줄바꿈
		 *   12. for1문 바깥에다 각 과목 총점 출력식 작성
		 *   
		 */
		/*
		for(int j=0,score[i].length;j++) {
			total += score[i][j];
			System.out.printf("%5d",score[i][j]);
		}
		aver = total /(float) score[i].length;
		System.out.printf("%5d%5.1f\n",total,aver);
	}
	System.out.printf("%5d%5d%5d",krtotal,engtotal,mathtotal);
		*/
		
		

		/*   1. 점수 2차원 배열로 선언해준다.
		 *   2. 과목별 총점을 선언해준다. (3과목)
		 *   3. 번호,국어,영어,수학,총점,평균 순으로 출력식을 적어주고
		 *   4. for문 작성
		 *   5. 개인별 총점, 평균 식을 작성
		 *   6. 과목 총점 연산식 작성
		 *   7. 번호를 나타내줄 출력식 작성
		 *   8. for문2 안에 총점연산식
		 *   9. for문2 안에 점수 출력식(5칸뛰기)
		 *   10. for2문 바깥에 평균계산식
		 *   11. for2문 바깥에 출력식 총점(int)하고 평균(float) 출력식,정수형은 5칸, float형은 5칸뛰고1자리에서반올림,줄바꿈
		 *   12. for1문 바깥에다 각 과목 총점 출력식 작성
		 *   
		 */
		/*
		
		int[][] score = {
				{100, 100, 100},
				{90, 90, 90},
				{80, 80, 80},
				{70, 70, 70}
		};
		
		int krTotal =0; int engTotal=0; int mathTotal=0;
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("-------------------------------");
		
		for(int i=0;i<score.length;i++) {
			int sum =0;
			float aver =0;
			krTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d",i+1);
			
			for(int j=0;j<score[i].length;j++) {
				sum += score[i][j];
				System.out.printf("%5d",score[i][j]);
			}
			aver = sum /(float) score[i].length;
			System.out.printf("%5d%8.1f\n",sum,aver);
		}
		System.out.printf("%5d%5d%5d",krTotal,engTotal,mathTotal);
		
		*/
		
		/*   1. 점수 2차원 배열로 선언해준다.
		 *   2. 과목별 총점을 선언해준다. (3과목)
		 *   3. 번호,국어,영어,수학,총점,평균 순으로 출력식을 적어주고
		 *   4. for문 작성
		 *   5. 개인별 총점, 평균 식을 작성
		 *   6. 과목 총점 연산식 작성
		 *   7. 번호를 나타내줄 출력식 작성
		 *   8. for문2 안에 총점연산식
		 *   9. for문2 안에 점수 출력식(5칸뛰기)
		 *   10. for2문 바깥에 평균계산식
		 *   11. for2문 바깥에 출력식 총점(int)하고 평균(float) 출력식,정수형은 5칸, float형은 5칸뛰고1자리에서반올림,줄바꿈
		 *   12. for1문 바깥에다 각 과목 총점 출력식 작성
		 *   
		 */
		
		int[][] score = {
				{100, 100, 100},
				{90, 90, 90},
				{80, 80, 80},
				{70, 70, 70}
		};
		
		int krTotal=0; int engTotal=0; int mathTotal=0;
		
		System.out.println("번호, 국어, 영어, 수학, 총점, 평균");
		System.out.println("-------------------------------");
		
		for(int i=0;i<score.length;i++) {
			int total =0;
			float aver =0;
			System.out.printf("%5d",i+1);
			
			for(int j=0;j<score[i].length;j++) {
				total += score[i][j];
				System.out.printf("%5d" , score[i][j]);
				
			}
			aver = total /(float)score[i].length;
			System.out.printf("%5d%7.1f\n" , total,aver);
		}
		System.out.printf("%5d%5d%5d",krTotal,engTotal,mathTotal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 int[][] score = {
		  { 100, 100, 100}
			, { 20, 20, 20}
			, { 30, 30, 30}
			, { 40, 40, 40}
			, { 50, 50, 50}
		};
// 과목별 총점
  int korTotal = 0, engTotal = 0, mathTotal = 0;

   System.out.println("번호  국어  영어  수학  총점  평균 ");
  System.out.println("=============================");

for(int i=0;i < score.length;i++) {
int  sum = 0;      // 개인별 총점
float avg = 0.0f;  // 개인별 평균

korTotal  += score[i][0];
engTotal  += score[i][1];
mathTotal += score[i][2];
System.out.printf("%3d", i+1); //%d 정수형 -->사이에 숫자들어가면 칸이 띄어진다.

for(int j=0;j < score[i].length;j++) {
sum += score[i][j]; 
System.out.printf("%5d", score[i][j]);
}

avg = sum/(float)score[i].length;  // 평균계산
System.out.printf("%5d %5.1f%n", sum, avg);
}

System.out.println("=============================");
System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);
*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
