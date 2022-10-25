package task02.text03;
import java.util.Arrays;

public class Text03_3_ArrAlgo {
    public static void main(String[] args) {
        int arr1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr2[][] = {{2, 2, 2}, {1, 1, 1}, {3, 3, 3}};
        int arr3[][] = new int[3][3];//接收数组和
        int arr4[][] = new int[3][3];//接收数组积
        for (int row = 0; row < arr3.length; row++) {
            for (int column = 0; column < arr3.length; column++) {
                arr3[row][column]=arr1[row][column]+arr2[row][column];//赋值
                System.out.print(arr3[row][column]+" ");
            }
            System.out.println();
        }
        for (int row = 0; row < arr4.length; row++) {
            for (int column = 0; column < arr4.length; column++) {
                arr4[row][column]=arr1[row][column]*arr2[row][column];//赋值
                System.out.print(arr4[row][column]+" ");
            }
            System.out.println();
        }
    }
}
