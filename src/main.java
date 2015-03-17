import sorting.BubbleSort;
import utils.AlgoUtils;

public class main {

    static public int[] ar = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

    public static void main(String[] args) {
        AlgoUtils.print(ar);

        System.out.println();

        BubbleSort bs = new BubbleSort();
        bs.sort(ar);

    }

}
