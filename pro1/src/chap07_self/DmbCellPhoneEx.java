package chap07_self;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone newPhone1 = new DmbCellPhone("자바폰", "검정",10);
		
		System.out.println("모델:"+newPhone1.model);
		System.out.println("색상:"+newPhone1.color);
		
		System.out.println("채널"+newPhone1.channel);
		
		newPhone1.powerOn();
		newPhone1.powerOff();
		newPhone1.sendVoice("여보세력나야");
		newPhone1.recieveVoice("거기 잘 떨어졌니");
		newPhone1.sendVoice("여보세요 왜 말 안하니");
		newPhone1.hangUp();
		
		newPhone1.turnOnDmb();
		newPhone1.changeChannelDmb(1234);
		newPhone1.turnOffDmb();

	}

}
