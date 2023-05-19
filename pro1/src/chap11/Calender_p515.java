package chap11;

import java.util.Calendar;

//Calendar 클래스 : 추상클래스
public class Calender_p515 {
	public static void main(String[] args) {
		// 변수타입 변수명 = 참조변수명.메서드명();
		//		Calendar mine = new Calendar(); 를 쓰지않는다. >> 추상클래스는 객체 안된다!
		Calendar something = Calendar.getInstance();// Calendar는 추상클래스이므로 객체 생성을 할수는 없다. 그렇기대문에 getInstance를 이용
//		System.out.println(something);
		//java.util.GregorianCalendar[time=1684127987958,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=4,WEEK_OF_YEAR=20,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=135,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=19,SECOND=47,MILLISECOND=958,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		int a = something.get(1);
		System.out.println(a);
		
		int b = something.get(3);
		System.out.println(b);

		int month = something.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int day = something.get(Calendar.DAY_OF_MONTH); //일
		System.out.println(day);
		
		int hour = something.get(Calendar.HOUR_OF_DAY); //시
		System.out.println(hour);
		
		int min = something.get(Calendar.MINUTE); //분
		System.out.println(min);
		
		int sec = something.get(Calendar.SECOND); //초
		System.out.println(sec);
		
		int dow = something.get(Calendar.DAY_OF_WEEK); //요일
		String dowStr ="";
		System.out.println(dow);
		switch(dow) {
		case 1:{dowStr="일요일";break;}
		case 2:{dowStr="월요일";break;}
		case 3:{dowStr="화요일";break;}
		case 4:{dowStr="수요일";break;}
		case 5:{dowStr="목요일";break;}
		case 6:{dowStr="금요일";break;}
		case 7:{dowStr="토요일";break;}
		}
		System.out.println(dowStr);
		
		System.out.printf("%d년 %02d월 %d일 %d : %02d : %02d ",a,month,day,hour,min,sec); // printf를 이용하여 표현, 두자리수로 강제출력한다.
		
	}
}
