package Testing;


import org.junit.Test;
import sorting.QuickSort;
import utils.AlgoUtils;

import java.util.Random;

public class QuickSortTest {
    @Test
    public void testQuickSort() {
        Random random = new Random();
        QuickSort quickSort = new QuickSort();
        for (int i=0; i < 100; ++i) {
            System.gc();
            int ar[] = AlgoUtils.generateArray(10000, random.nextInt(999999));
            quickSort.sort(ar);
            boolean sorted = AlgoUtils.checkIfSorted(ar);
            assert (sorted == true);
        }
    }
}
