package kr.co.ex1;

public class Iu {
	private String name;
	private int age;
	private static Iu iu;	//싱글톤패턴을 위해 멤버변수 static으로 자기자신

	private Iu() {}	//생성자를 private로 지정
	
	public static Iu createIu() {
		if(Iu.iu == null) {
			Iu.iu = new Iu();
		}
		return Iu.iu;
	}	//static은 어플리케이션에서 공통으로 사용가능, 클래스를 생성하지않고도 사용가능, 싱글톤패턴

	private Iu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static Iu createIu(String name, int age) {
		return new Iu(name, age);
	}
	
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
