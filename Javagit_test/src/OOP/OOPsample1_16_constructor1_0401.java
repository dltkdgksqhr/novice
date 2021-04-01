package OOP;
import java.util.Scanner;







/*

 *  문제> 생성자 메소드 :클래스에서 전송한 데이터를 수신하기 위하여 사용합니다.

 *  - 생성자는 상속을 허용하지 않습니다.

 *  - 생성자는 클래스 이름과 반드시 같아야합니다. (= 파일 이름과 같습니다.)

 *  - 접근제한자는 public이거나 생략 가능합니다. 

 *  - 일반적인 메소드와는 달리 반환타입이 없습니다. 그러므로  retrun문이 없습니다.

 *  - 생성자메소드는 오버로딩이 가능합니다.

 *  - 프로그래머가 생성자 메소드를 작성하지 않으면 JVM이 자동으로 만들어 줍니다.

 *  - 생성자 메소드가 하나라도 없으면 그때 만들어 줍니다.

 *  - 디폴트 생성자 : public class이름() {...............} 

 *  - 클래스에서 전달되는 값을 클래스 변수에 초기화 시킬 목적으로 주로 사용됩니다.

 *  

 */
public class OOPsample1_16_constructor1_0401 {

//    생성자 오버로딩

	public OOPsample1_16_constructor1_0401(int su1, int su2, int su3) {

		System.out.println("합계 : " + (su1+su2+su3));

	}





//    생성자 오버로딩

	public OOPsample1_16_constructor1_0401(String str1, String str2) {

		System.out.println("문자열의 연결 : " + (str1 + str2));

	}





//    생성자 오버로딩

	public OOPsample1_16_constructor1_0401(String str3, int su4) {

		int x = Integer.parseInt(str3);

		int sum = x + su4;

		System.out.println("문자열 숫자 + 숫자 : " + sum);

	}







	

	public static void main(String[] args) {

		

		 Scanner sc = new Scanner(System.in);

		System.out.println("정수형 숫자 3개를 입력해주세요.");

		int su1 = sc.nextInt();

		int su2 = sc.nextInt();

		int su3 = sc.nextInt();

		

		OOPsample1_16_constructor1_0401 oop16_1 = new OOPsample1_16_constructor1_0401(su1, su2, su3);

		

		



		System.out.println("문자열 2개를 입력해주세요.");

		String str1 = sc.next();  // 

		String str2 = sc.next();  // 

		

		OOPsample1_16_constructor1_0401 oop16_2 = new OOPsample1_16_constructor1_0401(str1,str2);

		

		System.out.println("문자열 2개를 입력(10, 0, 0x)해주세요.");

		String str3 = sc.next();  // 10진수, 8진수, 16진수 값으로 입력

		int su4 = sc.nextInt();  // 

		OOPsample1_16_constructor1_0401 oop16_3 = new OOPsample1_16_constructor1_0401(str3,su4);

		





		



	



		

		



}



}