package chap06_re;

public class TeleMain {

	public static void main(String[] args) {
		Television newTv = new Television();
		System.out.println(newTv);
		System.out.println(newTv.color);
		System.out.println("발매일"+newTv.releaseDay.getYear());
		System.out.println();
	}

}
