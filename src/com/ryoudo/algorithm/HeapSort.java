package com.ryoudo.algorithm;

import org.junit.Test;

/**
 * @author 17机制Theia
 * @copyright 神农大学生软件创新中心版权所有 @2020
 */
public class HeapSort {

    public void sort(int[] arr){
        for(int i = arr.length/2-1; i >= 0; i--){
            makeMaximumHeap(arr, i, arr.length);
        }
        int root = 0;
        for (int i = arr.length-1; i >= 0; i--){
            root = arr[0];
            arr[0] = arr[i];
            arr[i] = root;
            makeMaximumHeap(arr, 0, i);
        }
    }

    private void makeMaximumHeap(int[] arr, int left, int right){
        int temp = arr[left];
        for(int i = left*2+1; i < right; i = i*2+1){
            if(i+1 < right && arr[i] < arr[i+1]){
                i++;
            }
            if(arr[i] > temp){
                arr[left] = arr[i];
                left = i;
            }else {
                break;
            }
            arr[left] = temp;
        }
    }

    @Test
    public void test(){
        int n = 100000;
        int[]arr = ArrayUtils.createRandomArray(n, 0, 120000);
        long starTime = System.currentTimeMillis();
        sort(arr);
        long endTime = System.currentTimeMillis();
        /*for(int value: arr){
            System.out.println(value);
        }*/
        System.out.println(endTime - starTime);
    }
}
