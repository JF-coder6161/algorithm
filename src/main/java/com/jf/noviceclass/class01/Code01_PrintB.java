package com.jf.noviceclass.class01;

public class Code01_PrintB {

    public static void print(int num) {

        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? 0 : 1);
        }
        System.out.println();
    }
}
