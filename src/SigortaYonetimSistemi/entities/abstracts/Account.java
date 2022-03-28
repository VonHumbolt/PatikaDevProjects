package SigortaYonetimSistemi.entities.abstracts;

import java.util.List;
import java.util.Objects;

import SigortaYonetimSistemi.entities.concretes.User;
import SigortaYonetimSistemi.entities.enums.AuthenticationStatus;
import SigortaYonetimSistemi.exceptions.InvalidAuthenticationException;

public abstract class Account implements Comparable<Account> {

	private User user;
	
	List<Insurance> insuranceList;
	
	public AuthenticationStatus status;
	
	public void login(String email, String password) throws InvalidAuthenticationException {
		if (email == user.getEmail() && password == user.getPassword()) {
			status = AuthenticationStatus.SUCCESS;
		} else {
			throw new InvalidAuthenticationException("Kullanýcý adý veya þifre hatalý !");
		}
	}
	
	public void addAddress(Address address) {
		user.addressList.add(address);
	}
	
	public void removeAddress(Address address) {
		user.addressList.remove(address);
	}
	
	public AuthenticationStatus isLogin() {
		return status;
	}
	
	public abstract void addInsurancePolicy();
	
	final public void showUserInfo() {
		// Müþteri bilgilerini bastýr
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if ( obj == null || getClass() != obj.getClass()) return false;
		
		Account account = (Account) obj;
		
		return Objects.equals(this.user.getEmail(), account.getUser().getEmail()) &&
				Objects.equals(this.user.getPassword(), account.getUser().getPassword());
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return user.getEmail().hashCode();
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
