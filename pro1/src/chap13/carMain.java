package chap13;

import java.util.*;
//CarDTO객체들을 하나의 변수에 저장, 출력 등의 조작
public class carMain {
	
	public static void main(String[] args) {
		//Cars 라는 배열 선언해보세요
		String[] manufacturers = new String[3];
		//3개짜리 선언하고 직접 넣는다.
		
		//
		String[] stringCars = new String[] {"기아", "현대", "쌍용"};
		int[] intCars = new int[] {10000,36000,40000};
		
		//자동차라는 클래스의 배열을 만들면, 그 클래스의 객체를 배열로 저장할수 있다!
		Car[] cars = new Car[3];
		cars[0]= new Car("현대","모델1",50050,15.5,new Date(2021-1900,10,1),true);
		cars[1]= new Car("쌍용","모델2",10450,10.5,new Date(2022-1900,9,2),false);
		cars[2]= new Car("기아","모델3",123456,999.5,new Date(2023-1900,8,3),true);
		
		for(Car c : cars) {
			System.out.println(c.getMaker());
			System.out.println(c.getModel());
			System.out.println(c.getRunDistance());
			System.out.println(c.getManufactureDate());
			System.out.println(c.getFuelEff());
			System.out.println(c.isNavi());
			System.out.println("");
		}
		
		for(Car d : cars) {
			d.showAll();
		}
		
		List<Car> carlist = new ArrayList();
		carlist.add(new Car("현대","모델1",50050,15.5,new Date(2021-1900,10,1),true));
		carlist.add(new Car("쌍용","모델2",10450,10.5,new Date(2022-1900,9,2),false));
		carlist.add(new Car("기아","모델3",123456,999.5,new Date(2023-1900,8,3),true));
		
		//Set타입 carset선언하세요.
		Set carset = new HashSet();
		carset.add(new Car("현대","모델1",50050,15.5,new Date(2021-1900,10,1),true));
		carset.add(new Car("쌍용","모델2",10450,10.5,new Date(2022-1900,9,2),false));
		carset.add(new Car("기아","모델3",123456,999.5,new Date(2023-1900,8,3),true));
		Iterator<Car> iter = carset.iterator();
		
		while(iter.hasNext()) {
			System.out.println("==");
			Car car = iter.next();
			System.out.println(car);
			System.out.println(car.getMaker());
			System.out.println("==");
		}
		
	}

}
