package com.jf.noviceclass.class01;

/**
 * 对数器的使用
 */
public class Code06_Logarithmic_Apparatus {



    /**
     * 返回一个数组arr ,arr长度[0,maxLen-1] , arr中的每个值[0,maxValue-1]
     * @param maxLen 数组最大长度
     * @param maxValue 数组中数值的最大范围
     * @return
     */
    public static int[] lenRandomValueRandom(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = (int) (Math.random() * maxValue);
        }
        return ans;
    }

    public static int[] copyArray(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    public static boolean isSorted(int[] arr) {
        if (arr.length < 2){
            return true;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]){
                return false;
            }
            max = Math.max(max,arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {

        int maxLen = 50;
        int maxValue = 1000;
        int testTime = 10000;

        for (int i = 0; i < testTime; i++) {

            // 大样本随机
            int[] arr1 = lenRandomValueRandom(maxLen,maxValue);
            int[] tmp = copyArray(arr1);
            Code03_SelectionSort.selectSort(arr1);
            if (!isSorted(arr1)){
                for (int i1 = 0; i1 < tmp.length; i1++) {
                    System.out.print(tmp[i] + " ");
                }
                System.out.println();
                System.out.println("选择排序错误");
                break;
            }
        }

    }

}
