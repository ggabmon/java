package chap11_re;

public class String02 {

	public static void main(String[] args) {
		//String - immutable(불변)
		String name = "박장원";
		System.out.println("name = "+name);
		System.out.println("name = "+name.hashCode());
		String name2 = name+"장군";
		System.out.println("name2 = "+name2);
		System.out.println("name2 = "+name2.hashCode());
		
		//StringBuffer - String과 달리 내용을 변경가능(mutable)
		StringBuffer sb = new StringBuffer("김인겸");
		System.out.println("sb = "+sb);
		System.out.println("sb = "+sb.hashCode());
		sb.append("자전거");
		System.out.println("sb = "+sb);
		
		
	}

}
