package sorting;

import utils.AlgoUtils;

public class ShellSort {
    public static void sort(int[] array) {
        // loop over the gaps
        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            // do the insertion sort
            for (int i = gap; i < array.length; i++) {
                int val = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > val; j -= gap) {
                    AlgoUtils.print(array);
                    array[j] = array[j - gap];
                    System.out.println();
                }
                array[j] = val;
            }
        }
    }
}