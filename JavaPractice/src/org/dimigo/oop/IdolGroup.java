/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_IdolGroup
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 7.
 * </pre>
 *
 * @author : duddn
 * @version : 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] groupName = {"빅뱅", "2NE1","걸스데이"};
		
		String[][] memberName = {
				new String[] {"GD","태양","대성","탑","승리"},
				new String[] {"CL","산다라박","박봄","민지"},
				new String[] {"유라","혜리","소진","민아"}
		};
		
		for(int i = 0 ; i < groupName.length ; i++){
			System.out.println("<< " + groupName[i] + " >>");
			for(int j = 0 ; j < memberName[i].length ; j++){
				System.out.println(memberName[i][j]);
			}
			System.out.print('\n');
		}
		}
	}

