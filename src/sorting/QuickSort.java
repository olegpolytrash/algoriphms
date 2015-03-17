package sorting;

import utils.AlgoUtils;

/**
 * Best case - average - worst
 * n log n - n log n - n^2
 *
 * the main idea is not to sort right away, but to split the array in 2 ranges and move big values
 * to the right and low values to the left. It's not even sorting per se, but it's more like moving
 * variables. The value is big if it's bigger then the middle values of the range. Same for small.
 * After all values are moved in the first range, do the same routine for the range that is on the left
 * (from middle) and to the right. And so on.
 *
 * For every range variables i and k are define. I is an index that is used to find big values, j -
 * small values. I is initialized with start range index, j with end index.
 * I is incremented until it reached the middle of the range or until it found a
 * big value, j is decremented until a small values is found.
 * If I == J then start working with smaller sub-ranges.
 */
public class QuickSort {
    private int array[];
    private int length;

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];

        // Divide into two arrays
        while (i <= j) {
            //System.out.println("pivot " + pivot);
            // find the first number bigger then pivot ( it ar[i] < pivot, then move on)
            // i won't go past the pivot(inclusive), it will return false on comparison with pivot
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            // delete if - error
            // make it i < j - infinite loop
            if (i <= j) {
                // swap values
                exchangeNumbers(i, j);

                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String a[]){

        QuickSort sorter = new QuickSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
