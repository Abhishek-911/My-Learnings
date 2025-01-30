package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void Sort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,2,1,9,6};
        System.out.println("Array before Sorting:"+Arrays.toString(arr));
        Sort(arr);
        System.out.println("Array after Sorting:"+Arrays.toString(arr));
    }
}
