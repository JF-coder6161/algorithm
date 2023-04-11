package com.jf;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        int[] arr = {3, 2, 1};
//
//        int N = arr.length;
//        for (int i = 0; i < N; i++) {
//
//            for (int j = i; j > 0; j--) {
//                if (arr[j - 1] > arr[j]) {
//                    int tmp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));

        int times = 1200000;
        int[] ans = new int[2];
        for (int i = 0; i < times; i++) {
            ans[y()] ++;
        }

        System.out.println((double) ans[0] / (double) times);
        System.out.println((double) ans[1] / (double) times);


    }

    public static int x(){
        return Math.random() < 0.84 ? 0 : 1;
    }

    // 等概率返回 0 和 1
    public static int y(){
        int ans = 0;
        do {
            ans = x(); // step 1
        }while (ans == x()); // step 2
        /**
         * 可返回的值：
         * step 1 : 0  step 2: 1
         * step 1 : 1  step 2: 0
         */
        return ans;
    }


}
