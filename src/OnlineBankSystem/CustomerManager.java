package OnlineBankSystem;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import OnlineBankSystem.entity.Customer;

public class CustomerManager {

	private JSONArray customerList;
	private JSONParser jsonParser;
	
	public CustomerManager() {
		customerList = new JSONArray();
		jsonParser = new JSONParser();
	}
	
	public void register(String identityNumber, String password, double money) {
		int count = 0;
		// Password do�um tarihi mi kontrol edelim 
		for (int i = 0; i<= password.length() - 1; i++) {
			
			if (Character.isDigit(password.charAt(i))) {
				count++;
			} else
				count = 0;
			
		}
		if (count >= 4) 
			System.out.println("�ifre do�um tarihi olamaz");
		
		else {
			// json dosyas�na ekle kullan�c�y�
			Customer customer = new Customer(
						identityNumber,
						password,
						money,
						0,
						0
					);
			
			//First Employee
			writeJson(customer);
			
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public boolean login(String identityNumber, String password) {
		
		// E�er kullan�c�n�n verileri json da varsa git onlar� do�rula 
		// Read json
		boolean isLoginSuccess = true;
		
		JSONArray customerList = readJson();
		
		if (customerList.size() == 0) {
			System.out.println("Veritaban� bo�!");
			isLoginSuccess = false;
		} else {
			customerList.stream().forEach(customer -> {
				JSONObject c = (JSONObject) customer;
				if ( c.get("identityNumber").equals(identityNumber) && c.get("password").equals(password)) {
					
					System.out.println("Giri� ba�ar�l�! Ho�geldiniz.");
					
				}
				else
					System.out.println("�ifre veya Kimlik numaras� hatal�");
					
			});
			
		}
		return isLoginSuccess;
	}
	
	@SuppressWarnings("unchecked")
	public void moneyTransfer(String fromAccount, String toAccount, double money) {
		JSONArray customerDb = readJson(); // Json dosyas�n� oku
		
		if (customerDb.size() == 0) {
			System.out.println("Veritaban� bo�!");
		} else {
			customerDb.stream().forEach(customer -> {
				JSONObject c = (JSONObject) customer;
				
				if (c.get("identityNumber").equals(fromAccount)) { // Verile identity number var ise devam et
					
					System.out.println("��lem �ncesi bakiye : " + c.get("money"));
					System.out.println("��lem sonras� bakiye : " + ((double) c.get("money") - money));
					
					Customer newCustomer = new Customer( // Kullan�c�n�n paras�n� azalt�yoruz transferden dolay�
								(String) c.get("identityNumber"),
								(String) c.get("password"),
								(double) ((double) c.get("money") - money),
								(double) c.get("cardDebt"),
								(double) c.get("creditDebt")
							);
					
					customerList.remove(customer); // Json dosyas�n� g�ncellemek i�in kullan�c�y� siliyorum!
					
					writeJson(newCustomer); // Paras�n� g�ncel fiyat olarak olu�turdu�um kullan�c�y� json a yaz�yorum!
					
				}
				
			});
			
			Optional customerFromJson = customerDb.stream().filter(customer -> ((JSONObject) customer).get("identityNumber").equals(toAccount) ).findFirst();
			JSONObject obj = (JSONObject) customerFromJson.get();
			
		}
	}
	
	@SuppressWarnings("unchecked")
	public void payCardDebt(String identityNumber) {
		// Jsondan oku 
		// Bor� yoksa bor� yok yaz
		// Bor� var ise hesapta yeterli para varsa �deyebilsin!
		
		JSONArray customerDb = readJson(); // Json dosyas�n� oku
		
		if (customerDb.size() == 0) {
			System.out.println("Veritaban� bo�!");
		} else {
			customerDb.stream().forEach(customer -> {
				JSONObject c = (JSONObject) customer;
				
				if (c.get("identityNumber").equals(identityNumber)) { // Verilen identity number var ise devam et
					
					if ((double) c.get("cardDebt") == 0) {
						System.out.println("Kard borcunuz bulunmamaktad�r.");
					} else {
						if ( (double) c.get("money") >= (double) c.get("cardDebt")) {
							// �deme i�lemini yap
							System.out.println("Borcunuz �dendi!");
							System.out.println("Eski bakiye : " + c.get("money"));
							System.out.println("Yeni bakiye : " + ( (double) c.get("money") - (double) c.get("cardDebt")));
							
							// Kullan�c�y� g�ncelleyelim !
							Customer newCustomer = new Customer( 
									(String) c.get("identityNumber"),
									(String) c.get("password"),
									(double) ((double) c.get("money") - (double) c.get("cardDebt")),
									(double) 0,
									(double) c.get("creditDebt")
									);
							
							customerList.remove(customer); // Json dosyas�n� g�ncellemek i�in kullan�c�y� siliyorum!
							writeJson(newCustomer); // Kart borcunu sildi�im kullan�c�y� json a yaz�yorum!

						} else {
							System.out.println("Borcunuzu �demek i�in yeterli paran�z bulunmamaktad�r.");
						}
					}
					
				}
				
			});
			
		}
		
	
	}
	
	@SuppressWarnings("unchecked")
	public void payDebt(String identityNumber) {
		JSONArray customerDb = readJson(); // Json dosyas�n� oku
		
		if (customerDb.size() == 0) {
			System.out.println("Veritaban� bo�!");
		} else {
			customerDb.stream().forEach(customer -> {
				JSONObject c = (JSONObject) customer;
				
				if (c.get("identityNumber").equals(identityNumber)) {
					
					if ((double) c.get("creditDebt") == 0) {
						System.out.println("Kredi borcunuz bulunmamaktad�r.");
					} else {
						if ( (double) c.get("money") >= (double) c.get("creditDebt")) {
							// �deme i�lemini yap
							System.out.println("Borcunuz �dendi!");
							System.out.println("Eski bakiye : " + c.get("money"));
							System.out.println("Yeni bakiye : " + ( (double) c.get("money") - (double) c.get("creditDebt")));
							
							// Kullan�c�y� g�ncelleyelim !
							Customer newCustomer = new Customer( 
									(String) c.get("identityNumber"),
									(String) c.get("password"),
									(double) ((double) c.get("money") - (double) c.get("cardDebt")),
									(double) c.get("cardDebt"),
									(double) 0
									);
							
							customerList.remove(customer); // Json dosyas�n� g�ncellemek i�in kullan�c�y� siliyorum!
							writeJson(newCustomer); // Kart borcunu sildi�im kullan�c�y� json a yaz�yorum!

						} else {
							System.out.println("Borcunuzu �demek i�in yeterli paran�z bulunmamaktad�r.");
						}
					}
					
				}
				
			});
			
		}
				
	}
	
	private void writeJson(Customer customer) {
		
		JSONObject customerDetails = new JSONObject();
        customerDetails.put("identityNumber", customer.getIdentityNumber());
        customerDetails.put("password", customer.getPassword());
        customerDetails.put("accountNumber", customer.getAccountNumber());
        customerDetails.put("money", customer.getMoney());
        customerDetails.put("cardDebt", customer.getCardDebt());
        customerDetails.put("creditDebt", customer.getCreditDebt());
        
        
        customerList.add(customerDetails);
        
       
        
        try (FileWriter file = new FileWriter("customers.json")) {
            //We can write any JSONArray or JSONObject instance to the file
        	BufferedWriter buffer = new BufferedWriter(file);
//        	customerList.toJSONString()
            buffer.write(customerList.toJSONString()); 
            buffer.close();
            
            //file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        
	}
	
	private JSONArray readJson() {
		
		JSONArray customerList = new JSONArray();
		
		 try (FileReader reader = new FileReader("customers.json"))
	        {
	            //Read JSON file
	            Object obj =  jsonParser.parse(reader);
	           	            	
	            customerList = (JSONArray) obj;
	            
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		return customerList;
	}
	
	
	
	
}
