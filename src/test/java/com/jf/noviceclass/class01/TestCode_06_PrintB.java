package com.jf.noviceclass.class01;

import org.junit.Test;

public class TestCode_06_PrintB {

    @Test
    public void test1() {

        int num = 6666;
        Code06_PrintB.print(num);

        Code06_PrintB.print(1 << 1);
        Code06_PrintB.print(1 << 2);
        Code06_PrintB.print(1 << 3);
        Code06_PrintB.print(1 << 4);

        System.out.println(1 << 1);
        System.out.println(1 << 2);
        System.out.println(1 << 3);
        System.out.println(1 << 4);

        System.out.println(2 << 1);
        System.out.println(2 << 2);
        System.out.println(2 << 3);
        System.out.println(2 << 4);
    }
}
