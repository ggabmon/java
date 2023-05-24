package chap13;

import java.util.*;
public class HashMapMain_p576 {

	public static void main(String[] args) {
		Map<Student,Integer> map1 = new HashMap<Student,Integer>();
		map1.put(new Student(1, "여", "경영", "홍길동", 100),50);
		map1.put(new Student(2, "여", "공과", "고길동", 90),60);
		map1.put(new Student(3, "남", "체육", "둘리", 10),70);
		map1.put(new Student(4, "남", "아이티", "또치", 1000),80);

		Set<Student> keys1 = map1.keySet();
		Iterator<Student> iter1 = keys1.iterator();
		while(iter1.hasNext()) {
			Student std = iter1.next();
			int realScore = (Integer)map1.get(std);
			System.out.println("이름은 "+std.name);
		}
	System.out.println("");
		
		
		
		Map<String,Integer> map = new HashMap();
		map.put("김인겸", 100);
		map.put("신재민", 110);
		map.put("이성우", 999);
		map.put("중국인", 50);
		
		int size = map.size();
		System.out.println(size);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			int score = (Integer)map.get(key);
			System.out.println(key+"은(는) 점수가 "+score);
			
			
			
			
		}

	}

}
