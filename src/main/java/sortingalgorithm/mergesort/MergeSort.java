package sortingalgorithm.mergesort;

import java.util.Arrays;

/**
 * Сортировка слиянием.
 * Массив делится на два подмассива, а затем происходит:
 * Сортировка левой половины массива (рекурсивно)
 * Сортировка правой половины массива (рекурсивно)
 * Слияние.
 * Временная сложность: O(n log n).
 */
public class MergeSort {

    public static int[] mergeSort(int[] target) {
        int[] bufferForSort = Arrays.copyOf(target, target.length);
        int[] buffer = new int[target.length];
        int[] result = recursiveForMergeSort(bufferForSort, buffer, 0, target.length);
        return result;
    }

    /**
     * @param bufferForSort - для сортировки.
     * @param buffer        - буффер.
     * @param startIndex    - Начальный индекс в bufferForSort для сортировки.
     * @param endIndex      - Конечный индекс в bufferForSort для сортировки.
     * @return
     */
    private static int[] recursiveForMergeSort(int[] bufferForSort, int[] buffer, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return bufferForSort;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sortedOne = recursiveForMergeSort(bufferForSort, buffer, startIndex, middle);
        int[] sortedTwo = recursiveForMergeSort(bufferForSort, buffer, middle, endIndex);

        int indexOne = startIndex;
        int indexTwo = middle;
        int destIndex = startIndex;
        int[] result = sortedOne == bufferForSort ? buffer : bufferForSort;

        while (indexOne < middle && indexTwo < endIndex) {
            result[destIndex++] = sortedOne[indexOne] < sortedTwo[indexTwo]
                    ? sortedOne[indexOne++] : sortedTwo[indexTwo++];
        }
        while (indexOne < middle) {
            result[destIndex++] = sortedOne[indexOne++];
        }
        while (indexTwo < endIndex) {
            result[destIndex++] = sortedTwo[indexTwo++];
        }
        return result;
    }

}