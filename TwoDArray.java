package CoreJavaProblem;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Rows and Columns");
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		int array[][] = new int[row][column];
		int i,j;
		for(i=0; i<row; i++)
		{
			for(j=0; j<column; j++)
			{
				System.out.println("Enter element of array");
				int element = scanner.nextInt();
				array[i][j] = element;
			}
		}
		for(i=0; i<row; i++)
		{
			System.out.println();
			for(j=0; j<column; j++)
			{	
				System.out.print(" " + array[i][j]);
			}

		}
	}
}


	


