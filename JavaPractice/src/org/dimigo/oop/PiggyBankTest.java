/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_PiggyBankTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author : duddn
 * @version : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember[] myFamily = {
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생")
		};
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(myFamily[0], 10000);
		PiggyBank.putMoney(myFamily[1], 5000);
		PiggyBank.putMoney(myFamily[2], 2000);
		PiggyBank.putMoney(myFamily[3], 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(myFamily[2], 1000);
		
		PiggyBank.printBalance();

	}

}
