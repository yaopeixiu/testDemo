package Algorith;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 比较相邻的两个元素，如果第一个比第二个大，交换两个数的顺序，
 * 第一轮结束，最后的一个元素是最大的，第二轮结束倒数第二个数是第二大的数，一共循环 n-1 次
 *
 * 空间复杂度：O(1)          时间复杂度: O(n^2)
 */
public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //trim用于删除字符串头尾空白符
        String[] str = sc.nextLine().trim().split(" ");  //读取一行字符串，并用空格切割
        int[] array = new int[str.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        System.out.println("输入的数组是： " + Arrays.toString(array));

        System.out.println("冒泡排序后的数组是： " + Arrays.toString(bubble_sort(array)));
    }

    public static int[] bubble_sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

}
