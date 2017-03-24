/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : duddn
 * @version : 1.0
 */
public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
//	Constructor
	public Car2(String company, String model, String color, int maxSpeed, int price){
		
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
		
	}

	/*public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getPrice() {
		return price;
	}*/

	
// print a carinformation
	public void information(Car2 Carinfo)
	{
		System.out.println("제조사명 : " + Carinfo.company);
		System.out.println("모델명 : " + Carinfo.model);
		System.out.println("색상 : " + Carinfo.color); 
		System.out.println("최대속도 : " + Carinfo.maxSpeed + "km");
		System.out.println("가격 : " + String.format("%,d",Carinfo.price) + "원");
	}
}
