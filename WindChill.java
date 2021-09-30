package CoreJavaProblem;
import java.util.Scanner;

public class WindChill {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Temperature(in Fahrenheit)");
		double temperature = scanner.nextDouble();
		System.out.println("Enter Wind Speed(in miles per Hour)");
		double windSpeed = scanner.nextDouble();
		double windChill;
		windChill = 35.74 + (0.6215 * temperature) + (((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16));
		System.out.println("The WindChill value is :" + windChill);
	}
}



