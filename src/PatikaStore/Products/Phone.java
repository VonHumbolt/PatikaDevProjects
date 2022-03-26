package PatikaStore.Products;

import java.util.ArrayList;
import java.util.List;

import PatikaStore.Brand;

public class Phone extends Product{

	private String memory;
	private int batteryPower;
	private String color;
	public static List<Phone> phoneList;
	
	public Phone(int id, int price, int discountRatio, int stockAmount, String name, int brandId, int ram,
			int screenSize, int groupProduct, String memory, int batteryPower, String color) {
		
		this.id = id;
		this.price = price;
		this.discountRatio = discountRatio;
		this.stockAmount = stockAmount;
		this.name = name;
		this.brandId = brandId;
		this.ram = ram;
		this.screenSize = screenSize;
		this.groupProduct = groupProduct;
		
		this.memory = memory;
		this.batteryPower = batteryPower;
		this.color = color;
		
		
		// Maðazada mevcut olan default telefonlarý getirecek
		
	}
	
	public static void listPhones() {
		System.out.printf("%-6s%-20s%-10s%-6s%10s%10s%10s \n","ID", "Ürün Adý", "Marka", "Fiyat", "Depolama", "Ekran", "RAM", "Pil", "Renk");
		for(Phone p : Phone.phoneList) {
			System.out.printf("%-6s%-20s%-10s%-6s%10s%10s%10s \n",p.id, p.name, p.brandId, p.price, p.memory, p.screenSize, p.ram, p.batteryPower, p.color);
		}
	}
	

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public int getBatteryPower() {
		return batteryPower;
	}

	public void setBatteryPower(int batteryPower) {
		this.batteryPower = batteryPower;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
