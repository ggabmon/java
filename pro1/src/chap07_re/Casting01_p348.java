package chap07_re;

//Casting : 강제 타입변환. 부모타입을 자식타입으로 변환 하는것.
//문법 : 자손 클래스 참조변수 = (자손타입) 부모타입;

class GrandMom{
	int age = 80;
	boolean home = true;
	String disease = "무병";
	void ski() {System.out.println("할머니의 ski()");}
}

class Mother extends GrandMom{
	int age=50;
	void cook() {System.out.println("엄마의 cook()");}
	@Override
	void ski() {System.out.println("엄마의 ski()");}

}

class Daughter extends Mother{
	int age = 20;
	void study() {System.out.println("딸의 study()");}
	@Override
	void ski() {System.out.println("딸의 ski()");}
	void cook() {System.out.println("딸의 cook()");}


}
public class Casting01_p348 {
	
	public static void main(String[] args) {

		GrandMom da1 = new Daughter();
		GrandMom mo1= new Mom();
		GrandMom gm1 = new GrandMom();
//		
//		Mom da2 = (Mom) da1;
//		Mom mo2 = (Mom) mo1;
//		Mom gm2 = (Mom) gm1;
//		
//		Daughter da3 = (Daughter)da1;
//		Daughter mo3 = (Daughter)mo1;
//		Daughter gm3 = (Daughter)gm1;
		// 강제변환을 하면 객체의 태생이 어디인지 알아야한다.
		System.out.println(da1 instanceof Mom);
	}

}
