
public class Javagit_test {

	public static void main(String[] args) {

		System.out.println("Hellow World2");
		
		System.out.println("한글깨짐 확인중, 다시올리는것은 끄고 저장후 다시 키기");
		
		
		 //bitwise 연산 (약함)
		 // ~, &, |, ^, >>, <<, >>>
		 // ~ : 음수와 양수의 변환이 필요할 때 사용
//		 ~(100) : -101 : 100 (음수로 변환할때 -1, 절대값 후 양수로 변환할떄 -1)
		 int a = 100;
		 int b = ~(a);
		 System.out.println(b); //-101
		 
		 int c3 = ~(b);
		 System.out.println(c3); //100
		 
		 // & : 단항 연산자, bitand | && : and, 이항연산자.... (and는 참일때만 참(1)이고 나머지는 다 거짓(0) )
		 int d2 = 8;  // 00001000
		 int z2 = 12; //&00001100
		 			 //      11   
		 int summ2 = d2 | z2;
		 System.out.println(summ2);//12
		 
		 int d3 = 8;  // 00001000
		 int z3 = 12; //&00001100
		 			  //  00000100
		 int summ3 = d3 ^ z3;
		 System.out.println(summ3);//4  
		 
//              이동할값 	  비트수	 (공식 값에 X 2) 
		 int d4 = 23   <<  3; // << : 23 X 2 = 46 X 2 = 92 X 2 = 184
		 
//		 23   <<  3
//		 00010111
//		 00101110 => 46   
//		 01011100 => 92
//		 10111000 => 184
		 
		 System.out.println(d4);
		 
//		 (공식 값에 나누기 2 0.5는 버림) 
		 int d5 = 23   >>  3;
//		 23   >>  3
//		 00010111
//		 00001011 => 3 + 8 = 11   
//		 00000101 => 5
//		 00000010 => 2
		 
		 System.out.println(d5);
		 
//		 삼항 연산자 = 조건 연산자 | 코딩이 간결, 가독성이 좋습니다. 
//		 ? = (조건식) ? 참 : 거짓;
		 
		 int a2 = 25, b2 = 12;
		 
//		             25 > 12    참일때   거짓일때
		 int summm = (a > b )?  a+b   : a*b;
		 System.out.println(summm); //37
		 
		 int summmm = (((100 * 2) / 3) % 5);
		 System.out.println(summmm); //1
		 
		 int a1 = 100*2;
		 int a3 = a1 / 3;
		 int a4 = a3 % 5;
		 System.out.println(a4); //1
		 
		 // a5 = b5 =  c5 = 5;
		 int a5 = 5;
		 int b5 = 5;
		 int c5 = 5;
		 
		 //단항 연산자 : +, -
		 int i1 = 100;
		 int i2 = -100;
		 
		 double d1 = 13.14;
		 double d6 = -10.5;
		 // 정수형 : 1 , 2 ,3 , 4 , 5 .....................
//		 실수형은 오차가 발생한다. (실수형은 오차가 셀수없이 많다.)
//		 1.0 , 1.1 , 1.2 , 1.3 , 1.4 .............2.0
//		 1.00
//		 1.000
//		 1.0000              1.0  ~  10.0  : 난수발생, 로또복권 : 6자리 1 ~ 45
//		 ..............
		 
		 
		 double ddd = d1 + d6;
		 System.out.println(ddd); //음수값으로 나온다
		 
		 int xx = -100;
		 int result1 = +xx; // -100
		 int result2 = -xx; // +100
		 System.out.println(result1);
		 System.out.println(result2);
		 
		 // 증감연산자 : ++, --, 대입(변수)후 연산, 연산(++)후 대입
//		 A++ , ++A, A--, --A
//		 int sum = a++ + --b;
//		 int a = 100;
//		 int sum = a++;
		 
		 int a7 = 100;
		 a7++;
		 System.out.println(a7); //101
		 
		 int b7 = 345;
		 int sun = b7--; 
		 System.out.println(sun); //345
		 System.out.println(b7); //344

	}

}
