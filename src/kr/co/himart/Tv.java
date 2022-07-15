package kr.co.himart;

public class Tv extends Electric {

	private String size;
	
	public Tv(String brand, int price, int point, String size) {
		super(brand, price, point);
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public void info() {
		System.out.println("Tv [brand=" + this.getBrand() + ", price=" + this.getPrice() + ", point=" + this.getPoint() + ", size=" + size + "]");
	}
	
}
