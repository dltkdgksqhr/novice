package JavaSample;

public class JavaMathod_319_house {
	
	public String say() {
		return "Hi";
		
	}
		
	public static void main(String[] args) {
		
//		메서드의 호출 (남궁석의 정석코딩)
	/*
		MyMath mm = new MyMath();
		long result1 = mm.add(5L,3L);  //add메서드 호출 
		long result2 = mm.subtract(5L,3L);
		long result3 = mm.multiply(5L,3L);
		double result4 = mm.divide(5L,3L);
		mm.printGugudan(12); //구구단 3단 출력
			
		System.out.println("add(5L, 3L) = " + result1 );
		System.out.println("subtract(5L, 3L) = " + result2 );
		System.out.println("multiply(5L, 3L) = " + result3 );
		System.out.println("divide(5L, 3L) = " + result4 );
		
		
		
		

	}

}

class MyMath {
	void printGugudan(int dan) {
		if(!(2 <= dan && dan <= 9))
			return; // 입력받은 단이 2~9가 아니면, 메서드 종료하고 돌아가기
		
		for(int i =1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
		
	}
	
	long add(long a, long b) {
		
		long result = a + b;
		return result;
//		retrun a + b; 위의 두줄을 이와같이 한줄로 간단히 할 수 있다.
		
		
		}
		long max(long a, long b) {
			if(a>b)
				return a; //에러나는이유 조건식이 참일때만 실행 
			else
				return b;//에러 안나게하려면 <<== 이줄 삽입해야함
		}
		
		long subtract(long a, long b) { return a - b;}
		long multiply(long a, long b) { return a * b;}
		double divide(double a, double b) {
			return a / b;
		}
		*/
//	점프투 자바 	
//	           반환형(출력)     전달인자(입력)
//	     * -----------------------------
//	     *  1.    O           O
//	     * 	2.    O           X
//	     *  3.    X           O
//	     *  4.    X           X
//	     * -----------------------------
/*
	int a = 3;
	int b = 4;
	
	JavaMathod_319_house myTest = new JavaMathod_319_house();
	int c = myTest.sum(a,b);
	
	System.out.println(c);
	
		*/
		JavaMathod_319_house myTest = new JavaMathod_319_house();
		String a = myTest.say();
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
