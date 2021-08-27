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
		double fee = 0.0;
		
		if(super.getAnualIncome() < 20000) {
			fee = (super.getAnualIncome() * 0.15) - (healthExpenditures*0.5);
		}
		else {
			
			fee = (super.getAnualIncome() * 0.25) - (healthExpenditures*0.5);
			
		}
		return fee;
	}

}
