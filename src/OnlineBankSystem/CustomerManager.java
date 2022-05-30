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
	
	public void register(String identityNumber, String password) {
		int count = 0;
		// Password do�um tarihi mi kontrol edelim 
		for (int i = 0; i<= password.length() - 1; i++) {
			
			if (Character.isDigit(password.charAt(i))) {
				count++;
			} else
				count = 0;
			
		}
		if (count == 4) 
			System.out.println("�ifre do�um tarihi olamaz");
		
		else {
			// json dosyas�na ekle kullan�c�y�
			Customer customer = new Customer(
						identityNumber,
						password,
						getRandomAccountNumber(),
						1500,
						0,
						0
					);
			
			//First Employee
			writeJson(customer);
			
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void login(String identityNumber, String password) {
		
		// E�er kullan�c�n�n verileri json da varsa git onlar� do�rula 
		// Read json
		JSONArray customerList = readJson();
		
		if (customerList.size() == 0) {
			System.out.println("Veritaban� bo�!");
		} else {
			customerList.stream().forEach(customer -> {
				JSONObject c = (JSONObject) customer;
				if ( c.get("identityNumber").equals(identityNumber) && c.get("password").equals(password)) {
					
					System.out.println("Giri� ba�ar�l�! Ho�geldiniz.");
					 throw new RuntimeException();
				}
				else
					//System.out.println("�ifre veya Kimlik numaras� hatal�");
					throw new RuntimeException("�ifre veya Kimlik numaras� hatal�");
			});
			
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void moneyTransfer(String fromAccount, String toAccount, double money) {
		JSONArray customerList = readJson();
		
		if (customerList.size() == 0) {
			System.out.println("Veritaban� bo�!");
		} else {
			customerList.stream().forEach(customer -> {
				JSONObject c = (JSONObject) customer;
				
				if (c.get("identityNumber").equals(fromAccount)) {
					
					System.out.println("��lem �ncesi bakiye : " + c.get("money"));
					System.out.println("��lem sonras� bakiye : " + ((double) c.get("money") - money));
					
					Customer newCustomer = new Customer(
								(String) c.get("identityNumber"),
								(String) c.get("password"),
								(String) c.get("accountNumber"),
								(double) ((double) c.get("money") - money),
								(double) c.get("cardDebt"),
								(double) c.get("creditDebt")
							);
					
					//customerList.remove(customer);
					
					writeJson(newCustomer);
					
				}
				
			});
			
			Optional customerFromJson = customerList.stream().filter(customer -> ((JSONObject) customer).get("identityNumber").equals(toAccount) ).findFirst();
			JSONObject obj = (JSONObject) customerFromJson.get();
			System.out.println(fromAccount + " hesab�ndan para transferi al�nd�. Yeni bakiye : " + ((double) obj.get("money") + money));
		}
	}
	
	public void payCardDebt(String accountNumber) {
		// Jsondan oku 
		// Bor� yoksa bor� yok yaz
		// Bor� var ise hesapta yeterli para varsa �deyebilsin!
		
	
	}
	
	public void payDebt(String accountNumber) {
		// Jsondan oku 
				// Bor� yoksa bor� yok yaz
				// Bor� var ise hesapta yeterli para varsa �deyebilsin!
				
	}
	
	private void writeJson(Customer customer) {
		
		JSONObject customerDetails = new JSONObject();
        customerDetails.put("identityNumber", customer.getIdentityNumber());
        customerDetails.put("password", customer.getPassword());
        customerDetails.put("accountNumber", customer.getAccountNumber());
        customerDetails.put("money", customer.getMoney());
        customerDetails.put("cardDebt", customer.getCardDebt());
        customerDetails.put("creditDebt", customer.getCreditDebt());
        
      
//        JSONObject customerObject = new JSONObject(); 
//        customerObject.put("customer", customerDetails);
        
        
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
	
	private static void parseCustomerObject(JSONObject customer) {
		
        String identityNumber = (String) customer.get("identityNumber");
        System.out.println(identityNumber);

        // Get user last name
        String password = (String) customer.get("password");
        System.out.println(password);

        // Get user website name
        String accountNumber = (String) customer.get("accountNumber");
        System.out.println(accountNumber);

    }
	
	// Rsatgele account Number olu�turacak fonksiyon 
	String getRandomAccountNumber() {
		Random random = new Random();
		int number = random.nextInt(99999999);
		
		return String.format("%06d", number);	
	}
}
