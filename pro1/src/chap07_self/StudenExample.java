package chap07_self;

public class StudenExample {

	public static void main(String[] args) {
		Student me = new Student("홍길동", "929292-1010101", 45);
		System.out.println("이름"+me.name);
		System.out.println("주민번호"+me.ssn);
		System.out.println("학번"+me.studentNo);
	}

}
