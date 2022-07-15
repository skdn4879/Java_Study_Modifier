package kr.co.unit;

public abstract class AirUnit extends Unit {
	private int wings;

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}
	
	//원래라면 추상메소드를 오버라이드해야하지만 이 클래스 또한 상속을 위한 중간단계 추상클래스이므로 부모클래스에 추상메소드가 있어도
	//해당 추상메소드를 구현하지 않아도 된다.
}
