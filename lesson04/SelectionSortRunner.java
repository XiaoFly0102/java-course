package lesson04;

import java.util.Arrays;

public class SelectionSortRunner {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 7, 2, 6, 1, 3, 5, 9};
        SelectionSort.doSort(numbers);
        System.out.println("SelectionSort 比較結果" + Arrays.toString(numbers));
    }
    
}
