package kr.co.main;

import kr.co.himart.Client;
import kr.co.himart.Computer;
import kr.co.himart.Telephone;
import kr.co.himart.Tv;
import kr.co.terran.Marine;

public class Main {

	public static void main(String[] args) {
		/*Marine m1 = new Marine();	//자식 객체를 만들면 부모 생성자를 호출해 부모 먼저 만들고 자식 생성자를 호출해 생성한다.
		m1.setHp(50);
		m1.setName("Gerend");
		m1.setColor("Blue");
		m1.setWeapon("GausRifle");
		
		m1.move();
		m1.attack();
		m1.attack(20);
		m1.info();
		//Unit unit = new Unit();	//abstract 키워드가 붙은 클래스는 명시적으로 생성 불가*/
		
		Computer com = new Computer("삼성", 2000000, 20000, "AMD-R5");
		Telephone phone = new Telephone("Dell", 50000, 500, "LG");
		Tv tv = new Tv("LG", 800000, 8000, "50인치");
		
		com.info();
		phone.info();
		tv.info();
		
		Client client = new Client(3000000, 10);
		
		client.buy(com.getPrice(), com.getPoint());
		client.buy(phone.getPrice(), phone.getPoint());
		client.buy(tv.getPrice(), tv.getPoint());
		
		client.buy(com);
		client.buy(phone);
		client.buy(tv);
	}

}
