package com.ryoudo.algorithm;

import org.junit.Test;

/**
 * @author 17机制Suu
 * @copyright 神农大学生软件创新中心版权所有 @2020
 */
public class QuickSort {

    private void sort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int temp = arr[left];
        int index = left;
        int num = 0;
        for(int i = left+1; i < right; i++){
            if(arr[i] < temp){
                num = arr[index+1];
                arr[index+1] = arr[i];
                arr[i] = num;
                arr[index] = arr[index+1];
                arr[index+1] = temp;
                index++;
            }
        }
        sort(arr, left, index);
        sort(arr, index+1, right);
    }


    @Test
    public void test(){
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
