import java.util.Arrays;

public class _07_Next_Permutation {

    public static void findNext(int arr[]) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] > arr[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = arr.length - 1;
            while (j >= 0 && arr[i] >= arr[j]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i + 1);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int start) {
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 7, 5, 0 };
        System.out.println(Arrays.toString(arr));
        findNext(arr);
        System.out.println(Arrays.toString(arr));
    }
}
