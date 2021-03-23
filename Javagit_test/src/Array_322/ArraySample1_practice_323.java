package Array_322;
import java.util.Scanner;
public class ArraySample1_practice_323 {

	public static void main(String[] args) {
		

			/*		문제> 번호    , 이름     , 자바,     JSP    , Spring,   총점,     평균     구하여 출력하세요.
			 *      int     Stiring   Double   Double   Double  Double   Double  (타입)
			 * 
			 */

					Scanner sc = new Scanner(System.in);
					int[] bunho = new int[2];
					String[] name = new String[2];
					double[] java = new double[2];
					double[] jsp = new double[2];
					double[] spring = new double[2];
					double[] total = new double[2];
					double[] aver = new double[2];

			 

					for(int i =0;i<bunho.length;i++) {
						System.out.println("번호를 입력해주세요.");
						bunho[i] = sc.nextInt();
						System.out.println("이름을 입력해주세요");
						name[i] = sc.next();
						System.out.println("자바의 점수를 입력해주세요");
						java[i] = sc.nextDouble();
						System.out.println("jsp의 점수를 입력해주세요");
						jsp[i] = sc.nextDouble();
						System.out.println("spring의 점수를 입력해주세요");
						spring[i] = sc.nextDouble();

						

						total[i] = java[i] + jsp[i] + spring[i];
					aver[i] = total[i] / 3.0;

						

					}

					for(int i =0;i<bunho.length;i++) {
						System.out.println("번호는 : " + bunho[i]);
						System.out.println("이름은 : " + name[i]);
						System.out.println("자바 점수는 : " + java[i]);
						System.out.println("jsp 점수는 : " + jsp[i]);
						System.out.println("spring의 점수는 : " + spring[i]);
						System.out.println("총점은 : " +   total[i]);
						System.out.println("평균은 : " + aver[i]);

						

					}

	}

}
