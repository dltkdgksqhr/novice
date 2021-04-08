package OOP;
import java.util.Scanner;



/* interface? 객체의 사용 방법을 정의한 타입

 * - 개발코드와 객체의 통신접점 역할

 * - 여러개의 객체를 사용하므로써 코드변경없이 실행 내용과 리턴값을 다양화 할 수 있는 장점이있다.

 *

 */

 

interface sungjuk {

//	 상수

	String name = "홍길동";

	public static final int java = 100; 

	public int Max_Volume = 50;

	public int Min_Volume = 0;

	

 

	

//	추상 메소드

	void sungjukMethod(int java, int jsp, int spring);

	void adderMethod();

	

//	디폴트 메소드

	default int methodValue(int value1,int value2) {

		int sum = value1 + value2;

		return sum;

		

	}

	

//	정적 메소드

	static double methodValue2(double value1) {

		return value1;

		

	}

	

	

	

}

public class InheritanceSample_8chapter1 implements sungjuk {

	

	@Override

	public void sungjukMethod(int java, int jsp, int spring) {

		int sum = java + jsp + spring;

		double average = sum / 3.0;

		System.out.println("총점 : " + sum);

		System.out.println("평균 : " +average);

		

		

	}

 

	@Override

	public void adderMethod() {

		Scanner sc = new Scanner(System.in);

		System.out.println("html, css, javascript 과목의 점수를 입력해주세요.");

		int html = sc.nextInt();

		int css = sc.nextInt();

		int javascript = sc.nextInt();

		

		int sum = html + css + javascript;

		double average = sum / 3.0;

		System.out.println("총점 : " + sum);

		System.out.println("평균 : " +average);

		

	}
	public static void main(String[] args) {
	InheritanceSample_8chapter1 is8 = new InheritanceSample_8chapter1();

		

		Scanner sc = new Scanner(System.in);

		System.out.println("3과목의 점수를 입력해주세요.");

		int java = sc.nextInt();

		int jsp = sc.nextInt();

		int spring = sc.nextInt();

 

		is8.sungjukMethod(java, jsp, spring);

		System.out.println("-------------------------");

		is8.adderMethod();

	}

 

 

	

	

}