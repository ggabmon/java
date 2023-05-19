package chap11_re;

public class String01 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		if(name1==name2) {
			System.out.println("==일치합니다");//일치
		}else {
			System.out.println("==일치안함");
		}
		
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		if(name3==name4) {
			System.out.println("일치합니다");//일치
		}else {
			System.out.println("일치안함");
		}
	
	}
}
