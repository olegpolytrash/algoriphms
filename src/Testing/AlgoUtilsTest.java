package Testing;

import org.junit.Test;
import utils.AlgoUtils;

/**
 * Created by oleg on 27.02.15.
 */
public class AlgoUtilsTest {

    @Test
    public void testIfSorted() {
        boolean sorted = false;

        int ar[] = new int[]{1,2,3,4,5,6,7,8,9,10};
sorted = AlgoUtils.checkIfSorted(ar);
        assert sorted == true;

        ar= new int[]{10,9,8,7,6,5,4,3,2,1};
        sorted = AlgoUtils.checkIfSorted(ar);
        assert sorted == false;

        ar= new int[]{11,1,111,11111};
        sorted = AlgoUtils.checkIfSorted(ar);
        assert sorted == false;

        ar= new int[]{1,-1,2,3,4,5,6,7,8,9,10};
        sorted = AlgoUtils.checkIfSorted(ar);
        assert sorted == false;

        ar= new int[]{-2,-1,1,2};
        sorted = AlgoUtils.checkIfSorted(ar);
        assert sorted == true;
    }

}
