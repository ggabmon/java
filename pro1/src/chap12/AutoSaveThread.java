package chap12;

public class AutoSaveThread extends Thread {

	@Override
	public void run() {
		while(true) {
			try {
				save();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}
		

		
	}

	public void save() {
		System.out.println("자동저장중!");
		
	}
	
}
