import java.util.Scanner;

public class Javatest2_317 {

	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	for(int i2=0;i2<3;i2++) {
//		
//	int i = sc.nextInt();
//	int j = sc.nextInt();
//	
//	if(i%2 ==0 || j%3==0) {
//		
//		System.out.println("True");
//	}else
//	{
//		
//		System.out.println("False");
//		
//	}
//	}

//	for문을 while문으로 변환시키기
	
//	Scanner sc = new Scanner(System.in);
//	int i2=0;
//	while(i2<3) {
//		
//	int i = sc.nextInt();
//	int j = sc.nextInt();
//	
//	
//	if(i%2 ==0 || j%3==0) {
//		
//		System.out.println("True");
//	}else
//	{
//		
//		System.out.println("False");
//		
//	}
//	i2++;
//	}

//	10진수를 2진수,8진수,16진수로 변환시키기 4번 반복
		
	int i =127;
	
	String i2 = Integer.toBinaryString(i); //2진수
	String i3 = Integer.toOctalString(i); //2진수
	String i4 = Integer.toHexString(i); //2진수
	
	System.out.println("2진수 :" + i2);
	System.out.println("8진수 :" + i3);
	System.out.println("16진수 :" + i4);
	
	int binaryToDecimal = Integer.parseInt(i2, 2);
	int binaryToOctal = Integer.parseInt(i3, 8);
	int binaryToHex = Integer.parseInt(i4, 16);
	
	System.out.println(binaryToDecimal);
	System.out.println(binaryToOctal);
	System.out.println(binaryToHex);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
