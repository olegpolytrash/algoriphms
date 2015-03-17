package Testing;

import org.junit.Test;
import sorting.BubbleSort;
import utils.AlgoUtils;

import java.util.Random;

public class BubbleSortTest {

    @Test
    public void testBubble() {
        Random random = new Random();
        for (int i=0; i < 500; ++i) {
            System.gc();
            int ar[] = AlgoUtils.generateArray(random.nextInt(10000), random.nextInt(999999));
            BubbleSort.sort(ar);
            boolean sorted = AlgoUtils.checkIfSorted(ar);

            try {
                assert (sorted == true);
            } catch (AssertionError ae) {
                AlgoUtils.print(ar);
                throw ae;
            }
        }
    }


}
