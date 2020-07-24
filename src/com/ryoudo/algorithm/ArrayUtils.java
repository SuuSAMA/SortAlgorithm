package com.ryoudo.algorithm;

import org.junit.Test;

import java.util.Random;

/**
 * @author 17机制Suu
 * @copyright 神农大学生软件创新中心版权所有 @2020
 */
public class ArrayUtils {

    public static int[] createRandomArray(int n, int rangeL, int rangeR){
        int[] arr = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++){
            int randomNum = random.nextInt(rangeR - rangeL + 1);
            arr[i] = randomNum + rangeL;
        }
        return arr;
    }

}
