package chap13;

import java.util.*;


//DTO : Data Transfer Object
//데이터를 실어나르는 오브젝트..
//다수개의 데이터를 가진 오브젝트이다.
//데이터를 변경할수있다.

//VO : Value Object => get method만을 가지는것
// read only의 성격을 가진다.
//의미를 크게 구분짓지 않고 목적에 따라 다르게 생각하는것이 맞는듯...?

public class Car {
	//필드
	private String maker ;
	private String model ;
	private int runDistance ;
	private double fuelEff ;
	private Date manufactureDate ;
	private boolean navi ;
	
	
	//생성자
	public Car() {
	}
	
	public Car(String maker, 
			String model, 
			int runDistance, 
			double fuelEff, 
			Date manufactureDate,
			boolean navi ) {
		this.maker=maker;
		this.model=model;
		this.runDistance=runDistance;
		this.fuelEff=fuelEff;
		this.manufactureDate=manufactureDate;
		this.navi=navi;
	
	}
	

	public String getMaker() {
		return maker;
	}

	public String getModel() {
		return model;
	}

	public int getRunDistance() {
		return runDistance;
	}

	public double getFuelEff() {
		return fuelEff;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public boolean isNavi() {
		return navi;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setRunDistance(int runDistance) {
		this.runDistance = runDistance;
	}

	public void setFuelEff(double fuelEff) {
		this.fuelEff = fuelEff;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public void setNavi(boolean navi) {
		this.navi = navi;
	}
	
	//메서드
	
	public void showAll() {
		System.out.println(this.maker);
		System.out.println(this.model);
		System.out.println(this.runDistance);
		System.out.println(this.fuelEff);
		System.out.println(this.navi);
		System.out.println("");
	}
	
}
