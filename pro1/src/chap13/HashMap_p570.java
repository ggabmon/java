package chap13;

import java.util.*;;

//HashMap(p570)
/*
	Map컬렉션 - Key, Value로 구성된 Map.Entry객체를 저장하는 구조를 가지고 있다.
	Entry는 Map 인터페이스 내부에 선언된 중첩 인터페이스이다.
	Object타입의 Key, Object타입의 Value
	객체 추가 - map참조변수.put(Object key, Object Value)
	객체 검색 - map참조변수.get(Object key)
			Object 변수 = map참조변수.get(Object key)


*/
public class HashMap_p570 {

	public static void main(String[] args) {
		//Map 인터페이스타입 변수 선언 및 객체를 생성하자.
		//구현클래스의 객체입니다 , Key와 Value 넣어주자
		
		Map map = new HashMap();
		//객체추가 - map참조 변수.put(Object key, Object Value);
		map.put("회원번호", 1);		//관례적으로 key는 String으로 바꾸어 사용하자.
		map.put("통장 잔고",10L);		//여기에 저장된 값은 모두 Object이므로 꺼내선 강제 형변환이 이루어 져야한다.
		map.put("키", 193.1);
		map.put("정답", true);
		map.put("회원등급", 'A');
		map.put("5", "홍길동");
		System.out.println("======이 위로는 하나씩 처리했음=========");
		
		Set< Map.Entry<String,Object> > genMap = map.entrySet();
		Iterator< Map.Entry<String,Object> > entryIter = genMap.iterator(); 
		
		while(entryIter.hasNext()) {
			Map.Entry<String, Object> entry = entryIter.next();
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+" : "+value);
		}
		
		
		
		//키를 가져오기
		System.out.println("키셋을 가져온것");
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println("keys ="+ str+" valuse = "+map.get(str));
			System.out.println("");
		}
		
		System.out.println("저장된 키의 개수는 "+map.size());
		
		
		//객체검색 - map참조변수.get(Object key)
		int memberNo = (Integer)map.get("회원번호");
		Long account = (Long)map.get("통장 잔고");
		double height = ((Double)map.get("키"));
		boolean check = (boolean)map.get("정답");
		
		
	
		
		
		
	}

}
