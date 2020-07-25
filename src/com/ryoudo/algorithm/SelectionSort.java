package com.ryoudo.algorithm;

import org.junit.Test;

/**
 * @author 17机制Suu
 * @copyright 神农大学生软件创新中心版权所有 @2020
 */
public class SelectionSort {

    public void sort(int[] arr, int n){
        int temp = 0;
        int minIndex = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            minIndex = i+1;
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
