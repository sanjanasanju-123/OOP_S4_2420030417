package arrays;
import java.util.Arrays;

public class RemovingDuplicates {

	public static void main(String[] args) {
		        int[] elements = {10, 20, 20, 30, 40, 40, 50};
		        Arrays.sort(elements);
		        int[] uniqueElements = new int[elements.length];
		        int uniqueCount = 0;

		        for (int i = 0; i < elements.length; i++) {
		            if (i == 0 || elements[i] != elements[i - 1]) {
		                uniqueElements[uniqueCount++] = elements[i];
		            }
		        }

		        System.out.println("Unique elements: ");
		        for (int i = 0; i < uniqueCount; i++) {
		            System.out.print(uniqueElements[i] + " ");
		        }
		    }
		


	}


