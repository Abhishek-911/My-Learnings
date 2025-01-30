import java.util.Arrays;
import java.util.HashSet;

public class _03_Remove_Duplicates {

    //Brute_Force Approach
    public static int[] removeDuplicates(int arr[]) {
        int new_arr[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == arr[k]) {
                    flag = true;
                    // break;
                }
            }
            if (!flag) {
                new_arr[j++] = arr[i];
            }
        }
        int final_arr[] = Arrays.copyOf(new_arr, j);

        return final_arr;
    }

    //Optimal_Approach
    // public static int[] removeDuplicates(int arr[]){
    //     HashSet<Integer> set1 = new HashSet<>();

    //     for(int ele : arr){
    //         set1.add(ele);
    //     }

    //     int final_arr[] = new int[set1.size()];
    //     int index = 0;
    //     for(int ele : set1){
    //         final_arr[index++] = ele;
    //     }

    //     return final_arr;
    // }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
        System.out.println("Array with Duplicates: " + Arrays.toString(arr));
        int new_arr[] = removeDuplicates(arr);
        System.out.println("Array without Duplicates: " + Arrays.toString(new_arr));
    }
}
