package kr.co.zerg;

import kr.co.unit.Attacker;
import kr.co.unit.Unit;

public class Hydra extends Unit implements Attacker {

	@Override
	public void move() {
		//super.move();
		System.out.println("히드라 이동");
	}
	//hp, color, name
	//move, 원딜
	@Override
	public void attack() {
		System.out.println("퉤!");
	}
	@Override
	public void strike() {
		this.attack();
	}
}
