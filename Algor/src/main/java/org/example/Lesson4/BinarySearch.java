package org.example.Lesson4;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr,7, 0, arr.length - 1));

    }

    // O(log n)
    public static int binarySearch(int [] arr, int target, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                return binarySearch(arr,target, mid + 1, end);
            }
            return binarySearch(arr,target,start,mid - 1);
        }
        return -1;
    }
}
