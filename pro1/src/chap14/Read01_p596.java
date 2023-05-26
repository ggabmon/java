package chap14;

import java.io.*;

public class Read01_p596 {

	public static void main(String[] args) throws Exception {
		
		//byte배열 일부읽기 - write(byte[], int시작인덱스,int개수)
		System.out.println("byte배열 일부출력==============");
		InputStream is3 = new FileInputStream("C:\\forcode\\temporaryPractice\\test3.db");
		
		
		byte[] buffer3 = new byte[8];
		int data3 = is3.read(buffer3,2,4);
		System.out.println("나는 데이터3이에요"+data3);
		for(int a: buffer3) {
			System.out.println(a);
		}
		
		
		
		
		is3.close();
		
		
		//byte배열 전부읽기 - write(byte[])
		System.out.println("byte배열 전부출력==============");
		
		InputStream is2 = new FileInputStream("C:\\forcode\\temporaryPractice\\test2.db");
		
		byte[] buffer2 = new byte[8];
		int data2 = is2.read(buffer2);
		for(int a: buffer2) {
			System.out.println(a);
		}
		
		
		is2.close();
		
		
		
		//OutputStream 의 자식 객체인 FileOutputSTream 생성하여 이름 붙여준다.
		//1byte씩 읽기-write()
		System.out.println("byte배열 1byte씩출력===========");
		InputStream is = new FileInputStream("C:\\forcode\\temporaryPractice\\test1.db");
		

		// 계속 읽어오는데 더이상 읽어올 것이 없으면 return 값이 -1;
		while(true) {
			int data = is.read();
			if(data==-1) {break;} // -1이면 끝난거니까 while문 탈출해~
			System.out.println(data);
			
		}
		
		
		is.close();
	}

}
