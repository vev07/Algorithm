package org.example.Lesson5;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,1,8};
        System.out.println(Arrays.toString(mergeSort(arr)));


    }
    public static int[] mergeSort(int[] arr){
        if (arr.length<=1)
            return arr;
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);
        return combine(mergeSort(left),mergeSort(right));

    }

    public static int[] combine(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int m = 0;
        int[] arr = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[m++] = arr1[i++];
            }
            else arr[m++] = arr2[j++];
        }
        while (i < arr1.length){
            arr[m++] = arr1[i++];
        }
        while (j < arr2.length){
            arr[m++] = arr2[j++];
        }
        return arr;
    }
}
