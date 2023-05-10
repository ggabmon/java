package chap06;

public class CarInfo {

	String company="현대자동차";
	String model;
	String color;
	int maxspeed;

	CarInfo(){
	}
	
	CarInfo(String model){
	this(model,"밝은색",10);
	}
		
	CarInfo(String model,String color){
	this(model,color,15);
	}
	
	CarInfo(String model,String color,int maxspeed){
	this.model=model;
	this.color=color;
	this.maxspeed=maxspeed;
	
	}
}
