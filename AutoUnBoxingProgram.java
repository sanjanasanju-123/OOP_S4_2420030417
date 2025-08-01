package wrapperclasses;

public class AutoUnBoxingProgram {

	public static void main(String[] args) {
		        Integer boxedInt = 25;
		        Double boxedDouble = 10.5;
		        Character boxedChar = 'A';

		        int unboxedInt = boxedInt;
		        double unboxedDouble = boxedDouble;
		        char unboxedChar = boxedChar;

		        System.out.println("Unboxed Integer: " + unboxedInt);
		        System.out.println("Unboxed Double: " + unboxedDouble);
		        System.out.println("Unboxed Character: " + unboxedChar);
		    }
		


	

}
