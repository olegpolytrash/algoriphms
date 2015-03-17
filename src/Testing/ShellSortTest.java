package Testing;

import org.junit.Test;
import sorting.ShellSort;
import utils.AlgoUtils;

public class ShellSortTest {

    @Test
    public void shellSortTest() {
        for (int i=0; i < 1; ++i) {
            int ar[] = AlgoUtils.generateArray(10, 99);
            ShellSort.sort(ar);
            boolean sorted = AlgoUtils.checkIfSorted(ar);
            assert (sorted == true);
        }
    }

}
