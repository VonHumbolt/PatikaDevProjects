package PatikaStore;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Brand {
	
	
	private int brandId;
	private String brandName;
	public static String[] brandList = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "Hp", "Xiaomi", "Monster" };
	
	
	public Brand(int brandId, int index) {
		super();
		this.brandId = brandId;
		
		this.brandName = Brand.brandList[index-1];
	}


	public int getBrandId() {
		return brandId;
	}


	public String getBrandName() {
		return brandName;
	}

	
}
