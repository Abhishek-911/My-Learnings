import java.util.Arrays;

public class _13_Sort_0_1_2 {

    // Brute-Force Approach
    // public static void Sort(int arr[]) {
    // int count0 = 0, count1 = 0, count2 = 0;

    // for (int ele : arr) {
    // if (ele == 0) {
    // count0++;
    // } else if (ele == 1) {
    // count1++;
    // } else {
    // count2++;
    // }
    // }

    // int index = 0;
    // while (count0 > 0) {
    // arr[index++] = 0;
    // count0--;
    // }
    // while (count1 > 0) {
    // arr[index++] = 1;
    // count1--;
    // }
    // while (count2 > 0) {
    // arr[index++] = 2;
    // count2--;
    // }
    // }

    // Optimal Approach
    public static void Sort(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        Sort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
