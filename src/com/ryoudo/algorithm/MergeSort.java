package com.ryoudo.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author 17机制Suu
 * @copyright 神农大学生软件创新中心版权所有 @2020
 */
public class MergeSort {

    public void sort(int[] arr, int n){
        sort(arr, 0, n-1);
    }

    private void sort(int[] arr, int l, int r){
        /*if(l >= r){
            return;
        }*/
        if(r - l <= 15){
            ShellSort.sort(arr, l, r);
            return;
        }
        int mid = (l+r) / 2;
        sort(arr, l, mid);
        sort(arr, mid+1, r);
        merge(arr, l, r, mid);
    }

    private void merge(int[] arr, int l, int r, int mid){
        int[] aux = Arrays.copyOfRange(arr, l, r+1);
        int i = l;
        int j = mid + 1;
        for(int k = l; k <= r; k++){
            if(i > mid){
                arr[k] = aux[j-l];
                j++;
            }else if(j > r){
                arr[k] = aux[i-l];
                i++;
            }else if(aux[i-l] < aux[j-l]){
                arr[k] = aux[i-l];
                i++;
            }else {
                arr[k] = aux[j-l];
                j++;
            }
        }
    }

    @Test
    public void mergeSortTest(){
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
