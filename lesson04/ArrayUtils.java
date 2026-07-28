package lesson04;

import java.util.Arrays;

public class ArrayUtils {
    //建立一個公開的類別，名稱叫做 ArrayUtils，裡面放處理陣列的工具。

    static int sum(int[] a) {
    //建立一個叫做 sum 的工具，接收一個整數陣列，最後回傳一個整數。
        int t = 0;
        //建立一個整數變數 t，先從 0 開始累加。
        for (int n : a) t += n;
        //把陣列 a 裡面的數字，一個一個拿出來，每次拿到的數字叫做 n。
        //把目前拿到的數字 n，加進總數 t。
        return t;
        //把加總完成的 t 回傳出去。 
    }
    static void reverse(int[] a) {
        //建立一個叫做 reverse 的工具，接收一個整數陣列，沒有回傳值。
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
        //i 從最左邊開始，j 從最右邊開始。只要兩邊還沒碰到，就繼續交換；交換後，兩邊各自往中間移動一格。
            int tmp = a[i];
            //先把左邊 a[i] 的數字，暫時放進 tmp 保管。
            a[i] = a[j];  a[j] = tmp;
            //把右邊 a[j] 的數字，放到左邊 a[i]。
        }
    }
    static void print(int[] a) {
    //建立一個叫做 print 的工具，接收整數陣列並印出內容，不回傳答案。
        System.out.println(Arrays.toString(a));
        //把陣列轉成文字後，印在終端機上。
        //把陣列 a 轉成方便閱讀的文字。
    }
    public static void main(String[] args) {
    //建立 Java 程式開始執行的入口 main()。
        int[] n = {1, 2, 3, 4, 5};
        reverse(n); 
        print(n);  // [5, 4, 3, 2, 1]
        // ✔ 原陣列已改變！（傳「參考值」的副本）
    }
}