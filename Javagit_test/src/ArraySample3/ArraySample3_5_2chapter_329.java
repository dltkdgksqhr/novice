package ArraySample3;

public class ArraySample3_5_2chapter_329 {

	public static void main(String[] args) {
		int[][] scores = new int[3][1];

		

		 int s = scores.length;

		

		 System.out.println("scores[]의 길이: " + s);

		 System.out.println("scores[0] = " + scores[0].length); //열값

		 System.out.println("scores[1] = " + scores[1].length);

		 System.out.println("scores[2] = " + scores[2].length);

		 

		 System.out.println();

		 

		 int[][] scores2 = new int[3][];

			

		 int s2 = scores2.length;

		

		 System.out.println("scores2[]의 길이: " + s2); //2

		 

		 scores2[0] = new int[2];

		 

		 System.out.println("scores2[0] = " + scores2[0].length);

		 

		 scores2[1] = new int[3];

		 System.out.println("scores2[1] = " + scores2[1].length);

		 

		 scores2[2] = new int[7];

		 System.out.println("scores2[2] = " + scores2[2].length);//7

		 

		 

		 int sum =0;

		 

		 int[][] scores3 = { {95,80,77}, 

				             {92,96,100},

		                     {100,99,88}};  //3행 3열

		 

//		 [0][0] = 95,  [0][1] = 80, [0][2] = 77

//		 [1][0] = 92,  [1][1] = 96, [1][2] = 100

//		 [2][0] = 100, [2][1] = 99, [2][2] = 98

		 

		 

		 for(int i=0;i<scores3.length;i++) { //3행

			 

			 for(int j=0; j<scores3[i].length;j++) { //3열

				 sum += scores3[i][j];  

				 System.out.println(scores3[i][j]);

				 

			 }

		 }

		 

		 System.out.println(sum); // 827

		 

		 // gigo : garbage in garbage out | trash in trash out 

		 

		 

		 
	}

}
