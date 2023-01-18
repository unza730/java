package SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    void selectionSort(int array[]) {
        int size = array.length;
        for (int step = 0; step < size - 1; step++) {
            int min_ind = step;
            for (int i = step + 1; i < size; i++) {
                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (array[i] < array[min_ind]) {
                    min_ind = i;
                }
            }
            // put min at the correct position
            int temp = array[step];
            array[step] = array[min_ind];
            array[min_ind] = temp;
        }

    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] data = { 20, 12, 10, 15, 2 };
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(data);
        System.out.println("Sorted Array in Ascending order: ");
        ss.printArray(data);
    }
}
