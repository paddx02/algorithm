package com.algorithm;

/**
 * Created by liuxp on 15/12/26.
 */
public class Sort {

    public void insertSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j>0;j--){
                //如果当前元素比上一个要小，则交换两个元素的值
                //否则代表表示已经找到该元素在已排序元素中的正确位置，退出当前循环
                if(arr[j]<arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }else {
                    break;
                }
            }
        }
    }



}
