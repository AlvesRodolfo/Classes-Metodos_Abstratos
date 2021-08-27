package Entities;

public class Individual extends TaxPayer{
	
	private double healthExpenditures;
	
	public Individual() {
		
	}

	public Individual(String name, Double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}



	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		//expressão condicional ternaria: se xxxx ? então fee recebe : caso contrario fee recebe
		// double fee = (getAnualIncome() < 20000) ? (getAnualIncome() * 0.15) : (getAnualIncome() * 0.25)
		
		double fee = 0.0;
		
		if(getAnualIncome() < 20000) {
			fee = (getAnualIncome() * 0.15) - (healthExpenditures*0.5);
		}
		else {
			
			fee = (getAnualIncome() * 0.25) - (healthExpenditures*0.5);
			
		}
		if(fee < 0.0) {
			fee = 0.0;
		}
		return fee;
	}

}
