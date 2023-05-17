package chap07_re;

import chap07_re.AccessModifier01;

public class AccessModifier04 {

	AccessModifier01 am = new AccessModifier01();
	
	
	
	void aaa() {
		am.pack=200;
		
		am.pro=200;
		
		am.pub=200;
		
//		am.pri=200;
		// pirvate이라서 접근 불가능
		
	}
}
