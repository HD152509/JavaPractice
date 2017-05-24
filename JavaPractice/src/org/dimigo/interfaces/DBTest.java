/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * interfaces
 *   |_DBTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * @author : duddn
 * @version : 1.0
 */
public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDBManager idb = IDBManager.getDBObject("SYBASE");
		System.out.println("< 변경 전 >");
		crud(idb);
		IDBManager idb2 = IDBManager.getDBObject("ORACLE");
		System.out.println("< 변경 후 >");
		crud(idb2);		

	}
	
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}

}
