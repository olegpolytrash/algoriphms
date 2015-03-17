package utils;

import java.util.Random;

/**
 * Created by oleg on 26.02.15.
 */
public class AlgoUtils {
    static public void swap(int[] ar, int i1, int i2) {
        int a = ar[i1];
        int b = ar[i2];

        a ^= b;
        b ^= a;
        a ^= b;

        ar[i1] = a;
        ar[i2] = b;
    }

    static public void print(int[] ar) {
        for (int x : ar) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static public void print(Integer[] ar) {
        for (int x : ar) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static public int[] generateArray(int size, int bound) {
        int ar[] = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; ++i) {
            ar[i] = rand.nextInt(bound) + 1;
        }

        return ar;
    }

    static public Integer[] generateArrayObject(int size, int bound) {
        Integer ar[] = new Integer[size];

        Random rand = new Random();

        for (int i = 0; i < size; ++i) {
            ar[i] = rand.nextInt(bound) + 1;
        }

        return ar;
    }

    static public boolean checkIfSorted(int[] ar) {
        for (int i = 0; i < ar.length - 1; ++i) {
            if (ar[i] > ar[i + 1]) {
                return false;
            }
        }

        return true;
    }

    static public boolean checkIfSorted(Integer[] ar) {
        for (int i = 0; i < ar.length - 1; ++i) {
            if (ar[i] > ar[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
