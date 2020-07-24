package com.ryoudo.algorithm;

import org.junit.Test;

/**
 * @author 17机制Suu
 * @copyright 神农大学生软件创新中心版权所有 @2020
 */
public class BubbleSort {

    /*递归实现：数组过大会导致java栈溢出
    private void sort(int[] arr, int n){
        n--;
        if(n <= 0){
            return;
        }
        int num = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > arr[i+1]){
                num = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = num;
            }
        }
        sort(arr, n);
    }*/

    private void sort(int[] arr, int n) {
        int num = 0;
        for (int i = n-1; i > 1; i--) {
            for(int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    num = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = num;
                }
            }
        }
    }

    @Test
    public void test(){
        int n = 100000;
        int[]arr = ArrayUtils.createRandomArray(n, 0, 120000);
        long starTime = System.currentTimeMillis();
        sort(arr, n);
        long endTime = System.currentTimeMillis();
        /*for(int value: arr){
            System.out.println(value);
        }*/
        System.out.println(endTime - starTime);
    }
}
