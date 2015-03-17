package Testing;

import org.junit.Test;
import sorting.InsertionSort;
import utils.AlgoUtils;

import java.util.Random;

public class InsertionSortTest {
    @Test
    public void selectionSortTest() {
        Random random = new Random();
        for (int i=0; i < 500; ++i) {
            // System.gc();
            int ar[] = AlgoUtils.generateArray(10000, 99999);
            InsertionSort.sort(ar);
            boolean sorted = AlgoUtils.checkIfSorted(ar);
            assert (sorted == true);
        }
    }
}
