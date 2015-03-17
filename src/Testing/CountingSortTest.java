package Testing;

import org.junit.Test;
import sorting.CountingSort;
import utils.AlgoUtils;

import java.util.Random;

/**
 * Created by oleg on 28.02.15.
 */
public class CountingSortTest {

    @Test
    public void countingSortTest() {
        for (int i=0; i < 100; ++i) {
            System.gc();
            int ar[] = AlgoUtils.generateArray(100, 99);
            CountingSort.sort(ar);
            boolean sorted = AlgoUtils.checkIfSorted(ar);
            AlgoUtils.print(ar);
            assert (sorted == true);
        }
    }
}
