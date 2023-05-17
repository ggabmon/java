package chap07_re;

import java.util.Date;

//생성자(constructor)
// new 연산자에 의하여 호출되며 객체의 초기화를 담당한다.
// 필드의 값 설정, 메소드를 호출하여 객체사용을 준비한다.
//
// 기본생성자(Default constructor)
// 모든 클래스는 반드시 생성자가 하나 존재하며 하나이상 가질수도 있다.
// 생성자 선언을 생략하면 기본값을 가진다.
public class Car06 {
	private String company;
	private int price;
	private char grade;
	private boolean isHybrid;
	private Date productionDay;
	
	public Car06(int price) {
		this.price=price;
	}
	public Car06(String company) {
		this.company=company;
	}
	
	public Car06(String company,int price) {
		this.company = company;
		this.price = price;
	}
	public Car06() {
		
	}
	
	
	//Getter와 Setter
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	public char getGrade() {
		return grade;
	}
	public boolean isHybrid() {
		return isHybrid;
	}
	public Date getProductionDay() {
		return productionDay;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public void setHybrid(boolean isHybrid) {
		this.isHybrid = isHybrid;
	}
	public void setProductionDay(Date productionDay) {
		this.productionDay = productionDay;
	}
	
	
	
}
