package lesson03;

public class FindMin2D {
    public static void main(String[] args) {

        int[][] arr = {{14, 3, 26, 1}, {22, 6, 88, 99}};

        int min = arr[0][0];
        int max = arr[0][0];
        System.out.printf(">> 初始最小值= %d，索引值= [%d][%d]%n", min, 0, 0);
        System.out.printf(">> 初始最大值= %d，索引值= [%d][%d]%n", max, 0, 0);
        
        int minX = 0, minY = 0;
        int maxX = 0, maxY = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.printf("arr[%d][%d]= %d%n", x, y, arr[x][y]);
                System.out.printf(">> min= %d%n", min);
                if (arr[x][y] < min) {
                    min = arr[x][y];
                    minX = x;
                    minY = y;
                }
                if (arr[x][y] > max) {
                    max = arr[x][y];
                    maxX = x;
                    maxY = y;
                }
            }
        }
        System.out.printf(">> 最小值= %d，索引值= [%d][%d]%n", min, minX, minY);
        System.out.printf(">> 最大值= %d，索引值= [%d][%d]%n", max, maxX, maxY);
    }

}
