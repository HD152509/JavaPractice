/**
 * 
 */
package org.dimigo.oop;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author : duddn
 * @version : 1.0
 */
public class Question {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] questions = {"가장 좋아하는 가수는? ","가장 좋아하는 배우는? ","가장 좋아하는 과목은? "};
		String[] match = {"인성","공유","문학"};
		Scanner key = new Scanner(System.in);
		int i = 0;
		
		for(i = 0 ; i < 3; i++){
			System.out.println((i+1) + "." + questions[i]);
			//answers[i] = key.nextLine();
			System.out.println((key.nextLine().equals(match[i])? "정답입니다!" : "틀렸습니다!"));
		}
		
		System.out.println("<< 결과 출력 >>");		
		for(i = 0; i< 3 ; i++){
			System.out.print(questions[i]);
			StringBuilder pr = new StringBuilder(match[i]);
			System.out.println(pr.append("입니다."));
		}
		
		
		
	}

}
