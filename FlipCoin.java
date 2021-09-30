package CoreJavaProblem;
import java.util.Scanner;

public class PrimeFactor {
          public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a Number");
			int number = scanner.nextInt();
			int isPrime = 0;
			int countOne,countTwo;
			for(countOne = 2;(countOne) <= number;countOne++)
			{
				if(number % countOne == 0)			
				{
				isPrime=1;
				for(countTwo = 2;countTwo <= (countOne / 2);countTwo++)		
				{
					if((countOne % countTwo) == 0)		
						isPrime = 0;
				}
				if(isPrime == 1)
					System.out.println("Prime factor is :" + countOne);
			
				}
			}
		}
	}
