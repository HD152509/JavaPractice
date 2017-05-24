/**
 * 
 */
package interfaces;

/**
 * <pre>
 * interfaces
 *   |_IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * @author : duddn
 * @version : 1.0
 */
public interface IDBManager {
	
	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	static IDBManager getDBObject(String database){
		if(ORACLE_DATABASE.equals(database)) return new OracleDB();
		else return new SybaseDB();
	}

}
