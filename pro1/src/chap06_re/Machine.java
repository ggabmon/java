package chap06_re;

import java.util.Date;

//부모클래스를 만들어봅시다. super~
//자식클래스는 다른 클래스로 sub~
public class Machine {
	String brand;
	String color;
	int productionDay;
	boolean power;
	Date releaseDay = new Date(1992,10,22,05,10,20);
	Machine(){
		System.out.println("헤비머싱거~");
	}
	
	public void powerOn() {
		System.out.println(brand+"전원켬 삐빅");
		power = true;
	}
	public void powerOff(){
		System.out.println(brand+"전원끔");
		power = false;
	}
}
