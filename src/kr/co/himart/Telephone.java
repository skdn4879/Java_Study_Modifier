package kr.co.himart;

public class Telephone extends Electric {

	private String manufacturer;
	
	public Telephone(String brand, int price, int point, String manufacturer) {
		super(brand, price, point);
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public void info() {
		System.out.println("Telephone [brand=" + this.getBrand() + ", price=" + this.getPrice() + ", point=" + this.getPoint() + ", manufacturer=" + manufacturer + "]");
	}
	
}
