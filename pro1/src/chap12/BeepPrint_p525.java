package chap12;

/*
	프로세스 : 운영체제에서 실행중인 하나의 애플리케이션
	여러개의 프로게스 동시에 실행 가능
	각 프로세스는 독립적인 메모리공간 가진다.
	특정 프로세스에 발생한 오류가 다른 프로세스에 영향 X
*/
public class BeepPrint_p525 {

	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			System.out.println("beep음을 내세요");
			try {
				Thread.sleep(5000);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		for(int i=1; i<6;i++) {
			System.out.println("썼음");
		}
	}

}
