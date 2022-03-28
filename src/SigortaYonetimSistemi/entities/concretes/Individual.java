package SigortaYonetimSistemi.entities.concretes;

import SigortaYonetimSistemi.entities.abstracts.Account;

public class Individual extends Account {

	@Override
	public void addInsurancePolicy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return this.hashCode()-o.hashCode();
	}
	
}
