package com.jf.noviceclass.class01;

import org.junit.Test;

import java.util.Arrays;

public class TestCode03_SelectionSort {

    @Test
    public void test1(){

        int[] arr = {1,2,3,2,1,1,3,1,12,3,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        Code03_SelectionSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
