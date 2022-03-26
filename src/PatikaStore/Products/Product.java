package PatikaStore.Products;


public abstract class Product {
	
	int id;
	int price;
	int discountRatio;
	int stockAmount;
	String name;
	int brandId;
	int ram;
	int screenSize;
	int groupProduct;
	
	
	public int getBrandId() {
		return this.brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountRatio() {
		return discountRatio;
	}
	public void setDiscountRatio(int discountRatio) {
		this.discountRatio = discountRatio;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGroupProduct() {
		return groupProduct;
	}
	public void setGroupProduct(int groupProduct) {
		this.groupProduct = groupProduct;
	}


}
