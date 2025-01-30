package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void Sort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-i-1;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,2,1,9,6};
        System.out.println("Array before Sorting:"+Arrays.toString(arr));
        Sort(arr);
        System.out.println("Array after Sorting:"+Arrays.toString(arr));
    }
}
