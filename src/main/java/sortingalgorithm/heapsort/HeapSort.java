package sortingalgorithm.heapsort;

/**
 * Пирамида или двоичная куча – это дерево, в котором каждый узел состоит в отношениях с дочерними узлами.
 * Добавление нового узла начинается с левой позиции нижнего неполного уровня.
 * По мере движения вниз по дереву значения уменьшаются (min-heap) или увеличиваются (max-heap).
 * Чтение графа сверху вниз здесь представлено слева направо. Мы добились того,
 * что позиция дочернего элемента по отношению к k-ому элементу в массиве –
 * 2\*k+1 и 2\*k+2 (при условии, что индексация начинается с 0).
 * И наоборот, для k-го элемента дочерняя позиция всегда равна (k-1)/2.
 * <p>
 * Временная сложность: O(n log n)
 */
public class HeapSort {

    public static int[] heapSort(int[] target) {
        if (target.length == 0) {
            return target;
        }
        int length = target.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(target, length, i);
        }
        for (int i = length - 1; i >= 0; i--) {
            int temp = target[0];
            target[0] = target[i];
            target[i] = temp;
            heapify(target, i, 0);
        }
        return target;
    }

    private static void heapify(int[] target, int length, int i) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int largest = i;
        if (leftChild < length && target[leftChild] > target[largest]) {
            largest = leftChild;
        }
        if (rightChild < length && target[rightChild] > target[largest]) {
            largest = rightChild;
        }
        if (largest != i) {
            int temp = target[i];
            target[i] = target[largest];
            target[largest] = temp;
            heapify(target, length, largest);
        }
    }

}