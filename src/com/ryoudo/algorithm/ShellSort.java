package com.ryoudo.algorithm;

import org.junit.Test;

/**
 * @author 17机制Theia
 * @copyright 神农大学生软件创新中心版权所有 @2020
 */
public class ShellSort {

    public static void sort(int[] arr, int l, int r){
        int clone = 0;
        int j = 0;
        for(int i = l+1; i < r; i++){
            clone = arr[i];
            for(j = i; j > l; j--) {
                if (clone < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                }else {
                    break;
                }
            }
            arr[j] = clone;
        }
    }

    @Test
    public void insertionSortTest(){
        int n = 100000;
        int[]arr = ArrayUtils.createRandomArray(n, 0, 120000);
        long starTime = System.currentTimeMillis();
        sort(arr, 0, n);
        long endTime = System.currentTimeMillis();
        /*for(int value: arr){
            System.out.println(value);
        }*/
        System.out.println(endTime - starTime);
    }
}
