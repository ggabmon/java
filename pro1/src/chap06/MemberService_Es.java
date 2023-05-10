package chap06;

public class MemberService_Es {

	public static void main(String[] args) {
		MemberService newMem1 = new MemberService();
		boolean result = newMem1.login("hong", "12345");
			
		if(result) {
			System.out.println("로그인성공!");
			newMem1.logout("hong");
		}else{ 
			System.out.println("id 또는 password가 틀렸습니다.");
		}

	}

}
