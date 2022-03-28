package SigortaYonetimSistemi;

import java.util.Scanner;

import SigortaYonetimSistemi.business.AccountManager;
import SigortaYonetimSistemi.entities.abstracts.Account;
import SigortaYonetimSistemi.exceptions.InvalidAuthenticationException;

public class UserInput {

	Scanner sc;
	
	public UserInput(AccountManager accountManager) throws InvalidAuthenticationException {
		this.sc = new Scanner(System.in);
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Password: ");
		String password = sc.next();
		
		Account a = accountManager.login(email, password);
		
	}
}
