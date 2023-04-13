package com.jf.noviceclass.class01;

import javax.sql.rowset.Predicate;
import java.util.Arrays;
import java.util.Map;

public class Code07_Binary_Query {

    public static boolean find(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] < num) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return false;
    }

    public static boolean test(int[] arr, int num) {
        for (int cur : arr) {
            if (cur == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int maxLen = 50;
        int maxValue = 10;
        int testTimes = 500;
        boolean succeed = true;
        for (int i = 0; i < testTimes; i++) {
            int[] arr = Code06_Logarithmic_Apparatus.lenRandomValueRandom(maxLen, maxValue);
            Code03_SelectionSort.selectSort(arr);
            int[] tmp = Code06_Logarithmic_Apparatus.copyArray(arr);
            int value = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
            boolean arrTest = test(arr, value);
            boolean findTest = find(arr, value);
            if (test(arr, value) != find(arr, value)) {

                succeed = false;
                System.out.println(Arrays.toString(tmp));
                System.out.println("find num:" + value);
                System.out.println("find test:" + findTest);
                System.out.println("arr test:" + arrTest);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked");
    }
}
