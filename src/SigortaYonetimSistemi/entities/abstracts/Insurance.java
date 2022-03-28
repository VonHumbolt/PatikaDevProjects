package SigortaYonetimSistemi.entities.abstracts;

import java.util.Date;


public abstract class Insurance {

	String insuranceName;
	
	public Double price;
	
	Date startDay;
	
	Date finishDay;
	
	
	public abstract void calculate();
}
