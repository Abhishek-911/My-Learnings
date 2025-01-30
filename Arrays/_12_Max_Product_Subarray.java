public class _12_Max_Product_Subarray {

    // Brute-Force Approach
    // public static int findMax(int arr[]){
    // int n = arr.length;
    // int result = 1;
    // for(int i=0;i<n;i++){
    // int product = 1;
    // for(int j=i;j<n;j++){
    // product *= arr[j];
    // result = Math.max(result,product);
    // }
    // }
    // return result;
    // }

    // Optimal Approach
    public static int findMax(int arr[]) {
        int n = arr.length;
        int leftproduct = 1;
        int rightproduct = 1;
        int result = 1;

        for (int i = 0; i < n; i++) {
            leftproduct = leftproduct == 0 ? 1 : leftproduct;
            rightproduct = rightproduct == 0 ? 1 : rightproduct;

            leftproduct *= arr[i];
            rightproduct *= arr[n - 1 - i];

            result = Math.max(result, leftproduct);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -1,-2,-3,-4};
        int result = findMax(arr);
        System.out.println("Maximum Product is: " + result);
    }
}
