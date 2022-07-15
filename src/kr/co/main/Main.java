package kr.co.main;

import kr.co.terran.Marine;
import kr.co.terran.Scv;
import kr.co.unit.Unit;

public class Main {

	public static void main(String[] args) {
		Marine m1 = new Marine();	//자식 객체를 만들면 부모 생성자를 호출해 부모 먼저 만들고 자식 생성자를 호출해 생성한다.
		Scv s1 = new Scv();
		
		//Marine is a Unit
		//Marine Type is a Unit Type
		//Scv is a Unit
		//Scv Type is a Unit type
		
		Unit test = m1;				//이런식으로 할당해도 test는 유닛타입으로 사용가능하다. 즉, Marine처럼 사용할 수 있는것이 아니라 Unit에 선언된 것만 사용가능
		System.out.println(test.getHp());
		// m1 = test 이러면 에러남
		// 왜냐하면 Marine은 Unit 타입이지만 Unit은 다른 모든 자식 클래스타입이 될 수 있으므로 구체적으로 형변환을 해주어야 한다.
		m1 = (Marine)test;
		
		Unit unit = new Marine();	//이러한 형태는 상속관계일때에만 가능하다. 마린은 유닛타입이기 때문에 단, 마린타입이 아닌 유닛타입으로 생성된다.
									//즉 멤버 변수나 메소드는 Unit에 선언된 것만 사용가능하다. Marine클래스에 선언된 것들은 사용 불가
		unit.setName("Wow");
		
		System.out.println(unit.getName());
		
		m1.setHp(50);
		m1.setName("Gerend");
		m1.setColor("Blue");
		m1.setWeapon("GausRifle");
		
		System.out.println(m1.getName());
		
		m1.move();
		m1.attack();
		m1.attack(20);
		m1.info();
		//Unit unit = new Unit();	//abstract 키워드가 붙은 클래스는 명시적으로 생성 불가
		
	}

}
