package kr.co.himart;

public class Computer extends Electric {
	
	private String cpu;

	public Computer(String brand, int price, int point, String cpu) {
		super(brand, price, point);
		this.cpu = cpu;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	@Override
	public void info() {
		System.out.println("Computer [brand=" + this.getBrand() + ", price=" + this.getPrice() + ", point=" + this.getPoint() + ", cpu=" + cpu + "]");
	}
	
}
