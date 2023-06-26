package org.example.Lesson5;

public class Main {

        public static void main(String[] args) {
            int[] arr1 = {100, 112, 256, 349, 770};
            int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
            System.out.println(combine(arr1,arr2,3));
        }

        public static int combine(int[] arr1, int[] arr2, int k) {
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
            return arr[k-1];

    }
}
