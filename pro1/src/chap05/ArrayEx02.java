package chap05;

public class ArrayEx02 {

	public static void main(String[] args) {

		int[] a1 = new int[3];
		
		for(int i=0;i<a1.length;i++) {
			System.out.println("a1[i]="+a1[i]);
		}// int의 기본값 0
		System.out.println("------------------------");
		
		
		byte [] a2 = new byte[3]; 
		
		
		for(int i=0;i<a2.length;i++) {
			System.out.println("a2[i]="+a2[i]);
		}// byte의 기본값 0
		System.out.println("------------------------");

		long [] a3 = new long[3];
		
		
		for(int i=0;i<a3.length;i++) {
			System.out.println("a3[i]="+a3[i]);
		}// long의 기본값 0
		System.out.println("------------------------");
		
		double [] a4 = new double[3];
		
		
		for(int i=0;i<a4.length;i++) {
			System.out.println("a4[i]="+a4[i]);
		}// double의 기본값 0.0
		System.out.println("------------------------");
		
		float [] a5 = new float[3];
		
		
		for(int i=0;i<a5.length;i++) {
			System.out.println("a5[i]="+a5[i]);
		}// float의 기본값  0.0
		System.out.println("------------------------");
		
		String [] a6 = new String[3];
		
		
		for(int i=0;i<a6.length;i++) {
			System.out.println("a6[i]="+a6[i]);
		}// String의 기본값 = null
		System.out.println("------------------------");
		
		char [] a7 = new char[3];
		
		
		for(int i=0;i<a7.length;i++) {
			System.out.println("a7[i]="+a7[i]);
		}// char의 기본값 = ""
		System.out.println("------------------------");

		
		
	}

}
