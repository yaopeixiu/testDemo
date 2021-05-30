package Algorith;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 在未排序序列中查找最小的元素，放在排序序列的起始位置，
 * 然后，再从未排序序列中继续查找最小的元素放在已排序序列的末尾，进行 n-1 次循环
 *
 * 空间复杂度：O(1)              时间复杂度; O(n^2)
 */
public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //trim用于删除字符串头尾空白符
        String[] str = sc.nextLine().trim().split(" ");  //读取一行字符串，并用空格切割
        int[] array = new int[str.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        System.out.println("输入的数组是： " + Arrays.toString(array));

        System.out.println("选择排序后的数组是： " + Arrays.toString(selection_sort(array)));
    }

    public static int[] selection_sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
}
