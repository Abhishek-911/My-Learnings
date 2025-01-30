import java.util.Arrays;

public class _11_Except_Self_Product {

    // Brute-Force Approach
    // public static int[] findProduct(int arr[]) {
    // int n = arr.length;

    // int left[] = new int[n];
    // int right[] = new int[n];
    // int result[] = new int[n];

    // left[0] = 1;
    // for (int i = 1; i < n; i++) {
    // left[i] = left[i - 1] * arr[i - 1];
    // }

    // right[n - 1] = 1;
    // for (int i = n - 2; i >= 0; i--) {
    // right[i] = right[i + 1] * arr[i + 1];
    // }

    // for (int i = 0; i < n; i++) {
    // result[i] = left[i] * right[i];
    // }

    // return result;
    // }

    // Optimal Approach : Reduced space complexity
    public static int[] findProduct(int arr[]) {
        int n = arr.length;
        int result[] = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right *= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int result[] = findProduct(arr);
        System.out.println("Product of Array except self: " + Arrays.toString(result));
    }
}
