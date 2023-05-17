package chap07_re;

public class AccessModifier02 extends AccessModifier01{
	public void aaa() {
		AccessModifier01 me = new AccessModifier01();
		System.out.println(me.pack);
		System.out.println(me.pro);
		System.out.println(me.pub);
	}
	
	AccessModifier02(){}
	
	
	
}
