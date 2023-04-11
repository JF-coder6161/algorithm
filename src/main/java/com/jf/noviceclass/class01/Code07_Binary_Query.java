package com.jf.noviceclass.class01;

public class Code07_Binary_Query {

    public static boolean find(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int L = 0;
        int R = arr.length - 1;
        while (L > R) {
            int mid = (L + R) / 2;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] < num) {
                L = mid + 1;
            } else if (arr[mid] > num) {
                R = mid - 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int maxLen = 50;
        int maxValue = 50;
        int testTimes = 500;
        int[] arr = Code06_Logarithmic_Apparatus.lenRandomValueRandom(maxLen,maxValue);
        Code04_insertionSort.insertionSort(arr);
        int[] tmp = Code06_Logarithmic_Apparatus.copyArray(arr);
        boolean succeed = true;
    }
}
