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
		// Password doðum tarihi mi kontrol edelim 
		for (int i = 0; i<= password.length() - 1; i++) {
			
			if (Character.isDigit(password.charAt(i))) {
				count++;
			} else
				count = 0;
			
		}
		if (count >= 4) 
			System.out.println("Þifre doðum tarihi olamaz");
		
		else {
			// json dosyasýna ekle kullanýcýyý
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
		
		// Eðer kullanýcýnýn verileri json da varsa git onlarý doðrula 
		// Read json
		boolean isLoginSuccess = true;
		
		JSONArray customerList = readJson();
		
		if (customerList.size() == 0) {
			System.out.println("Veritabaný boþ!");
			isLoginSuccess = false;
		} else {
			customerList.stream().forEach(customer -> {
				JSONObject c = (JSONObject) customer;
				if ( c.get("identityNumber").equals(identityNumber) && c.get("password").equals(password)) {
					
					System.out.println("Giriþ baþarýlý! Hoþgeldiniz.");
					
				}
				else
					System.out.println("Þifre veya Kimlik numarasý hatalý");
					
			});
			
		}
		return isLoginSuccess;
	}
	
	@SuppressWarnings("unchecked")
	public void moneyTransfer(String fromAccount, String toAccount, double money) {
		JSONArray customerDb = readJson(); // Json dosyasýný oku
		
		if (customerDb.size() == 0) {
			System.out.println("Veritabaný boþ!");
		} else {
			customerDb.stream().forEach(customer -> {
				JSONObject c = (JSONObject) customer;
				
				if (c.get("identityNumber").equals(fromAccount)) { // Verile identity number var ise devam et
					
					System.out.println("Ýþlem öncesi bakiye : " + c.get("money"));
					System.out.println("Ýþlem sonrasý bakiye : " + ((double) c.get("money") - money));
					
					Customer newCustomer = new Customer( // Kullanýcýnýn parasýný azaltýyoruz transferden dolayý
								(String) c.get("identityNumber"),
								(String) c.get("password"),
								(double) ((double) c.get("money") - money),
								(double) c.get("cardDebt"),
								(double) c.get("creditDebt")
							);
					
					customerList.remove(customer); // Json dosyasýný güncellemek için kullanýcýyý siliyorum!
					
					writeJson(newCustomer); // Parasýný güncel fiyat olarak oluþturduðum kullanýcýyý json a yazýyorum!
					
				}
				
			});
			
			Optional customerFromJson = customerDb.stream().filter(customer -> ((JSONObject) customer).get("identityNumber").equals(toAccount) ).findFirst();
			JSONObject obj = (JSONObject) customerFromJson.get();
			
		}
	}
	
	@SuppressWarnings("unchecked")
	public void payCardDebt(String identityNumber) {
		// Jsondan oku 
		// Borç yoksa borç yok yaz
		// Borç var ise hesapta yeterli para varsa ödeyebilsin!
		
		JSONArray customerDb = readJson(); // Json dosyasýný oku
		
		if (customerDb.size() == 0) {
			System.out.println("Veritabaný boþ!");
		} else {
			customerDb.stream().forEach(customer -> {
				JSONObject c = (JSONObject) customer;
				
				if (c.get("identityNumber").equals(identityNumber)) { // Verilen identity number var ise devam et
					
					if ((double) c.get("cardDebt") == 0) {
						System.out.println("Kard borcunuz bulunmamaktadýr.");
					} else {
						if ( (double) c.get("money") >= (double) c.get("cardDebt")) {
							// Ödeme iþlemini yap
							System.out.println("Borcunuz ödendi!");
							System.out.println("Eski bakiye : " + c.get("money"));
							System.out.println("Yeni bakiye : " + ( (double) c.get("money") - (double) c.get("cardDebt")));
							
							// Kullanýcýyý güncelleyelim !
							Customer newCustomer = new Customer( 
									(String) c.get("identityNumber"),
									(String) c.get("password"),
									(double) ((double) c.get("money") - (double) c.get("cardDebt")),
									(double) 0,
									(double) c.get("creditDebt")
									);
							
							customerList.remove(customer); // Json dosyasýný güncellemek için kullanýcýyý siliyorum!
							writeJson(newCustomer); // Kart borcunu sildiðim kullanýcýyý json a yazýyorum!

						} else {
							System.out.println("Borcunuzu ödemek için yeterli paranýz bulunmamaktadýr.");
						}
					}
					
				}
				
			});
			
		}
		
	
	}
	
	@SuppressWarnings("unchecked")
	public void payDebt(String identityNumber) {
		JSONArray customerDb = readJson(); // Json dosyasýný oku
		
		if (customerDb.size() == 0) {
			System.out.println("Veritabaný boþ!");
		} else {
			customerDb.stream().forEach(customer -> {
				JSONObject c = (JSONObject) customer;
				
				if (c.get("identityNumber").equals(identityNumber)) {
					
					if ((double) c.get("creditDebt") == 0) {
						System.out.println("Kredi borcunuz bulunmamaktadýr.");
					} else {
						if ( (double) c.get("money") >= (double) c.get("creditDebt")) {
							// Ödeme iþlemini yap
							System.out.println("Borcunuz ödendi!");
							System.out.println("Eski bakiye : " + c.get("money"));
							System.out.println("Yeni bakiye : " + ( (double) c.get("money") - (double) c.get("creditDebt")));
							
							// Kullanýcýyý güncelleyelim !
							Customer newCustomer = new Customer( 
									(String) c.get("identityNumber"),
									(String) c.get("password"),
									(double) ((double) c.get("money") - (double) c.get("cardDebt")),
									(double) c.get("cardDebt"),
									(double) 0
									);
							
							customerList.remove(customer); // Json dosyasýný güncellemek için kullanýcýyý siliyorum!
							writeJson(newCustomer); // Kart borcunu sildiðim kullanýcýyý json a yazýyorum!

						} else {
							System.out.println("Borcunuzu ödemek için yeterli paranýz bulunmamaktadýr.");
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
