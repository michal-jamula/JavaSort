package main.java;

import java.util.Enumeration;

/**
 * Time complexity: O(n) although it could run slower than O(nlogn) mainly depending on:
 *      The range of values (width) that's being sorted (the smaller the better)
 *      The number of variables of the largest array being sorted
 * Stable Algorithm
 * Makes assumptions -
 *      Radix (number of unique digits/values) needs to be the same for all values
 *      Width (number of letters/digits) needs to be the same for all values
 * Usually uses a Stable Counting Sort for sorting
 * In-place depends on which sort algorithm you use
 */
public class RadixSort {

    public static void sort (int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }


    private static void radixSingleSort(int[] input, int position, int radix) {

        int length = input.length;

        int[] countArray = new int[radix];

        for (int num : input) {
            countArray[getDigit(position, num, radix)]++;
        }

        //Adjust the count array to include previous numbers too
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[length];
        for (int k = length - 1; k >= 0; k--) {
            temp[--countArray[getDigit(position, input[k], radix)]] = input[k];
        }

        System.arraycopy(temp, 0, input, 0, length);
    }

    //figure out what's the value of a digit in a given position (e.g. 10s, 100s)
    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
