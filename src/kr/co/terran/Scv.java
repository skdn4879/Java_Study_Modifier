package kr.co.terran;

import kr.co.unit.Unit;

public class Scv extends Unit {
	
	@Override
	public void move() {
		super.move();
		System.out.println("예비군 출동");
	}

	@Override
	public void attack() {
		System.out.println("지지기");
	}
	
	public void work() {
		System.out.println("미네랄 캐기");
	}

}
