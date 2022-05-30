package OnlineBankSystem.entity;

public class Customer {

	private String identityNumber;
	
	private String password;
	
	private String accountNumber;
	
	private double money;
	
	private double cardDebt;
	
	private double creditDebt;
	
	public Customer(String identityNumber, String password, String accountNumber, double money, double cardDebt, double creditDebt) {
		super();
		this.identityNumber = identityNumber;
		this.password = password;
		this.accountNumber = accountNumber;
		this.setMoney(money);
		this.cardDebt = cardDebt;
		this.creditDebt = creditDebt;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getCardDebt() {
		return cardDebt;
	}

	public void setCardDebt(double cardDebt) {
		this.cardDebt = cardDebt;
	}

	public double getCreditDebt() {
		return creditDebt;
	}

	public void setCreditDebt(double creditDebt) {
		this.creditDebt = creditDebt;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	

	
}
