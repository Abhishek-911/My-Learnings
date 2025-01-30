import java.util.HashMap;
import java.util.Map;

public class _01_Frequency_of_Element {

    //Brute-Force Approach
    // public static void findFrequency(int arr[]){
    //     int freq[] = new int[arr.length];
    //     int visited = -1;
    //     for(int i=0;i<arr.length-1;i++){
    //         int count = 1;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 freq[j] = visited;
    //                 count++;
    //             }
    //         }
    //         if(freq[i]!=visited){
    //             freq[i] = count;
    //         }
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         if(freq[i]!=visited){
    //             System.out.println(arr[i]+":"+freq[i]);
    //         }
    //     }
    // }

    //Optimal Approach
    public static void findFrequency(int arr[]){
        HashMap<Integer,Integer> map1 = new HashMap<>();

        for(int ele:arr){
            map1.put(ele,map1.getOrDefault(ele,0)+1);
        }

        System.out.println("The Frequency of each Element: ");
        for(Map.Entry<Integer,Integer> entry:map1.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
        findFrequency(arr);
    }
}