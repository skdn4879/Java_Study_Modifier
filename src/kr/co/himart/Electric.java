package kr.co.himart;

public abstract class Electric {
	
	private String brand;
	private int price;
	private int point;

	public Electric(String brand, int price, int point) {
		super();
		this.brand = brand;
		this.price = price;
		this.point = point;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public abstract void info();
	
}
