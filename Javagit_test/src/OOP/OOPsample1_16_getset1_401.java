package OOP;


import java.util.Arrays;

import java.util.Scanner;



/*   

*  문제> 제품번호(code), 제품이름(name), 제품색상(color), 제품수량(su), 제품가격(price)이 존재합니다.

*  setter()라는 메소드를 이용하여 데이터를 저장하고

*  getter()라는 메소드를 이용하여 데이터를 출력하세요.

*  --------------------------------------------

*   제품번호(code) :

* 	 제품이름(name) : 

*   제품색상(color) :

*   제품수량(su) :

* 	 제품가격(price) :

*  --------------------------------------------

*  제품 판매액 :  원

*  --------------------------------------------  

*/

/*  1. 파일 이름을 이용해서 객체를 만든다.
*  2. 객체 위에 입력받는 값을 만든다.
*  3. 객체 변수명. ~~호출명을 정해준다.
*  4. 호출명 괄호()안에 전달인자값을 넣어준다.
*  5. 생성자를 만든다.
*  6. 각 생성자 안에 this.전달인자값을 만들어준다.
*  7. 출력해본다.

*   

* 

*/
public class OOPsample1_16_getset1_401 {

	  private String code;  //null ==>

	  private String name;  //null ==>

	  private String color; //null ==>

	  private int surang;  //0 ==>

	  private int price;   //0 ==>

	  private int productSum;  //0 ==>

 

	  private static OOPsample1_16_getset1_401 oop16_gs = new OOPsample1_16_getset1_401();

	

	

   public String getCode() {

		return code;

	}

 

	public void setCode(String code) {

		this.code = code;

	}

 

	public String getName() {

		return name;

	}


	public void setName(String name) {

		this.name = name;

	}

 

	public String getColor() {

		return color;

	}

 
 

	public void setColor(String color) {

		this.color = color;

	}

 


	public int getSurang() {

		return surang;

	}

 

	public void setSurang(int surang) {

		this.surang = surang;

	}


	public int getPrice() {

		return price;

	}

 
	public void setPrice(int price) {

		this.price = price;

	}

	
	private void ProductOperation() {

	productSum = surang * price;	

}

	
	

	private void ProductResult() { //getter

		

		

	  System.out.println("--------------------------------------------");

      System.out.println("제품번호(code) : " + oop16_gs.getCode());

      System.out.println("제품이름(name) : " + oop16_gs.getName());

      System.out.println("제품색상(color) : " + oop16_gs.getColor());

      System.out.println("제품수량(su) : " + oop16_gs.getSurang());

      System.out.println("제품가격(price) : "+ oop16_gs.getPrice());

      System.out.println("--------------------------------------------");

      System.out.println("제품 판매액 : " + productSum +" 원");

      System.out.println("--------------------------------------------");

     

     

     

   }

	

	

	

	

public static void main(String[] args) {

	

	

           Scanner sc = new Scanner(System.in);

           

	   System.out.println("제품번호(code)를 입력해 주세요.");

       String code = sc.next(); 

       System.out.println("제품이름(name)를 입력해 주세요.");

       String name = sc.next(); 

       System.out.println("제품색상(color)를 입력해 주세요.");

       String color = sc.next(); 

       System.out.println("제품수량(su)를 입력해 주세요.");

       int surang = sc.nextInt(); 

       System.out.println("제품가격(price)를 입력해 주세요.");

       int price = sc.nextInt(); 

	

       

       

	   //DataInput(setter) (입력)

       oop16_gs.setCode(code); //(전달인자값)

       oop16_gs.setName(name);

       oop16_gs.setColor(color);

       oop16_gs.setSurang(surang);

       oop16_gs.setPrice(price);

       

//       DataProcessing (연산)

       oop16_gs.ProductOperation();

       

	   

//	   DataOutput (출력)

       oop16_gs.ProductResult();

    


			}// main method end

 

 

 

 

 

 

} // class end
