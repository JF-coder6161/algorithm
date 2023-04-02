package com.jf.noviceclass.class01;

import java.util.Arrays;

public class Code03_SelectionSort {

    public static void selectSort(int[] arr) {

//        int tmp = 0;
//        int minSelectIndex = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            tmp = arr[i];
//            for (int i1 = i + 1; i1 < arr.length; i1++) {
//                if (arr[i1] < tmp) {
//                    tmp = arr[i1];
//                    arr[i1] = arr[i];
//                    arr[i] = tmp;
//                }
//            }
//        }

        // 1.边界条件
        if (arr == null || arr.length < 2) {
            return;
        }

        /**
         *  0 ~ N -1
         *  1 ~ N -1
         *  2 ~ N -1
         *  i ~ N -1
         */

        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minValueIndex = i; // i
            for (int j = i + 1; j < N; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
        }


    }

    /**
     * 找到数组中最小值的索引位置,并与当前比较值进行交换
     *
     * @param arr           prepared sort array
     * @param i             当前比值位置索引
     * @param minValueIndex 找到的最小值位置的索引
     */
    public static void swap(int[] arr, int i, int minValueIndex) {
        int tmp = arr[minValueIndex];
        arr[minValueIndex] = arr[i];
        arr[i] = tmp;
    }

    public static void bubbleSort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        /**
         * 0 ~ N -1
         * 0 ~ N- 2
         * 0 ~ N- 3
         * 0 ~ end
         */
        int N = arr.length;
        for (int end = N - 1; end >= 0; end--) {
            //  0 ~ end 范围的描述:
            // 0 <==> 1 是否需要交换, 1 <==> 2 是否需要交换, end -1 <==> end 是否需要交换
//            for (int firstIndex = 0; firstIndex <= end - 1; firstIndex++) {
//                if (arr[firstIndex] > arr[firstIndex + 1]) {
//                    swap(arr, firstIndex, firstIndex + 1);
//                }
//            }
            for (int secondIndex = 1; secondIndex <= end; secondIndex++) {
                if (arr[secondIndex - 1] > arr[secondIndex]) {
                    swap(arr, secondIndex - 1, secondIndex);
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 4, 3, 2, 2, 1, 0};
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
