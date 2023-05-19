package chap07_re;

class GrandFather{
	int height = 160;
	GrandFather(){}
	String name = "홍할";
	void sing() {System.out.println("할아버지의 sing");}
}

class Father extends GrandFather{
	int height = 170;
	Father(){}
	String addr="서울";
	void dance() {System.out.println("아빠의 dance");}
	@Override
	void sing() {System.out.println("아빠의 sing");}
}

class Son extends Father {
	int height = 180;
	String name = "젊은이";
	Son(){}
	String gender = "남자";
	void run() {System.out.println("아들의 run");}
	@Override
	void dance() {System.out.println("아들의 dance");}
	void sing() {System.out.println("아들의 sing");}


}
public class Promotion_p333 {

	
	public static void main(String[] args) {
		GrandFather gf1 = new Son();
		System.out.println(gf1.name);
		Father so1 = (Father)gf1;
		System.out.println(so1.name);
		Son so2 = (Son)so1;
		System.out.println(so2.name);
		so1.sing();
	}

}
