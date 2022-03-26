package PatikaStore.Products;

import java.util.List;

public class NoteBook extends Product{

	private String storage;
	public static List<NoteBook> notebookList;
	
	public NoteBook(int id, int price, int discountRatio, int stockAmount, String name, int brandId, int ram,
			int screenSize, int groupProduct, String storage) {
		
		this.id = id;
		this.price = price;
		this.discountRatio = discountRatio;
		this.stockAmount = stockAmount;
		this.name = name;
		this.brandId = brandId;
		this.ram = ram;
		this.screenSize = screenSize;
		this.groupProduct = groupProduct;
		
		this.storage = storage;
	}

	public static void listNotebooks() {
		System.out.printf("%-6s%-20s%-10s%-6s%10s%10s%10s \n","ID", "Ürün Adý", "Marka", "Fiyat", "Depolama", "Ekran", "RAM");
		for(NoteBook p : NoteBook.notebookList) {
			System.out.printf("%-6s%-20s%-10s%-6s%10s%10s%10s \n",p.id, p.name, p.brandId, p.price, p.storage, p.screenSize, p.ram);
		}
	}
	
	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	
}
