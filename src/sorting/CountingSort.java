package sorting;

import java.util.Map;
import java.util.TreeMap;

public class CountingSort {

    public static void sort(int ar[]) {
        // map for storing buckets
        Map<Integer, Integer> integerMap = new TreeMap<>();

        Integer count = 0;

        // count occurrences of every elem in the array and put
        // elem as key int the map, and the counter of elem as a value
        for (Integer i : ar) {
            // get count of the elem
            count = integerMap.get(i);
            if (count != null)
                // increment count of the elem
                integerMap.put(i, count + 1);
            else {
                // elem is not yet in the map, out it in with default value
                integerMap.put(i, 1);
            }
        }

        // current index of the array
        int index = 0;
        // `unwrap` the map with buckets.
        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); ++i) {
                // put the every key from buckets into array times value
                ar[index] = entry.getKey();
                index++;
            }
        }



    }

}
