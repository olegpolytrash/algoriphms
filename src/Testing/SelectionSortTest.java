package Testing;

import org.junit.Test;
import sorting.SelectionSort;
import utils.AlgoUtils;

import java.util.Random;

/**
 * Created by oleg on 27.02.15.
 */
public class SelectionSortTest {
    @Test
    public void selectionSortTest() {
        Random random = new Random();
        for (int i=0; i < 500; ++i) {
           // System.gc();
            int ar[] = AlgoUtils.generateArray(10000, 999999);
            SelectionSort.sort(ar);
            boolean sorted = AlgoUtils.checkIfSorted(ar);
            assert (sorted == true);
        }
    }
}
