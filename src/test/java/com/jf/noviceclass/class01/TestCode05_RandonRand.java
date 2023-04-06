package com.jf.noviceclass.class01;

import org.junit.Test;

public class TestCode05_RandonRand {

    @Test
    public void test() {

        int testTimes = 12000;
        int[] ans = new int[8];
        for (int i = 0; i < testTimes; i++) {
            int i1 = Code05_RandonRand.g();
            ans[i1] += 1;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(i+" 出现了 " + ans[i] + " 次");
        }

    }

}
