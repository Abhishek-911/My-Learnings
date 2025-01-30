public class Frequency_Str {
    public static void main(String[] args) {
        // Initialize the string
        String str = "Hello World";

        // Convert the string to a character array
        char[] arr = str.toCharArray();

        int fr[] = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]==arr[j] && arr[i]!=' '){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i]!=visited){
                fr[i] = count;
            }
        }

        System.out.println("Frequency of each Character: ");
        for(int i=0;i<arr.length;i++){
            if(fr[i]!=visited && arr[i]!=' '){
                System.out.println("Element: "+arr[i]+", Frequency: "+fr[i]);
            }
        }
    }
}
