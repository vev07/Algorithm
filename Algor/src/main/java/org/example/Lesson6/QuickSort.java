package org.example.Lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(344,3,4,56,88,7,432,5,1);
        System.out.println(quickSort(num));


    }
    public static List<Integer> quickSort (List<Integer> arr) {
        if (arr.size() <= 1)
            return arr;
        int point = arr.get(arr.size() - 1);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > point)
                right.add(arr.get(i));
            else left.add(arr.get(i));
        }
        List<Integer> all = new ArrayList<>();
        all.addAll(quickSort(left));
        all.add(point);
        all.addAll(quickSort(right));
        return all;
    }
}
