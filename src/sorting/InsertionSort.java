package sorting;

import utils.AlgoUtils;

/**
 * It's something like the limited inverse bubble sort.
 * Loop goes from start to the end of the array.
 * for every elem we run a second loop in which we compare current elem
 * with the previous one, and swap them if needed. If swap is not needed, immediately break the loop,
 * because the main point of this algo is to place every elem in the right position to it's next
 * elem (so the elem we just moved makes the elem
 * to the left in the right pos to the elem we just moved).
 * Even if the previous elem is not in the right position, during the next iterations
 * the algo will place the correct elem before it.
 */
public class InsertionSort {

    public static void sort(int[] ar) {

        for (int i=0; i<ar.length; ++i) {
            // compare current elem with the previous ones
            // and swap them.
            for (int j=i; j>0; --j) {
                if (ar[j] < ar[j-1]) {
                    AlgoUtils.swap(ar, j, j-1);
                } else {
                    // if swap is not needed, break the loop
                    break;
                }
            }

        }

    }

}
