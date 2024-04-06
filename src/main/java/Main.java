package main.java;

public class Main {
    public static void main(String[] args) {

        int[][] intArrays = {
                {},
                {1,2,5,3,1,7,9,1,12,83,1,5,3,2},
                {1,2,-5,3,-1,7,9,1,12,83,-21,5,3,2},
                {1,1,1,1,1,1,1,2,1,1,1},
                {2,2,2,2},
                {1,2},
                {2,1}
        };

        for(int[] array : intArrays) {
//            BubbleSort.sort(array);
            SelectionSort.sort(array);
        }

    }
}
