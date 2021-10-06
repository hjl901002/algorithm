package com.sinosoft.algorithm;

import java.util.Arrays;

public class QuickSort {

    public int[] quikSort(int[] arr,int startIndex,int endIndex){
        //防止出现数组越界
        if(startIndex >= arr.length) return arr;
        int stand = arr[startIndex];
        int i = startIndex;
        int j = endIndex;
        int temp;
        //startIndex >= endIndex表示排序已经完成
        if(startIndex >= endIndex) return arr;
        while (j > i){
            //比较arr[j]和标准值，如果比标准值小，交换arr[i]，arr[i+1]，arr[j]的值
            if(arr[j] >= stand){
                j = j - 1;
            }else{
                temp = arr[j];
                arr[j] = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                i = i + 1;
            }
        }
        arr = quikSort(arr,startIndex,(i-1));
        arr = quikSort(arr,(i+1),endIndex);
        return arr;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] oraArr = {6,5,4,3,2,1};
        System.out.println("排序前的数组：" + Arrays.toString(oraArr));
        int[] arr = quickSort.quikSort(oraArr,0,5);
        System.out.println("排序后的数组：" + Arrays.toString(arr));
    }
}
