package sorting;

import utils.AlgoUtils;

/**
 * best - n
 * worst - n^2
 * average - n^2
 */
public class BubbleSort {

    static public void sort(int[] ar) {
        // define bounds

        // -1 to make upperBound an index of the last elem.
        // Basically convert it from size-type value to index-type values
        int upperBound = ar.length - 1;
        // index to the first elem
        int lowerBound = 0;

        boolean swapHappened = false;

        // lower bound always stays at 0. Upper bound decremented on every loop run, since
        // even in the worst case one loop run guarantees that the last elem is the biggest one.
        for (; lowerBound != upperBound; upperBound--, swapHappened = false) {
            // go from start to upperBound, do swaps if needed
            // even though upperBound is an index, and it might seam that <= should be used,
            // the < sign must be used because in the bode of the loop i and i+1 are compared.
            for (int i = lowerBound; i < upperBound; ++i) {
                if (ar[i] > ar[i + 1]) {
                    AlgoUtils.swap(ar, i, i + 1);
                    swapHappened = true;
                }
            }

            // if no swaps happened - array is sorted
            if (!swapHappened) {
                break;
            }
        }

    }

}
