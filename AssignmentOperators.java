package operators;
import java.util.Scanner;

public class AssignmentOperators {

	public static void main(String[] args) {
          
		        try (Scanner sc = new Scanner(System.in)) {
					System.out.println("Enter a number: ");
					int num = sc.nextInt();
					System.out.println("Initial value: " + num);
					num += 5;
					System.out.println("After num += 5: " + num);
					num -= 3;
					System.out.println("After num -= 3: " + num);
					num *= 2;
					System.out.println("After num *= 2: " + num);
					num /= 4;
					System.out.println("After num /= 4: " + num);
					num %= 3;
					System.out.println("After num %= 3: " + num);
      System.out.println("After num %=4: " + num);
				}
            
	}
}


