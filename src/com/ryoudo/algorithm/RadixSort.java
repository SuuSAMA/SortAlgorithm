package com.ryoudo.algorithm;

import org.junit.Test;

import java.util.List;
import java.util.Stack;

/**
 * @author 17机制Theia
 * @copyright 神农大学生软件创新中心版权所有 @2020
 */
public class RadixSort {

    public void sort(int[] arr) {
        Integer[][] temps = new Integer[10][arr.length];
        int max = 0;
        int[] count = new int[10];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int number = 0;
        int maxLength = Integer.toString(max).length();
        for(int i = 0, n = 1; i < maxLength; i++, n = n*10){
            for(int j = 0; j < arr.length; j++){
                number = arr[j] / n % 10;
                temps[number][count[number]] = arr[j];
                count[number]++;
            }
            for(int j = 0, u = 0; j < 10; j++){
                for(int k = 0; k < count[j]; k++, u++){
                    arr[u] = temps[j][k];
                }
                count[j] = 0;
            }
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
