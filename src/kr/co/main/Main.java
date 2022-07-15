package kr.co.main;

import kr.co.terran.Marine;

public class Main {

	public static void main(String[] args) {
		Marine m1 = new Marine();	//자식 객체를 만들면 부모 생성자를 호출해 부모 먼저 만들고 자식 생성자를 호출해 생성한다.
		m1.setHp(50);
		m1.setName("Gerend");
		m1.setColor("Blue");
		m1.setWeapon("GausRifle");
		
		m1.move();
		m1.attack();
		m1.attack(20);
		m1.info();
		//Unit unit = new Unit();	//abstract 키워드가 붙은 클래스는 명시적으로 생성 불가
		
	}

}
