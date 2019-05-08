package co.grandcircus;

import java.util.Scanner;

public class CountriesApp {
	public static void main(String[] args) {
		Country main = new Country();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Countries Maintenance Application");
		int userEntry = -1;
		
		CountriesTextFile.createDir("countries");
		CountriesTextFile.createMyFile("countries");

		while (userEntry != 3) {
			main.printMenu();
			userEntry = Validator.getInt(sc, "\nEnter menu number: ", 1, 3);
			if (userEntry == 1) {
				System.out.println();
				CountriesTextFile.readMyFile();
				System.out.println();
			} else if (userEntry == 2) {
				String name = Validator.getString(sc, "Enter country: ");
				int pop = Validator.getInt(sc, "Enter population: ");
				Country newCountry = new Country(name, pop);
				CountriesTextFile.writeMyFile(newCountry);

			} else {
				break;
			}
		}

		System.out.println("\nBuh-bye!");
		sc.close();
	}

}
