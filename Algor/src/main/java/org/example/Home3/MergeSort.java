package org.example.Home3;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] numberArray = {98, 23, 65, 8, 5, 3, 23, 56, 11, 2, 1};
        System.out.println(Arrays.toString(mergeSort(numberArray)));

    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1)
            return array;

        int middleArray = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, middleArray);
        int[] right = Arrays.copyOfRange(array, middleArray, array.length);
        return compilationArray(mergeSort(left), mergeSort(right));
    }

    public static int[] compilationArray(int[] arr1, int[] arr2) {
        int x = 0;
        int y = 0;
        int z = 0;
        int[] newArray = new int[arr1.length + arr2.length];
        while (x < arr1.length && y < arr2.length) {
            if (arr1[x] < arr2[y]) {
                newArray[z++] = arr1[x++];
            } else newArray[z++] = arr2[y++];
        }
        while (x < arr1.length) {
            newArray[z++] = arr1[x++];
        }
        while (y < arr2.length) {
            newArray[z++] = arr2[y++];
        }
        return newArray;
    }

}
