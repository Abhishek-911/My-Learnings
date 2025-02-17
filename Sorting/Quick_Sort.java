import java.util.Arrays;

public class Quick_Sort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low <= high) {
            int pivot = partition(arr, low, high);

            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 6, 9, 7 };
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        quicksort(arr, 0, arr.length - 1);

        System.out.println("Before Sorting: " + Arrays.toString(arr));
    }
}
