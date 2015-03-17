package Testing;

import org.junit.Test;
import sorting.HeapSort;
import utils.AlgoUtils;

public class HeapSortTest {

    @Test
    public void heapSortTest() {
        for (int i=0; i < 10000; ++i) {
            Integer ar[] = AlgoUtils.generateArrayObject(10000, 99999);
            HeapSort.heapsort(ar);
            boolean sorted = AlgoUtils.checkIfSorted(ar);
            assert (sorted == true);
        }
    }

}
