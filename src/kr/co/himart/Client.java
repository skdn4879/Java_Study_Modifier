package kr.co.himart;

public class Client {

	private int money;
	private int point;
	
	public Client(int money, int point) {
		this.money = money;
		this.point = point;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void buy(int price, int point) {
		System.out.println("구매 완료\t\t" + "남은 금액 : " + (money - price) + ", 잔여포인트 : " + (this.point + point));
	}
	
	public void buy(Electric electric) {
		System.out.println("구매 완료\t\t" + "남은 금액 : " + (money - electric.getPrice()) + ", 잔여포인트 : " + (point + electric.getPoint()));
	} //오버로딩해도된다. 근데 우리가 필요한건 price랑 point인데 부모도 이 멤버를 가지고 있으므로 부모타입으로 선언하면 모든 자식클래스를 매개변수로 받을 수 있다.
	
}
