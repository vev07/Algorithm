package org.example.Lesson5;

public class main2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr,7,0,arr.length-1));

    }
    public static int binarySearch(int[] arr,int k,int start, int end){
        if (end>=start){
            int mid = (start+end)/2;
            if (k==arr[mid]) return mid;
            else if (k>arr[mid]) return binarySearch(arr,k,mid+1, end);
            else return binarySearch(arr,k,start, mid);
        }
        return -1;
    }
}
