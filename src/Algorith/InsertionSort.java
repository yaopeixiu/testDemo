package Algorith;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 对于未排序的序列，在已排序的序列中从后向前扫描，插入相应的位置
 * 从第一个元素开始，第一个元素可以认为是已经排序了的，
 * 取出下一个元素，在已排序的序列中从后向前扫描，如果已排序元素比新元素大，则将该元素移到下一个位置，否则就插入到该元素后面
 *
 * 空间复杂度：O(1)            时间复杂度：O(n^2)   最好的情况-顺序 O(n)
 */
public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //trim用于删除字符串头尾空白符
        String[] str = sc.nextLine().trim().split(" ");  //读取一行字符串，并用空格切割
        int[] array = new int[str.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        System.out.println("输入的数组是： " + Arrays.toString(array));

        System.out.println("选择排序后的数组是： " + Arrays.toString(insert_sort(array)));
    }

    public static int[] insert_sort(int[] array){
        for (int i = 1; i < array.length - 1; i++) {
            int index = i - 1;
            int current = array[i];
            while (index >= 0 && array[index] > current){
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = current;
        }
        return array;
    }
}
