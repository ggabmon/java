package chap11_re;

import java.util.*;


public class Ex01 {

	public static void main(String[] args) {
		//List인터페이스 참조하는 ArrayList 클래스 객체 생성
		List list = new ArrayList();
		
		list.add(1);		//Integer
		list.add(10L);		//Long
		list.add(3.1);		//Double
		list.add(Math.random());
		list.add(true);		//Boolean
		list.add('1');		//Character
		list.add("문자열");	//String
		
		System.out.println(list.get(3) instanceof Double);
		
		for(Object E:list) {
			System.out.println(E);
		}
		System.out.println("========================");
		//Set인터페이스 참조하는 ArrayList 클래스 객체 생성
		Set set = new HashSet();
		set.add(1);		//Integer
		set.add(10L);		//Long
		set.add(3.1);		//Double
		set.add(Math.random());
		set.add(true);		//Boolean
		set.add('1');		//Character
		set.add("문자열");	//String
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			Object obj = iter.next();
			System.out.println(obj);
			if(obj instanceof String) {
			System.out.println("길이출력!");
			System.out.println(((String) obj).length());
			}
		}
		//순서가 존재하지 않는다.
	}

}
