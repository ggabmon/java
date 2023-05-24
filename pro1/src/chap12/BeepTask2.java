package chap12;

import java.awt.Toolkit;

public class BeepTask2 extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<6;i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
