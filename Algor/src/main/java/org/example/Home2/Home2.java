package org.example.Home2;

import java.util.Arrays;

public class Home2 {
    public static void main(String[] args) {
        int[] m = {100, 112, 256, 349, 770};
        int[] n = {72, 86, 113, 119, 265, 445, 892};
        int index = 7;
        int[] newArrey = concatArray(m,n);
        sortArray(newArrey);
        System.out.println(Arrays.toString(newArrey));
        System.out.println("value index is - " + searchIndex(newArrey, index));


    }
    public static int[] concatArray(int[]m, int[]n) {
        int[] newArrey = new int[m.length + n.length];

        for (int i = 0; i < m.length; i++) {
            newArrey[i] = m[i];
        }
        for (int i = m.length; i < newArrey.length; i++) {
            newArrey[i] = n[i - m.length];
        }
        return newArrey;
    }
    public static void sortArray(int[] newArrey) {
        for (int i = 0; i < newArrey.length; i++) {
            for (int j = i + 1; j < newArrey.length; j++) {
                if (newArrey[i] > newArrey[j]) {
                    int temp = newArrey[j];
                    newArrey[j] = newArrey[i];
                    newArrey[i] = temp;
                }

            }
        }

    }
    public static int searchIndex(int[] newArrey, int index) {
        return newArrey[index];
    }
}
