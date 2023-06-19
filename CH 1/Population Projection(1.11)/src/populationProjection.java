
public class populationProjection {

	public static void main(String[] args) {
		double birth = 7.0;
		double death = 13.0;
		double immigrant = 45.0;
		
		double population = 312032486;
		double secondsPerYear = (60 * 60 * 24 * 365);
		
		double numBirths = secondsPerYear / birth;
		double numDeath =  secondsPerYear / death;
		double numImmigrant = secondsPerYear / immigrant;
		
		for (int i = 1; i <= 5; i++) {
			population += numBirths - numDeath + numImmigrant;
			System.out.println("Population for year " + i + " = " + population);
		}
		

	}

}
