public class Missing_Number {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0;i<arr.length;i++){
            sum1 = sum1+arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        for( int i=min;i<=max;i++){
            sum2 = sum2+i;
        }

        System.out.println(sum2-sum1);
    }
}
