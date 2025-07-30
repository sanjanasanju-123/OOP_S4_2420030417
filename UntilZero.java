package controlstatements;

import java.util.Scanner;

public class UntilZero {

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			int num;

			do {
			    num = sc.nextInt();
			} while(num!=0);
		}

	}

}
