package chap13;

import java.util.*;

public class Student extends HashMapMain_p576{
	//필드
	int identNum;
	String sex;
	String study;
	String name;
	int score;
	
	Student(int identNum,String sex, String study, String name, int score){
		this.identNum=identNum;
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.study = study;
	}
	
	
	
	
	
	//생성자
	
	
	
	
	
	
	
	//메서드
	@Override
	public String toString() {
		return this.identNum+"학번/"+ this.name;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if( obj!=null && obj instanceof Student) {
			Student student = (Student)obj;
			
			return this.identNum == student.identNum;
		}else {
			return false;
		}
	}
	
	
	
}
