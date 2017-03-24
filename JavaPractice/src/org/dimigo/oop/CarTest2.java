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
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car2 car1 = new Car2("현대자동차","제네시스","검정색",225,50000000);
		Car2 car2 = new Car2("기아자동차","K7","흰색",246,40000000);
		Car2 car3 = new Car2("삼성자동차","SM7","회색",200,380000000);
		
		System.out.println("<< 자동차 목록 >>");
		car1.information(car1);
		System.out.print('\n');
		car2.information(car2);
		System.out.print('\n'); 
		car3.information(car3);

	}

}
