package CoreJavaProblem;
import java.util.Scanner;
public class FlipCoin {
			public static void main(String[] args) {
				int headsCount = 0;
				int tailsCount = 0;
				int counter=1;
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Number of Times you want to Flip coin :");
				int noOfFlips = scanner.nextInt();
				scanner.close();
				while(counter <= noOfFlips)
				{
					counter++;	
					double random = Math.random();
					if(random < 0.5)
						tailsCount++;
					else
						headsCount++;
				}
				System.out.println("Number of Times Heads comes :" + headsCount);
				System.out.println("Number of Times Tails comes :" + tailsCount);
				double tailsPercentage = (double)tailsCount / noOfFlips * 100;
				double headsPercentage = (double)headsCount / noOfFlips * 100;
				System.out.println("Heads Percentage is :" + headsPercentage);
				System.out.println("Tails Percentage is :" + tailsPercentage);
			}
		}

