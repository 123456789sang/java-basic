public class kadanalgo {
    public static void kadan(int []arr){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i = 0; i < arr.length; i++) {
            cs+=arr[i];
            if (cs<0) {
                cs=0;  
                // cs=0;  for negative number 
            }
            ms=Math.max(ms,cs);
        }
        System.out.println("our max subarray sum is :"+ms);
    }

    public static void main(String[] args) {
        int number[]={-2,4,6,8,10};
        kadan(number);
    } 
}
