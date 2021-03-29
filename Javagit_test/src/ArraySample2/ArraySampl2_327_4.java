package ArraySample2;
import java.util.Scanner;



/*  배열 처리 : int[][] num =new int[4][4];  
 *  2 2 2 20
 *  2 2 15 1
 *  2 10 1 1
 *  5 1 1 1
 * 
 *  특징: i+j 값이 3이면 5의배수로 설정하고 4이상이면 1로 그외는 2 , 아니면 2로 설정
 * 
 *   [0][0] [0][1] [0][2] [0][3]
 *   [1][0] [1][1] [1][2] [1][3]
 *   [2][0] [2][1] [2][2] [2][3]
 *   [3][0] [3][1] [3][2] [3][3]
 * 
 * 
 */

 
public class ArraySampl2_327_4 {

	public static void main(String[] args) {
		/*

		int[][] num = new int[][] {
			{2, 2, 2, 2},
			{2, 2, 2, 1},
			{2, 2, 1, 1},
			{2, 1, 1, 1}	
		

		};

		

		System.out.println(num[0][3]);

		*/

		

//		데이터 입력

		/*

		int[][] num = new int[4][4]; // [0][0] ~ [3][3]

		

		for(int i=0; i<num.length;i++) {  //row,0행(2단),1행(3단)

			

			for(int j=0; j< num.length;j++) {  // column,0열 ,1열 ,2열

				

				if(i==1 && j==2)
				num[i][j] = 15;
				else if(i==0 && j==3)
					num[i][j] = 20;
				else if(i==2 && j==1)
					num[i][j] = 10;
				else if(i==3 && j==0)
					num[i][j] = 5;
				else if(i+j>=4)
					num[i][j] = 1;
				else
					num[i][j] = 2;

		  }

			

		}

		
//		데이터 출력

            for(int i=0;i< num.length;i++) {  //row,	
			for(int j=0; j< num.length;j++) {  // column
				 
				System.out.print(num[i][j] + "  ");
			    }
			System.out.println();
            }

		*/

            

//		데이터 입력

		

		int[][] num = new int[4][4]; // [0][0] ~ [3][3]
		for(int i=0; i< num.length;i++) {  //row,0행(2단),1행(3단)
		for(int j=0; j< num.length;j++) {  // column,0열 ,1열 ,2열

				

				if(i+j==3)
			   num[i][j] = (4-i) * 5;
				else if(i+j<4)
					num[i][j] = 2;
				else
					num[i][j] = 1;

		  }

			

		}

	
		

//		데이터 출력

		
            for(int i=0;i< num.length;i++) {  //row,0행(2단),1행(3단)	
			for(int j=0; j< num.length;j++) {  // column,0열 ,1열 ,2열
				System.out.print(num[i][j] + "  ");
			    }
			System.out.println();
            }

		

		

	}

}
