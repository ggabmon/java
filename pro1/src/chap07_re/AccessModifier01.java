package chap07_re;

public class AccessModifier01 {
	//public : 제한없음
	// protected : 자식패키지가 아닌 다른패키지 접근 불가
	// default : 다른패키지에서 접근 제한
	// private :  모든 다른 클래스에서 접근 제한
	private 	int pri = 10;
				int pack= 10;
	protected 	int pro = 10;
	public 		int pub = 10;
	AccessModifier01 am = new AccessModifier01();
	int a = pri;
	int b = pack;
	int c = pro;
	int d = pub;
	AccessModifier01(){}
	void aaa() {
		
	}
}

