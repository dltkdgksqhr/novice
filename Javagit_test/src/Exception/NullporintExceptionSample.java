package Exception;
import java.util.Scanner;



/* Exception? 돌발상황, 예기치 못한 상황(상태)

 *  -예외 처리는 반드시 개발자가 해야합니다.

 *  -사전에 돌발상황을 시연하여 체크하고, 코딩을 합니다.

 * 

 *  NullporintException : 변수에 데이터가 null값일 때 발생합니다.

 * 

 */
public class NullporintExceptionSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String data[] = new String[3];

		

		try {

		System.out.println("문자열을 입력해주세요.");

		for(int i=0; i<data.length;i++) {

			data[i] = sc.next();

		}

		

//		String data = "Hello" // null

		

		for(int i=0; i<data.length;i++) {

			System.out.println(data[i]);

		}

		

		System.out.println(data.toString());

		}catch(NullPointerException e) {

			System.out.println("data 변수에 데이터를 입력해 주세요.");

		}

		

      

	}

 

}