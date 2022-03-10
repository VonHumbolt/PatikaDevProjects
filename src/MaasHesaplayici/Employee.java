package MaasHesaplayici;

public class Employee {
	
	String name;
	int workHours;
	int hireYear;
	double salary;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	double taxt() {
		if (this.salary < 1000 ) {
			return 0;
			
		}	
		return (double) this.salary * 0.03;	
		
	}	
	
	int bonus() {
		if (this.workHours > 40) {
			return (this.workHours - 40) * 30;
		}
		return 0;
	}
	
	double raiseSalary() {
		int workYear = 2021 - this.hireYear; 
		
		if (workYear > 9 && workYear < 20) {
			return this.salary * 0.10;
		}
		else if (workYear > 19) {
			return this.salary * 0.15;
		}
		else {
			return this.salary * 0.05;
		}
	}
	
	void info() {
		System.out.println("Adý: " + this.name);
		System.out.println("Maaþý: " + this.salary);
		System.out.println("Çalýþma Saati: " + this.workHours);
		System.out.println("Baþlangýç Yýlý: " + this.hireYear);
		System.out.println("Vergi: " + this.taxt());
		System.out.println("Bonus: " + this.bonus());
		System.out.println("Maaþ Artýþý: " + this.raiseSalary());
		System.out.println("Vergi ve Bonuslar Ýle birlikte maaþ: " + (this.salary + this.bonus() - this.taxt()));
		System.out.println("Toplam Maaþ: " + (this.salary + this.raiseSalary()));
	}
}
