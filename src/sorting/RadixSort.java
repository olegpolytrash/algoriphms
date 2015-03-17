package sorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RadixSort {
    List<Queue<Integer>> buckets = new ArrayList<>();

    {
        buckets.add(new LinkedList<Integer>());  // 1
        buckets.add(new LinkedList<Integer>());  // 2
        buckets.add(new LinkedList<Integer>());  // 3
        buckets.add(new LinkedList<Integer>());  // 4
        buckets.add(new LinkedList<Integer>());  // 5
        buckets.add(new LinkedList<Integer>());  // 6
        buckets.add(new LinkedList<Integer>());  // 7
        buckets.add(new LinkedList<Integer>());  // 8
        buckets.add(new LinkedList<Integer>());  // 9
        buckets.add(new LinkedList<Integer>());  // 10
    }

    public int currentRadix = 1;

    public int[] sort(int[] ar) {
        int radix;
        boolean done = false;

        while (done == false) {
            done = true;
            for (int i = 0; i < ar.length; ++i) {
                radix = getRadix(ar[i]);
                if (radix == -1) {
                    buckets.get(0).add(ar[i]);
                } else {
                    buckets.get(radix).add(ar[i]);
                    done = false;
                }
            }

            ar = new int[ar.length];
            int index = 0;

            for (Queue<Integer> queue : buckets) {
                while (queue.peek() != null) {
                    ar[index] = queue.poll();
                    index++;
                }
            }

            currentRadix += 1;
        }

        return ar;
    }

    public int getRadix(int num) {
        int res = 0;

        String numStr = String.valueOf(num);
        try {
            res = Character.getNumericValue(numStr.charAt(numStr.length() - currentRadix));
        } catch (IndexOutOfBoundsException e) {
            res = -1;
        }
        return res;
    }


}
