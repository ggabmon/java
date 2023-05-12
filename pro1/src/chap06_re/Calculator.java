package chap06_re;
//p265 : method overloading
// 클래스 내에 같은 이름의 method를 여러개 선언해보자. 단 parameter의 type, 개수, 순서중 하나가 달라야한다.
public class Calculator {
	double areaRectangular(double width) {
		return width*width;
	}
	
	double areaRectangular(double height,double width) {
		return height*width;
	}
}
