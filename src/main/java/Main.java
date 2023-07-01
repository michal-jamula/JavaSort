package main.java;

import java.util.Arrays;

/*
    Michal Jamula
    1/07/23
 */
public class Main {
    public static void main(String[] args) {

        int[][] intArrays = {
                {},
                {1,2,5,3,1,7,9,1,12,83,1,5,3,2},
                {1,1,1,1,1,1,1,2,1,1,1},
                {2,2,2,2},
                {1,2},
                {2,1}
        };

        for(int[] array : intArrays) {
            testBubbleSort(array);
        }

    }

    static void testBubbleSort (int[] intArray) {
        System.out.println("\nArray before sorting: " + Arrays.toString(intArray));
        BubbleSort.sort(intArray);
        System.out.println("Array after sorting: " + Arrays.toString(intArray));
    }
}
