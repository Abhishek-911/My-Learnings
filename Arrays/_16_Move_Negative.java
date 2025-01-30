import java.util.Arrays;

public class _16_Move_Negative {

    // Brute-Force approach
    // public static int[] moveAll(int arr[]) {
    // int result[] = new int[arr.length];
    // int j = 0;
    // for (int ele : arr) {
    // if (ele < 0) {
    // result[j++] = ele;
    // }
    // }
    // for (int ele : arr) {
    // if (ele > 0) {
    // result[j++] = ele;
    // }
    // }
    // return result;
    // }

    // Optimal approach
    public static void moveAll(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                int k = i;
                while (k > j) {
                    arr[k] = arr[k - 1];
                    k--;
                }
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -10, -3, -55, 20, 50 };
        System.out.println("Original array: " + Arrays.toString(arr));
        // int result[] = moveAll(arr);
        // System.out.println("Manipulated array: " + Arrays.toString(result));
        moveAll(arr);
        System.out.println("Manipulated array: " + Arrays.toString(arr));
    }
}
