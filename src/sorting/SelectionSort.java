package sorting;

import utils.AlgoUtils;

/**
 * Select the first elem as the minimum one. (start the wrapper loop from one, not from 0).
 * Go through every else element and if an elem is less then current min,
 * select new elem is currentMin
 * after the inner loop ended, swap the first elem with the current min.
 *
 * Select the second elem. Repeat.
 */
public class SelectionSort {

    public static void sort(int[] ar) {
        int min = -1;
        int start;

        for (int i=1; i<ar.length; ++i) {
            min = i-1;

            for (start = i; start<ar.length; ++start) {
                if (ar[min] > ar[start]) {
                    min = start;
                }
            }

            AlgoUtils.swap(ar, i-1, min);
        }
    }

}
