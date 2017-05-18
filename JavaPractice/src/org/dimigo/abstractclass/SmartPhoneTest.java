/**
 * 
 */
package org.dimigo.abstractclass;
/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author : duddn
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone[] phone = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for(SmartPhone each : phone){
			System.out.println(each.toString());
			each.turnOn();
			each.pay();
			each.useSpecialFunction();
			each.turnOff();
			System.out.print('\n');
		}

	}

}
