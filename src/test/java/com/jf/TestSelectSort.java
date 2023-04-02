package com.jf;

import com.jf.noviceclass.class01.SelectSort;
import org.junit.Test;

import java.util.Arrays;

public class TestSelectSort {

    @Test
    public void test1(){
        int[] arr = new int[]{3,2,1};

        SelectSort.selectSort(arr);

        System.out.println(Arrays.toString(arr));

    }

}
