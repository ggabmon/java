package chap06_re;

public class Television extends Machine{
	String quality;
	
	Television(String brand, String Color, int productionDay, boolean power, String color){
		this.brand=brand;
		this.color=color;
		this.productionDay=productionDay;
		this.power=power;
	}
	
	Television(){
	this.brand="안정했어요";
	this.color="색깔도 몰라요";
	this.productionDay=00000;
	this.power=false;
	}
	public void volumeUp() {
		
	}
}
	
	
	
