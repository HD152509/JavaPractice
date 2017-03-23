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
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.setCompany("현대자동차");
		car1.setModel("제네시스");
		car1.setColor("검정색");
		car1.setMaxSpeed(225);
		car1.setPrice(50000000);
		
		car2.setCompany("기아자동차");
		car2.setModel("K7");
		car2.setColor("흰색");
		car2.setMaxSpeed(246);
		car2.setPrice(40000000);
		
		car3.setCompany("삼성자동차");
		car3.setModel("SM7");
		car3.setColor("회색");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);
		
		System.out.println("<< 자동차 목록 >>");
		car1.information(car1);
		System.out.print('\n');
		car2.information(car2);
		System.out.print('\n');
		car3.information(car3);

	}

}
