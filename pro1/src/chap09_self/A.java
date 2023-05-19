package chap09_self;

class A {
	A(){System.out.println("A객체 생성");}
	
		class B{
			B(){System.out.println("A내부의 B객체 생성");}
			int field1;
			//static int field2; 클래스B가 인스턴스 멤버이기때문에 static을 사용할 수 없다.
			void method1() {}
 			//static void method2() {} static을 사용할 수 없는 이유는 Class때문임이 동일하다.
		}
		
		static class C{
			C(){System.out.println("A내부의 C객체 생성");}
			int field3;
			static int field4;
			void method3() {}
			static void method4() {}
		}
		
		void method() {
			class D{
				D(){System.out.println("A내부의 method내부의 D객체 생성");}
				int field1;
//				static int field2; 로컬클래스인데 정적멤버 변수로 사용할 수있을리가..
				void method1() {}
//				static void method2() {} 로컬클래스~~
				
			}
			D d =new D();
			d.field1 = 3;
			d.method1();
			
			
		}
}

