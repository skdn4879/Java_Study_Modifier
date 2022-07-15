package kr.co.terran;

import kr.co.unit.Attacker;
import kr.co.unit.Unit;	//같은 패키지 내에 있으면 import가 필요없지만 Unit은 다른 패키지에 있는 클래스이므로 import해주어야 한다.

public class Marine extends Unit implements Attacker {
	
	private String weapon;
	
	public Marine() {
		//super();	//자식 생성자 내부에는 부모의 생성자를 호출하는 부분이 생략되어있다. super(), this()는 생성자함수의 첫줄에만 올 수 있다.
		//super(30);
		System.out.println("Marine Constructor");
	}	//만약에 부모 클래스에 기본생성자없이 매개변수를 받는 생성자만 있다면 이 생성자는 에러난다. super(30)처럼 부모 생성자를 호출해 매개변수를 넣어주어야 한다.
	//따라서 부모 클래스에 기본 생성자는 마련하는 것이 좋다.
	
	@Override	//부모로부터 상속받은 메소드를 자기자신에 맞게 재정의
	public void move() {
		super.move();	//부모의 기능을 그대로 사용(추상메소드가 아닐 경우에만)
		System.out.println("마린 이동");
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void attack() {
		System.out.println("사격");
	}
	
	public void attack(int count) {
		System.out.println(count + "번 사격");
	}	//오버로딩
	
	public void info() {
		super.info(); //부모의 메소드 그대로
		System.out.println("Marine Info");
	}	//@Override가 없어도 오버라이딩된다. 근데 굳이 이렇게;;;;

	@Override
	public void strike() {
		System.out.println("싹 박멸이야");
		this.attack();
	}
	
}
