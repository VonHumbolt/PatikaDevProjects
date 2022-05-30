package OnlineBankSystem;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.register("1234214213124", "password");
		customerManager.register("523523523", "123");
		
		//customerManager.login("1234214213124", "password");
		
		customerManager.moneyTransfer("1234214213124","523523523", 500);
		
	}

}
