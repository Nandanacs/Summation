import java.util.Scanner;
public class Digit {
	public static void main(String [] args){
		int sum=0;
		Scanner r =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=r.nextInt();
		 while (number != 0) {
	            // Extract the last digit of the number
	            int digits = number % 10;

	            // Add the digit to the sum
	            sum += digits;

	            // Remove the last digit from the number
	             number/= 10;
		}
		System.out.println("The sum is :" +sum);
	}

}
