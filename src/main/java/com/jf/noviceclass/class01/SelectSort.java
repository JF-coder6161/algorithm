package com.jf.noviceclass.class01;

public class SelectSort {


    public static void selectSort(int[] arr) {

        if (arr == null && arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {

            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }

        }

    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }


}
