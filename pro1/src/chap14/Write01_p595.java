package chap14;

import java.io.*;

public class Write01_p595 {

	public static void main(String[] args) throws Exception {
		
		//byte배열 일부출력 - write(byte[], int시작인덱스,int개수)
		System.out.println("byte배열 일부출력==============");
		OutputStream os3 = new FileOutputStream("C:\\forcode\\temporaryPractice\\test3.db");
		
		byte[] array = {10,20,30,40,50,60,70,80};
		os3.write(array);
		os3.write(array,2,4);//30 40 50 60
		os3.flush();
		os3.close();
		
		
		//byte배열 전부출력 - write(byte[])
		System.out.println("byte배열 전부출력==============");
		
		OutputStream os2 = new FileOutputStream("C:\\forcode\\temporaryPractice\\test2.db");
		
		byte[] array2 = {10,20,30,40,50,60,70,80};
		os2.write(array2);
		os2.flush();
		os2.close();
		
		
		
		//OutputStream 의 자식 객체인 FileOutputSTream 생성하여 이름 붙여준다.
		//1byte씩 출력-write()
		System.out.println("byte배열 1byte씩출력===========");
		OutputStream os = new FileOutputStream("C:\\forcode\\temporaryPractice\\test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}

}
