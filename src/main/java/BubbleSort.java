package main.java;


import java.util.Arrays;

/**
 Bubble sort
 Time complexity: O(n^2)
 Space complexity: O(1)
 This is a stable sort (the order of duplicates will be preserved)
 */
public class BubbleSort {

    public static void sort (int[] numbers) {
        System.out.println("\nBefore bubble sort: " + Arrays.toString(numbers));

        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, i+1);
                }
            }
        }
        System.out.println("After bubble sort: " + Arrays.toString(numbers));
    }

    private static void swap (int[] array, int i, int j) {
        if (i == j)
            return;

        int temp = array [i];
        array[i] = array[j];
        array[j] = temp;
    }

}
