package org.example.Lesson1;

import java.util.Arrays;

public class BubbleSort {
    //difficulty O(n^2)
    public static void main(String[] args) {
        int[]num = {1,14,6,3,2,10};
        //bubbleSort(num);
       // bubbleSort2(num);
        System.out.println(Arrays.toString(num));
     int x = binarySearch(num, 14);
        System.out.println(x);

        insertionSort(num);
        System.out.println(Arrays.toString(num));



    }
    public static int[] bubbleSort(int[] num) {
        int counter = 1;

        for (int i = 0; i < num.length - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < num.length - 1 -i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    System.out.println(counter + " change num[j] = " + num[j] + " num[j + 1] = " + num[j + 1]);
                    counter++;
                    changed = true;
                }

            }
            if (!changed)
                break;

        }
        return num;
    }
    public static int[] bubbleSort2(int[] num) {
        int counter = 1;

        for (int i = 0; i < num.length - 1; i++) {
            boolean changed = false;
            for (int j = num.length - 2; j > i  ; j--) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    System.out.println(counter + " change num[j] = " + num[j] + " num[j + 1] = " + num[j + 1]);
                    counter++;
                    changed = true;
                }

            }
            if (!changed)
                break;

        }
        return num;
    }


        public static int binarySearch(int[] DD, int kay) {
            int low = 0;
            int high = DD.length - 1;

            while (low <= high) {
                int middle = low + (high - low) / 2;
                if (kay < DD[middle]) {
                    high = middle - 1;
                } else if (kay > DD[middle]) {
                    low = middle + 1;

                } else {
                    return middle;
                }
            }
            return -1;

    }
    public static int[] insertionSort(int[] num) {
        for (int i = 2; i < num.length; i++) {
            int temp = num[i];
            while (i >= 1 && num[i - 1] > temp) {
                num[i] = num[i -1];
                i = i - 1;
            }
            num[i] = temp;
        }
        return num;
    }

}
