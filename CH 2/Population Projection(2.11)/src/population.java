import java.util.Scanner;

public class population {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int currentPopulation = 312032486;
		
		System.out.print("Enter the number of years: ");
		int numYear = input.nextInt();
		
		double secInYear = 365 * 24 * 60 * 60;
		
		int birthPerYear = (int)secInYear / 7;
		int deathPerYear = (int)secInYear / 13;
		int immigrantPerYear = (int)secInYear / 45;
		
		for (int i = 1; i <= numYear; i++) {
			currentPopulation += birthPerYear + immigrantPerYear - deathPerYear;
		}
		
		System.out.println("The population in " + numYear + " years is " + currentPopulation);

	}

}
