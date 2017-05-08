/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author : duddn
 * @version : 1.0
 */
public class PersonTest {
	
	public static void main(String[] args)
	{
		Person p1 = new Person("Tom");
		Korean p2 = new Korean("홍길동");
		Japanese p3 = new Japanese("다나카");
		Chinese p4 = new Chinese("왕밍");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		System.out.print('\n');
		
		p1.sayHello();
		p2.sayHello();
		p3.sayHello();
		p4.sayHello();
		
		System.out.print('\n');
		
		p1.sayBye();
		p2.sayBye();
		p3.sayBye();
		p4.sayBye();
		
	}
	
	

}
