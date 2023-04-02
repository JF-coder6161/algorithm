package com.jf.noviceclass.noviceclass.class01;

import com.jf.noviceclass.class01.Code01_PrintB;
import org.junit.Test;

public class Code01_PrintBTest {

    @Test
    public void test() {

        // 计算机底层 32位
        int num = 4;

        System.out.println(num << 1); // 8
        System.out.println(num << 2); // 16

        int a = Integer.MAX_VALUE;
        System.out.println(a);  // 2147483647
        Code01_PrintB.print(a); // 01111111111111111111111111111111

        /**
         * 32位 31位                   <--        1位
         * 0     1   111111111111111111111111111111
         *
         * 保留最高位因为 在Java中 整形需要表示 + -
         * C++语言中 无符号整形 可表示范围为  0 ~ 2^32 -1
         *
         *
         */

        int b = Integer.MIN_VALUE;
        System.out.println(b);
        Code01_PrintB.print(b);

        Code01_PrintB.print(-1);


        /**
         * 带符号右移,不
         *  >>
         * 带符号右移
         *  >>>
         */

        /**
         * 与 &  或 | 异或 ^  取反 ~
         */

        /**
         * 正数 :
         * 负数 : 正数取反 --> 非符号位取反 + 1 -- > 结果
         */

        /**
         * 计算机底层 运算 是一套逻辑  取反+1
         */


    }

}
