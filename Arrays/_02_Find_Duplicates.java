import java.util.HashSet;

public class _02_Find_Duplicates {

    //Brute-Force Approach
    public static void findDuplicates(int arr[]){
        System.out.println("Duplicate elements are: ");
        for(int i=0;i<arr.length-1;i++){
            boolean flag = false;

            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }
        }
    }

    //Optimal Approach
    // public static void findDuplicates(int arr[]){
    //     HashSet<Integer> set1 = new HashSet<>();
    //     HashSet<Integer> duplicates = new HashSet<>();

    //     for(int ele:arr){
    //         if(!set1.add(ele)){
    //             if(duplicates.add(ele)){
    //                 System.out.println(ele);
    //             }
    //         }
    //     }
    // }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 3,5, 2, 2, 2, 5, 1 };
        findDuplicates(arr);
    }
}
