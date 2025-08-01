package arrays;
import java.util.Scanner;

public class SearchingElement {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int[] elements = {10, 20, 30, 40, 50};
		        System.out.print("Enter the element to search: ");
		        int target = scanner.nextInt();
		        boolean found = false;

		        for (int i = 0; i < elements.length; i++) {
		            if (elements[i] == target) {
		                found = true;
		                System.out.println("Element found at index " + i);
		                break;
		            }
		        }

		        if (!found) {
		            System.out.println("Element not found.");
		        }

		        scanner.close();
		    }
		


	}


