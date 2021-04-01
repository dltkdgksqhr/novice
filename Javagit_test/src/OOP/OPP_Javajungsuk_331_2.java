package OOP;

public class OPP_Javajungsuk_331_2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();  // Tv t1; t1 =new Tv();를 한문장으로 가능
		Tv t2 = new Tv();
		System.out.println("t1 채널의 값은 " + t1.channel + "입니다.");
		System.out.println("t2 채널의 값은 " + t2.channel + "입니다.");
		
		t1.channel =7;  // channel 값을 7으로한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1 채널의 값은 " + t1.channel + "입니다.");
		System.out.println("t2 채널의 값은 " + t2.channel + "입니다.");
		
		/*   연습문제
		 *  2-1 문자형 2byte char
		 *      정수형 1byte byte 2byte short 4byte int
		 *      실수형 4byte float 8byte double
		 *      
		 *   2-2
		 *   float regNo = 9107301199611f;
		 *   
		 *   2-3
		 *   
		 *   -리터럴 : 100, 3.14f, 100L
		 *   -변수  : i, pi
		 *   -키워드 : final 
		 *   -상수 : int, long, float
		 *   
		 *   2-4 d
		 *   
		 *   2-5 '1'+2 오류
		 *   
		 */
		
		
		
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('A'+ 'B');
		System.out.println('1' + 2);
		
		
		
		
		
		
		
	}
}