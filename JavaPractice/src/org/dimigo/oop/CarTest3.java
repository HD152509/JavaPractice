/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_CarTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : duddn
 * @version : 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car3 car1 = new Car3("현대자동차","제네시스","검정색",225,50000000);
		Car3 car2 = new Car3("기아자동차","K7","흰색",246);
		Car3 car3 = new Car3("삼성자동차","SM7","회색");
		
		System.out.println("<< 자동차 목록 >>");
		car1.information(car1);
		System.out.print('\n');
		car2.information(car2);
		System.out.print('\n'); 
		car3.information(car3);

	}

}
