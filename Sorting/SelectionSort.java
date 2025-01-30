package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void Sort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minindex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,2,1,9,6};
        System.out.println("Array before Sorting:"+Arrays.toString(arr));
        Sort(arr);
        System.out.println("Array after Sorting:"+Arrays.toString(arr));
    }
}
