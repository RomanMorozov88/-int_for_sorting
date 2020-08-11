package sortingalgorithm.selectionsort;

/**
 * Сортировка выбором.
 * Сортировка выбором тоже разделяет массив на сортированный и несортированный подмассивы.
 * Но на этот раз сортированный подмассив формируется вставкой минимального элемента
 * не отсортированного подмассива в конец сортированного, заменой.
 * При поиске минимума для длины массива проверяются все элементы, поэтому сложность равна O(n).
 * Поиск минимума для каждого элемента массива равен O(n^2).
 */
public class SelectionSort {

    public static int[] selectionSort(int[] target) {
        for (int i = 0; i < target.length; i++) {
            int min = target[i];
            int minIndex = i;
            for (int j = i + 1; j < target.length; j++) {
                if (target[j] < min) {
                    min = target[j];
                    minIndex = j;
                }
            }
            int temp = target[i];
            target[i] = min;
            target[minIndex] = temp;
        }
        return target;
    }

}