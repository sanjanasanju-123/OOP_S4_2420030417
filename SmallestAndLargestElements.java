package arrays;

public class SmallestAndLargestElements {
    public static void main(String[] args) {
        int[] elements = {10, 20, 30, 40, 50};
        int min = elements[0];
        int max = elements[0];

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
            if (elements[i] > max) {
                max = elements[i];
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
