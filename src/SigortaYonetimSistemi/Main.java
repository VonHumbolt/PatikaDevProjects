package SigortaYonetimSistemi;

import SigortaYonetimSistemi.business.AccountManager;

public class Main {

	public static void main(String[] args) {
		
		AccountManager manager = new AccountManager();
		
		UserInput userInput = new UserInput(manager);
		
		
	}
}
