package com.jf.noviceclass.class01;

public class Code05_RandonRand {

    public static double xToPower2() {

        return Math.random();

    }

    /**
     * 返回[0,1)的一个小数,
     * 任意的x,x属于[0,1),[0,x)范围上的数出现概率由原来的x调整成x平方
     * @param args
     */
    public static void main(String[] args) {
        int testTimes = 210000;

        int count = 0;

        double x = 0.7;

        for (int i = 0; i < testTimes; i++) {
            if(xToPower2() < x && xToPower2() < x){
                count++;
            }
        }

        System.out.println((double) count / (double) testTimes);
        System.out.println(Math.pow(x, 2));

        for (int i = 0; i < 10; i++) {
            System.out.println(f());
        }
    }

    /**
     * 创建随机值 [1,5]
     * @return
     */
    public static int f(){
        return (int)(Math.random() * 5 + 1);
    }

    /**
     * 随机机制,只能用f1
     * 等概率返回 0 和 1
     * @return
     */
    public static int f1(){
        int ans = 0;
        do {
            ans = f();
        }while (ans == 3);
        return ans < 3 ? 0 : 1;
    }

    /**
     * 得到 000 ~ 111 做到等概率
     */
    public static int f2(){
        return (f1() << 2) + (f1() << 1) + f1();
    }


    /**
     * 0 ~ 6 等概率返回
     */
    public static int f3(){
        int ans = 0;
        do {
            ans = f2();
        }while (ans == 7);
        return ans;
    }

    /**
     * 1 ~ 7 等概率返回
     */
    public static int g(){
        return f3() + 1;
    }



}
