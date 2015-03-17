package sorting;

/**
 * Created by oleg on 28.02.15.
 */
public class HeapSort {
    /**
     * Standard heapsort.
     * @param ar an array of Comparable items.
     */
    public static void heapsort( Comparable [ ] ar )
    {
        // this loop creates an unsorted heap out of a simple array
        // it starts at heap/2 because it's an index of the first father elem in the heap.
        // right now it's not a heap, and the index points to the incorrect elem, but makeHeap is
        // going to create a correct (max) unsorted heap.
        for( int i = ar.length / 2; i >= 0; i-- )
            makeHeap(ar, // ar
                    i, // the position from which to percolate down.
                    ar.length // the logical size of the binary heap
            );

        // at this point we have a correct unsorted heap.
        // using heap's propertie (elem's children are the biggest ones from elem's children
        // and elem is bigger than it's children) we just move the root elem to the end and
        // don't touch it any more, because it's in the right position. Every next iteration
        // work with the array from 0 index to the length-i, there i is a number of sorted elems.
        for(int upperBoundIndex = ar.length - 1, lowerBoundIndex=0; upperBoundIndex > 0; upperBoundIndex-- )
        {
            // move the root to the end
            // end the element previously at the end is now at the head,
            // so heap became incorrect.
            swapReferences( ar, lowerBoundIndex, //index 1
                    upperBoundIndex ); // index 2

            // make correct heap
            makeHeap(ar, // ar
                    lowerBoundIndex, // the position from which to percolate down.
                    upperBoundIndex // the logical size of the binary heap
            );
        }
    }

    /**
     * Internal method for heapsort.
     * @param i the index of an item in the heap.
     * @return the index of the left child.
     */
    private static int leftChild( int i )
    {
        return 2 * i + 1;
    }

    /**
     * Internal method for heapsort that is used in
     * deleteMax and buildHeap.
     * @param ar an array of Comparable items.
     * @index i the position from which to percolate down.
     * @int n the logical size of the binary heap.
     */
    private static void makeHeap(Comparable[] ar, int fatherIndex, int n)
    {
        int childIndex;
        Comparable father;

        for( father = ar[fatherIndex];
             leftChild(fatherIndex) < n;  // if child index is in the array then child exists
             fatherIndex = childIndex )  // after first iteration the biggest child is now the father
        { // start for
            childIndex = leftChild(fatherIndex);

            // check if child is not the last element
            if (childIndex != n-1) {
                // if child+1 is bigger then child, select child +1
                if (ar[childIndex].compareTo( ar[childIndex+1] ) < 0) {
                    childIndex++;
                }
            }

            // if child > father, write child value into father. The original father is not lost,
            // it's stored in the `father` variable
            if( father.compareTo(ar[childIndex]) < 0 )
                ar[fatherIndex] = ar[childIndex];
            else
                break;
        } // end for

        // after the loop fatherIndex now points to the last child
        // basically it's a swap - child is written in father in the loop
        // and here child is written with the original father
        ar[ fatherIndex ] = father;
    }


    /**
     * Method to swap to elements in an array.
     * @param a an array of objects.
     * @param index1 the index of the first object.
     * @param index2 the index of the second object.
     */
    public static final void swapReferences( Object [ ] a, int index1, int index2 )
    {
        Object tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }
}
