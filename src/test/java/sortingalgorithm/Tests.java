package sortingalgorithm;

import sortingalgorithm.bubblesort.BubbleSort;
import sortingalgorithm.heapsort.HeapSort;
import sortingalgorithm.insertionsort.InsertionSort;
import sortingalgorithm.mergesort.MergeSort;
import sortingalgorithm.quicksort.QuickSort;
import sortingalgorithm.selectionsort.SelectionSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Tests {

    private int[] target;
    private int[] expected;

    @Before
    public void initArrays() {
        target = new int[]{8, 7, 4, 2, 6, 1, 5, 3};
        expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    }

    @Test
    public void bubbleTest() {
        assertArrayEquals(expected, BubbleSort.bubbleSort(target));
    }

    @Test
    public void insertTest() {
        assertArrayEquals(expected, InsertionSort.insertionSort(target));
    }

    @Test
    public void SelectTest() {
        assertArrayEquals(expected, SelectionSort.selectionSort(target));
    }

    @Test
    public void MergeTest() {
        assertArrayEquals(expected, MergeSort.mergeSort(target));
    }

    @Test
    public void HeapTest() {
        assertArrayEquals(expected, HeapSort.heapSort(target));
    }

    @Test
    public void QuickTest() {
        assertArrayEquals(expected, QuickSort.quickSort(target));
    }

}