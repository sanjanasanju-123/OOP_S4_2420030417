package operators;

import java.util.Scanner;

public class ShiftOperators {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a number: ");
			int num =sc.nextInt();
			System.out.print("Enter number of positions to shift: ");
			int shift = sc.nextInt();
			int leftShift = num << shift;
			int rightShift = num >> shift;
			System.out.println("\nOriginal number: "+ num);
			System.out.println("Left Shift (" + num + " << " + shift + ") = " + leftShift);
			System.out.println("Right Shift (" + num + " >> " + shift + ") = " + rightShift);
		} 
         
	}

}
