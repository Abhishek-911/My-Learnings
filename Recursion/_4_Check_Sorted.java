public class _4_Check_Sorted {

    public static void CheckOrder(int arr[],int index){
        if(index==arr.length){
            System.out.println("The given array is in sorted order");
            return;
        }
        if(arr[index]<arr[index-1]){
            System.out.println("Not in a Sorted order");
            return;
        }
        CheckOrder(arr, index+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        CheckOrder(arr,1);
    }
}
