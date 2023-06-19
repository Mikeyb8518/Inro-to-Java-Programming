import java.util.Scanner;

public class numOfYears {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		int mins = input.nextInt();
		 
		int Day = mins / 1440;
		int year = Day / 365;
		int minToDay = (mins / 60 /24) % 365; 
		
		System.out.println(mins + " minutes is approximately " + year + " years and " + minToDay + " Days");
		
		
		
		

	}

}
