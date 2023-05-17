package chap07_re;

public class Car06Main {

	public static void main(String[] args) {
//		Car06 car = new Car06(); >> 다른 생성자가 하나 있어서 기본 생성자가 없다.. ㅠㅠ
		Car06 car = new Car06("오오회사");
		System.out.println(car.getPrice());
		car.setCompany("좋은회사");
		car.setGrade('5');
		car.setHybrid(true);
		car.setPrice(50000000);
		car.setProductionDay(null); 
		
		System.out.println(car.getProductionDay());
		
		//그렇다면 기본 생성자도 직접 만들어서 넣고 해보자
		
		Car06 carcar = new Car06();
		System.out.println(carcar.getCompany());
		System.out.println(carcar.getGrade());
		System.out.println(carcar.getPrice());
		System.out.println(carcar.getClass());
		System.out.println(carcar.getProductionDay());
		
		
		//int파라미터 넣는 생성자도 써보자
		Car06 carInt = new Car06(50000);
		
		System.out.println(carInt.getPrice());
		
		Car06 car2 = new Car06("매우좋은회사4910",10);
		System.out.println(car2.getCompany());
		
	}

}
