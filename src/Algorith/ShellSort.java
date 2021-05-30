package Algorith;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class ShellSort {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //trim用于删除字符串头尾空白符
        String[] str = sc.nextLine().trim().split(" ");  //读取一行字符串，并用空格切割
        int[] array = new int[str.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        System.out.println("输入的数组是： " + Arrays.toString(array));

        System.out.println("选择排序后的数组是： " + Arrays.toString(shell_sort(array)));
    }

    public static int[] shell_sort(int[] array){
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
