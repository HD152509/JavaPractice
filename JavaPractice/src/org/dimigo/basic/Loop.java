/**
 * 
 */
package org.dimigo.basic;

import java.util.Scanner;
import java.util.Random;

public class Loop {

	public static void main(String[] args) {
		int select = 0;
		int power = 100;
		int updown = 10;
		int value = 0;
		boolean flag = true;
		String[] character = {"마법사","영주","기사","농민"};
		Scanner scan = new Scanner(System.in);
		
		while(flag)
		{
			System.out.println("--------------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("--------------------");
			System.out.print("메뉴 입력 => ");
			select = scan.nextInt();
			Random random = new Random();
			
			switch(select)
			{
			case 1:
				power += updown;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + power);
				break;
			case 2:
				power -= updown;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + power);
				break;
			case 3:
				value = random.nextInt(4);
				System.out.println(character[value]+"(으)로 설정되었습니다.");
				break;
			case 9:
				flag = false;
				scan.close();
				System.out.println("이제 공부하세요!");
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
				break;					
			}
		}

}
}