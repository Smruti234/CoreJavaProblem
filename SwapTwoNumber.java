package CoreJavaProblem;
import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {  
	       int x, y, z;// x and y are to swap   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of X and Y");  
	       x = sc.nextInt();  
	       y = sc.nextInt();  
	       System.out.println("before swapping numbers: "+x +"  "+ y);  
	       /*swapping */  
	       z = x;  
	       x = y;  
	       y = z;  
	       System.out.println("After swapping: "+x +"   " + y); 
	    }    
	}  



