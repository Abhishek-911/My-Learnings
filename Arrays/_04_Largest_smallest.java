import java.util.Arrays;

public class _04_Largest_smallest {

    public static void findElement(int arr[]){
        int largest = Integer.MIN_VALUE;
        int largest_2nd = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int smallest_2nd = Integer.MAX_VALUE;
        for(int ele : arr){
            if(ele>largest){
                largest_2nd = largest;
                largest = ele;
            }else if(ele>largest_2nd && ele!=largest){
                largest_2nd = ele;
            }

            if(ele<smallest){
                smallest_2nd = smallest;
                smallest = ele;
            }else if(ele<smallest_2nd && ele!=smallest){
                smallest_2nd = ele;
            }
        }
        System.out.println("Largest element is: "+largest);
        System.out.println("Second Largest element is: "+largest_2nd);
        System.out.println("Smallest element is: "+smallest);
        System.out.println("Second Smallest is: "+smallest_2nd);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        findElement(arr);
    }
}
