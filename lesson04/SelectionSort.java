package lesson04;

import java.util.Arrays;

public class SelectionSort {

    public static void doSort(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

            System.out.printf("第%d輪比較, --> %s%n", ++count, Arrays.toString(arr));
        }
    }
}
