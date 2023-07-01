package main.java;

//Collection of sorting algorithms, more will be added in the future
public class BubbleSort {


    /**
        Bubble sort
        Best and Worst time complexity: O(n) - O(n^2)
        Space complexity: O(1)
     */
    public static void sort (int[] numbers) {

        for (int first = 1; first < numbers.length; first++) {
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
