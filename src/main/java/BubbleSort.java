package main.java;


/**
 Bubble sort
 Best and Worst time complexity: O(n) - O(n^2)
 Space complexity: O(1)
 */
public class BubbleSort {

    public static void sort (int[] numbers) {
        //first loop
        for (int first = 1; first < numbers.length; first++) {
            //inner loop
            for (int second = 0; second < first; second++) {

                //Swap numbers if needed
                if (numbers[first] < numbers[second]) {
                    int temp = numbers[first];
                    numbers[first] = numbers[second];
                    numbers[second] = temp;
                }
            }
        }

    }

}
