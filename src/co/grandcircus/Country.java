package co.grandcircus;

public class Country {
	private String name;
	private int population;
	
	
	public Country(String name, int population) {
		this.name = name;
		this.population = population;
	}
	public Country() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public void printMenu() {
		System.out.println("1 - See the list of countries");
		System.out.println("2 - Add a country");
		System.out.println("3 - Exit");
	}
	@Override
	public String toString() {
		return String.format("%s (pop %,d) \n", name, population);
	}
	
	

}
