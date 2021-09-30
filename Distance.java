package CoreJavaProblem;
import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x Component");
		int x = scanner.nextInt();
		System.out.println("Enter y Component");
		int y = scanner.nextInt();
		double distance = Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
		System.out.println("The Euclidean distance is :" + distance);
	}
}



