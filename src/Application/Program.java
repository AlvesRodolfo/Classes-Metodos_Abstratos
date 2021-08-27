package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int number = sc.nextInt();
		
		
		for(int i = 1;i<=number;i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.printf("Anual Income: ");
			double anualIncome = sc.nextDouble();
			
			if (resp == 'i') {
				System.out.printf("Health Expenditures: ");
				double healtExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healtExpenditures));
			}
			else {
				System.out.printf("Number of Employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, anualIncome, employees));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;
		for(TaxPayer t: list) {
			System.out.println(t.getName() + ": $ " + String.format("%.2f", t.tax()));
			sum += t.tax();
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();

	}

}
