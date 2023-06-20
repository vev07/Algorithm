package org.example.Lesson2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, -2 , 6, 0};
        int key = 5;
        String str = "";

        //difficulty O(n^2)

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] + arr[j] == key) {
                    System.out.println(arr[i] + " " + arr[j]);
                    str += "" + arr[i] + " + " + arr[j] +" = "+ key + "; ";
                }

            }
        }
        System.out.println(str);

    }
}
