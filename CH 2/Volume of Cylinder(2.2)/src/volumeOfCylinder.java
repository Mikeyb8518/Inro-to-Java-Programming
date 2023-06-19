import java.util.Scanner;

public class volumeOfCylinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		int length = input.nextInt();
		
		
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("The area is: " + area);
		System.out.println("The volume is: " + volume + " Meters");

	}

}
