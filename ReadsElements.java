package arrays;
import java.util.Scanner;

public class ReadsElements {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();

		        int[] numbers = new int[n];

		        System.out.println("Enter " + n + " elements:");

		        for (int i = 0; i < n; i++) {
		            numbers[i] = scanner.nextInt();
		        }

		        System.out.println("You entered:");

		        for (int i = 0; i < n; i++) {
		            System.out.println(numbers[i]);
		        }

		        scanner.close();
		    }
		


	}


