package sortingalgorithm.bubblesort;

/**
 * Сортировка пузырьком.
 * Алгоритм просматривает массив и сравнивает каждую пару соседних элементов.
 * Когда он встречает пару элементов, расположенных не по порядку,
 * происходит замена двух элементов местами.
 * временная сложность: O(n ^ 2)
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] target) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < target.length - 1; i++) {
                if (target[i] > target[i + 1]) {
                    temp = target[i];
                    target[i] = target[i + 1];
                    target[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return target;
    }

}