package cn.com.jzp.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by jiangzhipeng on 16/12/11.
 */
public class FastSort {

    public static void fastSort(int[] arr) {
        fastSort(arr, 0, arr.length - 1);
    }

    private static void fastSort(int[] arr, int start, int end) {
        int i = start, j = end;
        for (; i < j; ) {
            for (; j > i; j--) {
                if (arr[j] < arr[i]) {
                    swap(arr, j, i);
                    break;
                }
            }

            for (; i < j; i++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        if (i > start) {
            fastSort(arr, start, i - 1);
        }
        if (i < end) {
            fastSort(arr, i + 1, end);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 8, 3, 9, 6, 2, 7};
        fastSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
