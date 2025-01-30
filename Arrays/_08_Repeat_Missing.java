import java.util.Arrays;

public class _08_Repeat_Missing {

    public static void findElement(int arr[]){
        int result[] = new int[arr.length+1];
        for(int ele : arr){
            result[ele]++;
        }
        int repeating = -1, missing = -1;
        for(int i=1;i<result.length;i++){
            if(result[i]==2){
                repeating = i;
            }
            if(result[i]==0){
                missing = i;
            }
        }
        System.out.println("Repeating number: "+repeating);
        System.out.println("Missing number: "+missing);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 3 };
        System.out.println(Arrays.toString(arr));
        findElement(arr);
    }
}
