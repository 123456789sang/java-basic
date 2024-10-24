public class linaersearch {
    public static int linearSearch(int []arr,int value){
        for (int i= 0; i < arr.length; i++) {
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int number[]={2,4,6,8,10,12,14,16};
        int key=6;
        int index= linearSearch(number,key);
        if (index==-1) {
            System.out.println("key is not found");
        }
        else{
            System.out.println("the key index:"+index);
        }
    }

   
}
