package arrays;
import java.util.Scanner;

public class SubjectMarks {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int[] marks = new int[6];
		        int total = 0;
		        
		        for (int i = 0; i < marks.length; i++) {
		            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
		            marks[i] = scanner.nextInt();
		            total += marks[i];
		        }

		        double average = total / 6.0;

		        System.out.println("\nMarks for each subject:");
		        for (int i = 0; i < marks.length; i++) {
		            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
		        }
		        System.out.println("Total: " + total);
		        System.out.println("Average: " + average);

		        scanner.close();
		    }
		


	}


