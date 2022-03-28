package SigortaYonetimSistemi.entities.concretes;

import SigortaYonetimSistemi.entities.abstracts.Account;

public class Enterprise extends Account {

	@Override
	public void addInsurancePolicy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return this.getUser().getEmail().compareTo(o.getUser().getEmail());
	}

}
