package Testing;

import org.junit.Test;
import sorting.QuickSort;
import sorting.RadixSort;
import utils.AlgoUtils;

import java.util.Random;

/**
 * Created by oleg on 27.02.15.
 */
public class RadixSortTest {

    @Test
    public void radixTest() {
        Random random = new Random();
        RadixSort radixSort = new RadixSort();
        for (int i=0; i < 1000; ++i) {
            radixSort = new RadixSort();
//            System.gc();
            int ar[] = AlgoUtils.generateArray(100, 999);
            //int ar[] = new int[]{10,9,8,7,6,5,4,3,2,1};
            ar = radixSort.sort(ar);
            boolean sorted = AlgoUtils.checkIfSorted(ar);

            //if (!sorted) {
                AlgoUtils.print(ar);
            System.out.println();
            //}

            assert (sorted == true);
        }
    }

    @Test
    public void getRadixTest() {
        RadixSort radixSort = new RadixSort();

        radixSort.currentRadix = 1;
        int res = radixSort.getRadix(1);
        assert  res == 1;

        radixSort.currentRadix = 2;
        res = radixSort.getRadix(1);
        assert  res == -1;

        radixSort.currentRadix = 2;
        res = radixSort.getRadix(11);
        assert  res == 1;

        radixSort.currentRadix = 2;
        res = radixSort.getRadix(10);
        assert  res == 1;

        radixSort.currentRadix = 4;
        res = radixSort.getRadix(10);
        assert  res == -1;
    }

}
