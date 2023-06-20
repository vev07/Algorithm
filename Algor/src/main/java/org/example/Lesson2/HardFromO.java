package org.example.Lesson2;

import java.util.Arrays;

public class HardFromO {
    public static void main(String[] args) {
        //O(c) = c*O(1)
        //O(n)

        int[]arr = {1,2,3,4,5,4};
        int key = 4;

        // difficulty O(n);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(i);
                break;
            }
        }
        int[]arr2 = {1,2,3,4,5,4};
        int key2 = 4;
        int[]arrIndex = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] != key) {
                arrIndex[i] = -1;
            } else {
                arrIndex[i] = arr2[i];
            }
        }
        System.out.println(Arrays.toString(arrIndex));

    }
}

