package kr.co.ex1;

public class Iu {
	private String name;
	private int age;
	
	//setter
	//public void set변수명(데이터타입 변수명){}
	public void setName(String name) {
		this.name = name;
	}
	
	//getter
	//public 리턴타입 get변수명(){}
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}
