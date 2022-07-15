package kr.co.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		
		/*Iu iu = new Iu();
		iu.setName("IU");
		iu.setAge(30);
		
		String name = iu.getName();
		int age = iu.getAge();*/
		
		/*Iu test = Iu.createIu();
		test.setName("IU");
		test.setAge(30);
		
		System.out.println("생성된 이름 : " + test.getName() + ",  생성된 나이 : " + test.getAge());
		
		Iu test2 = Iu.createIu("wow", 10);
		System.out.println("생성된 이름 : " + test2.getName() + ",  생성된 나이 : " + test2.getAge());
		System.out.println();*/
		
		Iu test = Iu.createIu();
		test.setName("IU");
		test.setAge(30);
		
		System.out.println("생성된 이름 : " + test.getName() + ",  생성된 나이 : " + test.getAge());
		
		Iu test2 = Iu.createIu();
		test2.setName("wow");
		test2.setAge(20);
		System.out.println("생성된 이름 : " + test2.getName() + ",  생성된 나이 : " + test2.getAge());
		System.out.println("생성된 이름 : " + test.getName() + ",  생성된 나이 : " + test.getAge());
		
	}

}
