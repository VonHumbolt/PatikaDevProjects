package SigortaYonetimSistemi.business;

import java.util.TreeSet;

import SigortaYonetimSistemi.entities.abstracts.Account;

public class AccountManager {
	
	private TreeSet<Account> set;
	
	public AccountManager() {
		
		this.set = new TreeSet<Account>();
	}
	
	public Account login(String email, String password) {
		
		for (Account a : set) {
			if (a.getUser().getEmail() == email && a.getUser().getPassword() == password) {
				try {
					a.login(email, password);
					return a;

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		return null;
	}
	
}
