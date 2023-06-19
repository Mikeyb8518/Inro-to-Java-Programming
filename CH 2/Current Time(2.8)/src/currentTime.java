import java.util.Scanner;

public class currentTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: ");
		long timeChange = input.nextLong();
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = ((totalHours + timeChange) % 24);
		
		System.out.print("The Current time is " + currentHour + ":" + currentMinutes + ":" + currentSecond);

	}

}
