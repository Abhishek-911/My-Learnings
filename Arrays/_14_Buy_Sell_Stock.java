public class _14_Buy_Sell_Stock {

    // Brute-Force Approach
    // public static int findBest(int arr[]){
    // int maxprice = Integer.MIN_VALUE;
    // int n = arr.length;

    // for(int i=0;i<n-1;i++){
    // for(int j=i+1;j<n;j++){
    // int diff = arr[j] - arr[i];
    // maxprice = Math.max(maxprice,diff);
    // }
    // }

    // return maxprice;
    // }

    // Optimal Approach
    public static int findBest(int arr[]) {
        int minprice = Integer.MAX_VALUE;
        int sellprice = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele < minprice) {
                minprice = ele;
            } else {
                sellprice = Math.max(sellprice, ele - minprice);
            }
        }
        return sellprice;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int result = findBest(arr);
        System.out.println("Maximum profit: " + result);
    }
}
