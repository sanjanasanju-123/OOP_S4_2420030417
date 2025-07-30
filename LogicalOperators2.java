package operators;
import java.util.Scanner;

public class LogicalOperators2 {
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter true or false for A: ");
		boolean A = sc.nextBoolean();
		System.out.print("Enter true or false for B: ");
		boolean B = sc.nextBoolean();
		System.out.println("A && B = " + (A && B));
		System.out.println("A || B = " + (A || B));
		System.out.println("!A = " + (!A));
		System.out.println("!B = " + (!B));
	}
}


}
