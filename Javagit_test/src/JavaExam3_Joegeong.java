
public class JavaExam3_Joegeong {

	public static void main(String[] args) {
//		int i = 20;
//		i += 1;
//		System.out.println((100 < i) && (i < 200));

		String a = "man";
		int b = 0;
		
//		자바는 String을 비교할 때 equal()을 이용합니다.
//		그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문입니다.
		
//		if(a.equals("man"))
//		{
//			System.out.println("남자입니다.");
//		}
//		else
//		{
//			System.out.println("남자가 아닙니다.");
//		}
//		if(b == 3)
//		{
//			System.out.println("b는 3입니다.");
//		}
//		else
//		{
//			System.out.println("3이 아닙니다.");
//		}
//		
//		if(a.equalsIgnoreCase("men") && b == 0)
//		{
//			System.out.println("참입니다.");
//		}
//		else
//		{
//			System.out.println("거짓입니다.");
//		}
		
		int i = 1, sum = 0;
		while(i <= 1000) {
			sum += i++;
			
		}
		
		System.out.println("1부터 1000까지의 합은" + sum + "입니다.");
		
		
	}

}
