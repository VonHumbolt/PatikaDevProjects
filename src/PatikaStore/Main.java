package PatikaStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import PatikaStore.Products.NoteBook;
import PatikaStore.Products.Phone;
import PatikaStore.Products.Product;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PatikaStore �r�n Y�netim Paneli !");
		
		System.out.println("1 - Notebook ��lemleri");
		System.out.println("2 - Cep Telefonu ��lemleri");
		System.out.println("3 - Marka Listele");
		System.out.println("0 - ��k�� Yap ");
		
		System.out.print("Tercihiniz: ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 0: {
			
			System.out.println("��k�� yap�ld� iyi g�nler!");
			break;
		}
		case 1: {
			System.out.println("Notebook i�lemleri");
			System.out.println("----------------------");
			notebookOperations();
			break;
		}
		case 2: {
			System.out.println("Cep Telefonu i�lemleri");
			System.out.println("----------------------");
			phoneOperations();
			break;
		}
		case 3: {
			System.out.println("Markalar�m�z");
			System.out.println("------------");
			String[] brandList = Brand.brandList; 
			Arrays.sort(brandList);
			
			for (String brand : brandList) {
				System.out.println("- " + brand);
			}
			
			break;
		}
		default:
			System.out.println("L�tfen ge�erli bir i�lem se�iniz.");
			break;
		}
		
	}
	
	// ----------------- CEP TELEFONU ��LEMLER� ----------------------------
	public static void phoneOperations() {
		System.out.println("1 - Telefonlar� Listele");
		System.out.println("2 - Telefon Ekle");
		System.out.println("3 - Telefon Sil");
		System.out.println("4 - Markaya g�re listele");
		System.out.println("5 - Id'ye g�re listele");
		System.out.println("6 - ��k�� yap");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��leminiz: ");
		int operation = sc.nextInt();
		
		Phone.phoneList = defaultPhoneList();
		
		switch (operation) {
		case 1: {
			Phone.listPhones();
			break;
		}
		case 2: {
			// Telefon ekle
			System.out.print("1 - Telefon Id: ");
			int phoneId = sc.nextInt();
			
			System.out.print("2 - Telefonun Fiyat�: ");
			int price = sc.nextInt();
			
			System.out.print("3 - �ndirim Oran�: ");
			int discount = sc.nextInt();
			
			System.out.print("4 - Stok adedi: ");
			int stockAmount = sc.nextInt();
			
			System.out.print("5 - Telefonun �smi: ");
			String name = sc.next();
			
			System.out.print("6 - Telefon Marka Id: ");
			int brandId = sc.nextInt();
			
			System.out.print("7 - Ram(GB): ");
			int ram = sc.nextInt();
			
			System.out.print("8 - Ekran Boyutu(in�): ");
			int screenSize = sc.nextInt();
			
			System.out.print("9 - Haf�za(GB): ");
			String memory = sc.next();
			
			System.out.print("10 - Pil G�c�: ");
			int batteryPower = sc.nextInt();
			
			System.out.print("10 - Renk: ");
			String color = sc.next();
			
			Phone phone = new Phone(phoneId, price, discount, stockAmount, name, brandId, ram, screenSize, 1 ,memory, batteryPower, color);
			
			Phone.phoneList.add(phone);
			System.out.println("----------------------��lem Ba�ar�l�----------------------");
			Phone.listPhones();
			break;
			
		}
		case 3: {
			// Telefon Sil
			System.out.print("Silinecek telefonun id'si: ");
			int id= sc.nextInt();
			Phone.phoneList.remove(id-1);
			System.out.println("----------��lem Ba�ar�l�----------");
			Phone.listPhones();
			
			break;
		}
		case 4: {
			// Markaya g�re listele
			System.out.println("------------------");
			String[] brandList = Brand.brandList; 
			Arrays.sort(brandList);
			
			for (int i = 0; i<brandList.length; i++) {
				System.out.println( i+1 + " - " + brandList[i]);
			}
			System.out.print("Marka Se�iniz: ");
			int brandId = sc.nextInt();
			
			List<Phone> phoneListByBrandId = new ArrayList<Phone>();
			
			for (Phone p : Phone.phoneList) {
				if (p.getBrandId() == brandId ) {
					phoneListByBrandId.add(p);
				}
			}
			
			System.out.printf("%-6s%-20s%-10s%-6s%10s%10s%10s \n","ID", "�r�n Ad�", "Marka", "Fiyat", "Depolama", "Ekran", "RAM");
			for(Phone p : phoneListByBrandId) {
				System.out.printf("%-6s%-20s%-10s%-6s%10s%10s%10s \n",p.getId(), p.getName(), p.getBrandId(), p.getPrice(), p.getMemory(), p.getScreenSize(), p.getRam());
			}
			
			break;
		}
		case 5: {
			// Id'ye g�re telefon getir
			System.out.println("--------------------");
			System.out.print("Telefonun Id: ");
			int phoneId = sc.nextInt();
			
			for (Phone p : Phone.phoneList) {
				if (p.getId() == phoneId ) {
					System.out.printf("%-6s%-20s%-10s%-6s%10s%10s%10s \n","ID", "�r�n Ad�", "Marka", "Fiyat", "Depolama", "Ekran", "RAM");
					System.out.printf("%-6s%-20s%-10s%-6s%10s%10s%10s \n",p.getId(), p.getName(), p.getBrandId(), p.getPrice(), p.getMemory(), p.getScreenSize(), p.getRam());
					break;
				}
			}
			break;
		}
		case 6: {
			System.out.println("�yi g�nler");
			break;
		}
		default:
			System.out.println("L�tfen ge�erli bir i�lem se�iniz");
			break;
		}
		
	}
	public static List<Phone> defaultPhoneList() {
		List<Phone> defaultList = new ArrayList<Phone>();
		defaultList.add( new Phone(1, 7000, 10, 10, "SAMSUNG GALAXY A51", 5, 16, 14, 1, "128 GB", 4000, "Beyaz") );
		defaultList.add( new Phone(2, 3699, 10, 120, "IPhone 11 64 GB", 1, 8, 14, 1, "256 GB", 3600, "Siyah") );
		defaultList.add( new Phone(3, 8199, 10, 10, "Redmi Note 10 Pro 8GB", 8, 32, 16, 1, "512 GB", 3200, "K�rm�z�") );
		
		return defaultList;
		
	}
	
	// ----------------------------NOTEBOOK i�LEMLER�-----------------------------------------
	
		public static void notebookOperations() {
			System.out.println("1 - Notebooklar� Listele");
			System.out.println("2 - Notebook Ekle");
			System.out.println("3 - Notebook Sil");
			System.out.println("4 - Markaya g�re listele");
			System.out.println("5 - Id'ye g�re listele");
			System.out.println("6 - ��k�� yap");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("��leminiz: ");
			int operation = sc.nextInt();
			
			NoteBook.notebookList = defaultNotebookList();
			
			switch (operation) {
			case 1: {
				NoteBook.listNotebooks();
				break;
			}
			case 2: {
				// Notebook ekle
				System.out.print("1 - Notebook Id: ");
				int noteId = sc.nextInt();
				
				System.out.print("2 - Notebook Fiyat�: ");
				int price = sc.nextInt();
				
				System.out.print("3 - �ndirim Oran�: ");
				int discount = sc.nextInt();
				
				System.out.print("4 - Stok adedi: ");
				int stockAmount = sc.nextInt();
				
				System.out.print("5 - Notebook �smi: ");
				String name = sc.next();
				
				System.out.print("6 - Notebook Marka Id: ");
				int brandId = sc.nextInt();
				
				System.out.print("7 - Ram(GB): ");
				int ram = sc.nextInt();
				
				System.out.print("8 - Ekran Boyutu(in�): ");
				int screenSize = sc.nextInt();
				
				System.out.print("9 - Depolama(GB): ");
				String memory = sc.next();
				
				
				NoteBook notebook = new NoteBook(noteId, price, discount, stockAmount, name, brandId, ram, screenSize, 2 ,memory);
				
				NoteBook.notebookList.add(notebook);
				System.out.println("----------------------��lem Ba�ar�l�----------------------");
				NoteBook.listNotebooks();
				break;
				
			}
			case 3: {
				// Notebook Sil
				System.out.print("Silinecek notebook id'si: ");
				int id= sc.nextInt();
				NoteBook.notebookList.remove(id-1);
				System.out.println("----------��lem Ba�ar�l�----------");
				NoteBook.listNotebooks();
				
				break;
			}
			case 4: {
				// Markaya g�re listele
				System.out.println("------------------");
				String[] brandList = Brand.brandList; 
				Arrays.sort(brandList);
				
				for (int i = 0; i<brandList.length; i++) {
					System.out.println( i+1 + " - " + brandList[i]);
				}
				System.out.print("Marka Se�iniz: ");
				int brandId = sc.nextInt();
				
				List<NoteBook> noteBooksListByBrandId = new ArrayList<NoteBook>();
				
				for (NoteBook p : NoteBook.notebookList) {
					if (p.getBrandId() == brandId ) {
						noteBooksListByBrandId.add(p);
					}
				}
				
				System.out.printf("%-6s%-20s%-10s%-6s%10s%10s%10s \n","ID", "�r�n Ad�", "Marka", "Fiyat", "Depolama", "Ekran", "RAM");
				for(NoteBook p : noteBooksListByBrandId) {
					System.out.printf("%-6s%-20s%-10s%-6s%10s%10s%10s \n",p.getId(), p.getName(), p.getBrandId(), p.getPrice(), p.getStorage(), p.getScreenSize(), p.getRam());
				}
				
				break;
			}
			case 5: {
				// Id'ye g�re notebook getir
				System.out.println("--------------------");
				System.out.print("Notebook Id: ");
				int notebookId = sc.nextInt();
				
				for (NoteBook p : NoteBook.notebookList) {
					if (p.getId() == notebookId ) {
						System.out.printf("%-6s%-20s%-10s%-6s%10s%10s%10s \n","ID", "�r�n Ad�", "Marka", "Fiyat", "Depolama", "Ekran", "RAM");
						System.out.printf("%-6s%-20s%-10s%-6s%10s%10s%10s \n",p.getId(), p.getName(), p.getBrandId(), p.getPrice(), p.getStorage(), p.getScreenSize(), p.getRam());
						break;
					}
				}
				break;
			}
			case 6: {
				System.out.println("�yi g�nler");
				break;
			}
			default:
				System.out.println("L�tfen ge�erli bir i�lem se�iniz");
				break;
			}
			
		}
	
	
		public static List<NoteBook> defaultNotebookList() {
			List<NoteBook> defaultList = new ArrayList<NoteBook>();
			defaultList.add( new NoteBook(1, 3199, 10, 120000, "HUAWEI Matebook 14", 5,16,14, 2, "512 SSD") );
			defaultList.add( new NoteBook(2, 5166, 10, 20000, "LENOVO V14 IGL", 6,8,15, 2, "256 SSD") );
			defaultList.add( new NoteBook(3, 4512, 20, 6000, "ASUS Tuf Gaming", 2,32,15, 2, "512 SSD") );
			
			return defaultList;
			
		}
	
}
