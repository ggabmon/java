package chap14;
import java.io.*;
public class WriteEx_p607 {

	public static void main(String[] args) throws IOException {
		Writer writer = null;
		
		
		writer = new FileWriter("C:\\forcode\\temporaryPractice\\test10.txt");
		
		String str = "김인겸의 비밀";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
		
	}

}
