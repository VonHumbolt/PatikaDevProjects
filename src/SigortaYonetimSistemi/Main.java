package SigortaYonetimSistemi;

import SigortaYonetimSistemi.business.AccountManager;
import SigortaYonetimSistemi.exceptions.InvalidAuthenticationException;

public class Main {

	public static void main(String[] args) {
		
		AccountManager manager = new AccountManager();
		
		try {
			UserInput userInput = new UserInput(manager);
		} catch (InvalidAuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
