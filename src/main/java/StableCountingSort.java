package main.java;

import java.util.Arrays;

/**
 * Time complexity: O(n + k)
 * Space complexity: O(k)
 * Stable sort
 * Makes assumptions on the data:
 *      Needs to be positive,
 *      non-discrete values
 *      from a specific range e.g. integers
 * How it works:
 *      Creates a 2nd array and counts how many of each value are in the input array
 *      Using the counts in the temporary array, writes the values in a sorted order to the input array
 * Works best when the range of values is relatively small
 */
public class StableCountingSort {

    public static void sort(int[] numbers) {
        if (numbers.length == 0) {
            return;
        }
        System.out.println("\nBefore counting sort: " + Arrays.toString(numbers));
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        StableCountingSort.sort(numbers, min, max);
        System.out.println("After counting sort: " + Arrays.toString(numbers));

    }

    public static void sort(int[] numbers, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int number : numbers) {
            countArray[number - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while(countArray[i - min] > 0) {
                numbers[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
