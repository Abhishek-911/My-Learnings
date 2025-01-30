import java.util.Arrays;

public class _17_Move_Zeroes {

    // Optimal approach
    public static void moveAll(int arr[]){
        int j = 0;
        for(int ele : arr){
            if(ele>0){
                arr[j++] = ele;
            }
        }
        while(j<arr.length){
            arr[j++] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 4, 6, 0, 4, 0, 2 };
        System.out.println("Original array: " + Arrays.toString(arr));
        moveAll(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
    }
}
