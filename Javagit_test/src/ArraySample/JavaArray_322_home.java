package ArraySample;

import java.util.Scanner;

public class JavaArray_322_home {

	public static void main(String[] args) {
//   문제> 번호    , 이름     , 자바   ,     JSP    , Spring,   총점   ,     평균     구하여 출력하세요. (4번 반복하기)
//		  int      String   double    double    double    double     double 
		/* 배열
		 * 타입 [] 배열이름 = new 타입[인덱스값] 이런 식으로 나타내준다.
		 * 만약에 int bunho = new int[3]이면 0번지부터 2번지까지 지정된다.
		 * 각각 번지마다 데이터를 줄 수 있다.
		 * 배열의 길이 = 배열이름.length ==> 이 방법을 사용하면 for문같은 방식 사용시 인덱스 값을 혼동 할 일이 없다.
		 * 배열의 길이 값은 인덱스 값과 같다.
		 * 스캐너 사용시 타입[] 배열이름 = new 타입[인덱스값];으로 해도된다.
		 * 스캐너 사용시 인덱스 값은 for문 초기값을 사용한다.
		 * 스캐너 사용시 타입[] 배열이름 = new 타입[인덱스값];은 for문 바깥에 둔다.
		 * 출력식 적을때 배열이름[인덱스값] 잘 살펴보기.
		 * 총점과 평균식은 for문 안에 적기
		 * 세로로 출력하려면 for문 사이에 번호 이름 점수등의 텍스트를 적는다.
		 * 세로로 출력시 점수값들은 마지막 for문에다 적는다.
		 */
		/*
		Scanner sc = new Scanner(System.in);
		String[] name = new String[1];
		int[] bunho = new int[1];
		double[] java = new double[1];
		double[] JSP = new double[1];
		double[] Spring = new double[1];
		double[] total = new double[1];
		double[] aver = new double[1];
		
		for(int i =0;i<bunho.length;i++) {
		System.out.println("번호를 입력해주세요.");
			bunho[i] = sc.nextInt();
			System.out.println("이름을 입력해주세요.");
			name[i] = sc.next();
			System.out.println("점수를 입력해주세요.");
			   java[i] = sc.nextDouble();
			   System.out.println("점수를 입력해주세요.");
				JSP[i] = sc.nextDouble();
				System.out.println("Spring 점수를 입력해주세요.");
				Spring[i] = sc.nextDouble();
			total[i] = java[i] + JSP[i] + Spring[i];
			aver[i] = total[i] / 3.0;
		}
		
		System.out.println("===================================성 적 처 리==============================================");
		System.out.println("번호"+ "\t" +"이름" +"\t" + "java점수" +"\t"+"JSP점수"+"\t" +"Spring점수 "+" 총점"+"\t"+"\t" +"  평균");
		System.out.println("------------------------------------------------------------------------------------------");
		for(int i =0;i<bunho.length;i++) {
			System.out.println( bunho[i] +"\t" +  name[i]+"\t" + java[i]+"\t" + JSP[i]+ "\t" +" " +  Spring[i]+ "\t" + " "+ total[i]+"  \t" + aver[i]);
			
		}
		*/
		
	//   문제> 번호    , 이름     , 자바   ,     JSP    , Spring,   총점   ,     평균     구하여 출력하세요. (4번 반복하기)	
		/*
		Scanner sc = new Scanner(System.in);
		 int[] bunho = new int[2];
		 String[] name = new String[2];
		 double[] java = new double[2];
		 double[] JSP = new double[2];
		 double[] Spring=new double[2];
		 double[] total = new double[2];
			double[] aver = new double[2];
			
			for(int i =0;i<bunho.length;i++) {
				System.out.println("번호를 입력해주세요.");
				bunho[i] = sc.nextInt();
				System.out.println("이름을 입력해주세요.");
				name[i] = sc.next();
				System.out.println("점수를 입력해주세요.");
				java[i] = sc.nextDouble();
				System.out.println("점수를 입력해주세요.");
				JSP[i] = sc.nextDouble();
				System.out.println("점수를 입력해주세요.");
				Spring[i] = sc.nextDouble();
				total[i] = java[i] + JSP[i] +Spring[i];
				aver[i] = total[i] / 3.0;
			}
			for(int i =0;i<bunho.length;i++) {
				System.out.println("번호는 : " + bunho[i]);
				System.out.println("이름은 : " + name[i]);
				System.out.println("자바 점수는 :" + java[i]);
				System.out.println("JSP점수는 : "+JSP[i]);
				System.out.println("Spring 점수는 : " + Spring[i]);
				System.out.println("총점은 : " + total[i]);
				System.out.println("평균은 : " + aver[i]);
			}
			*/
	//   문제> 번호    , 이름     , 자바   ,     JSP    , Spring,   총점   ,     평균     구하여 출력하세요. (4번 반복하기)	
		Scanner sc = new Scanner(System.in);
		int[] bunho = new int[2];
		String[] name = new String[2];
		double[] java = new double[2];
		double[] jsp = new double[2];
		double[] spring = new double[2];
		double[] total = new double[2];
		double[] aver = new double[2];
		
		for(int i=0;i<bunho.length;i++) {
			System.out.println("번호를 입력해주세요.");
			bunho[i] = sc.nextInt();
			System.out.println("이름을 입력해주세요.");
			name[i] = sc.next();
			System.out.println("점수를 입력해주세요.");
			java[i] = sc.nextDouble();
			System.out.println("점수를 입력해주세요.");
			jsp[i] = sc.nextDouble();
			System.out.println("점수를 입력해주세요.");
			spring[i] = sc.nextDouble();
			total[i] = java[i] + jsp[i] +spring[i];
			aver[i] = total[i] / 3.0;
			
		}
		
		
		for(int i=0;i<bunho.length;i++) {
			System.out.println("번호는 : " + bunho[i]);
			System.out.println("이름은 : " + name[i]);
			System.out.println("자바점수는 : " + java[i]);
			System.out.println("jsp점수는 : " + jsp[i]);
			System.out.println("spring점수는 : " + spring[i]);
			System.out.println("총점은 : " + total[i]);
			System.out.println("평균은 : " + aver[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
			
			
	}

}
