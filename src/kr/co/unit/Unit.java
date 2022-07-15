package kr.co.unit;

public abstract class Unit {	//추상클래스, 추상클래스는 상속용으로 쓴다. 명시적으로 객체 생성 불가
	//클래스 간의 공통요소를 모아놓음
	private int hp;
	private String color;
	private String name;
	
	public Unit() {
		System.out.println("Super Constructor");
	}	//생성자
	
	public Unit(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.println("이동");
	}
	
	public abstract void attack();	//추상메소드, 상속받은 클래스에서 오버라이드해 실행구문을 작성해 사용한다.
	
	public void info() {
		System.out.println("Super Info");
	}
	
}
