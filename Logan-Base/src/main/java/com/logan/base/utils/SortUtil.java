package com.logan.base.utils;

import java.util.Arrays;

/**
 * Desc：SortUtil
 * Created by liugenxing on 2021/10/25 16:26.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class SortUtil {
    /**
     * Desc: 选择排序
     * Created by liugenxing on 2021/10/25 16:29
     * @param arr
     */
    public static void selectSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            int minIndex = j;
            for (int i = j + 1; i <= arr.length - 1; i++) {
                if (arr[minIndex] > arr[i]) {
                    minIndex = i;
                }
            }
            swap(arr,minIndex,j);
            System.out.println(Arrays.toString(arr) + "minIndex = " + minIndex);
        }

    }

    /**
     * Desc: 冒泡排序，已经最终优化
     * Created by liugenxing on 2021/10/25 16:28
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        int len = arr.length - 1;
        while (true) {
            int lastSwapIndex = 0;
            for (int i = 0; i < len; i++) {
                //冒泡
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    lastSwapIndex = i;
                }
            }
            len = lastSwapIndex;
            System.out.println(Arrays.toString(arr) + "len = " + len);
            if (len == 0) {
                break;
            }
        }
    }

    /**
     * Desc: 单边快速排序
     * Created by liugenxing on 2021/10/25 16:28
     * @param arr
     * @param lowIndex
     * @param highIndex
     */
    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }
        int pv_index = partition(arr, lowIndex, highIndex);
        quickSort(arr, lowIndex, pv_index - 1);  //左边分区
        quickSort(arr, pv_index + 1, highIndex);  //右边分区
    }

    private static int partition(int[] arr, int l, int h) {
        int pv = arr[h];    //基准点元素
        int i = l;
        for (int j = l; j < h; j++) {
            //比基准点小，都移到左边
            if (arr[j] < pv) {
                if (i != j) {
                    swap(arr, j, i);
                }
                i++;
            }
            System.out.println(Arrays.toString(arr));
        }

        if (h != i) {
            swap(arr, h, i);
        }
        System.out.println(Arrays.toString(arr) + "i = " + i);
        //返回值代表了基准点元素所在的最后索引，用以确定下一轮分区的选择
        return i;
    }

    public static void swap(int[] a, int index1, int index2) {
        int tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }

    public static void main(String[] args) {
//        int[] arr = {5, 3, 7, 2, 9, 8, 1, 4};
        int[] arr = {8, 9, 4, 2, 1, 3, 5, 7, 6};
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //quickSort(arr, 0, arr.length - 1);

        //bubbleSort(arr);

        selectSort(arr);
    }
}
