public class _05_Maximum_Subarray {

    public static int findMaximum(int arr[]){
        int result = 0;
        int max = 0;
        for(int ele : arr){
            result += ele;
            if(result>max){
                max = result;
            }
            if(result<0){
                result = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = findMaximum(arr);
        System.out.println(result);
    }
}
