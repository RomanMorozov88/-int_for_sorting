package sortingalgorithm.quicksort;

/**
 * Быстрая сортировка.
 */
public class QuickSort {

    public static int[] quickSort(int[] target) {
        int low = 0;
        int high = target.length - 1;
        recursionSort(target, low, high);
        return target;
    }

    private static void recursionSort(int[] target, int low, int high) {
        if (target.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int stud = target[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (target[i] < stud) {
                i++;
            }
            while (target[j] > stud) {
                j--;
            }
            if (i <= j) {
                int temp = target[i];
                target[i] = target[j];
                target[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            recursionSort(target, low, j);
        }
        if (high > i) {
            recursionSort(target, i, high);
        }
    }

}