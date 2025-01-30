public class _5_Move_all_X {

    public static void moveAll(String str, int index,int count,String newString){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newString += 'x';
            }
            System.out.println("New string is: "+newString);
            return;
        }
        if(str.charAt(index)=='x'){
            count++;
            moveAll(str,index+1,count,newString);
        }else{
            newString += str.charAt(index);
            moveAll(str, index+1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        System.out.println("Original String: "+str);
        // String result = "";
        moveAll(str,0,0,"");
    }
}
