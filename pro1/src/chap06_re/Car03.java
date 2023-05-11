package chap06_re;

public class Car03 {
	 public static void main(String[] args){
		 Car01 car1 = new Car01();
		 
		 //		 System.out.println(car1.brand);		 
		 System.out.println(car1.getBrand());
		 //메소드내에서 	돌려서 호출하는 방식으로 brand를 호출해왔다.	 
		 		 
		 
		 System.out.println(car1.getcolor()); 
		 //오류발생!
		 //Car01의 color field에 접근제어자 private를 추가했더니
		 // ~~ is not visible 이라는 대답이 나온다.
		 // private는 다른 클래스에서 참조할때 그것을 감추어준다!
		 
		 
		 
	 }	
}