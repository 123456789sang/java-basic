
public class reversenumber {
    public static int  print_Reverse(int k ){
        int res =0;
        while (k!=0) {
            int ls = k%10;
            res = res *10+ls ;
            k=k/10;
        }
        return res;
        
    }
    public static void main(String[] args) {
        int n=12345;
       System.out.println( print_Reverse(n));
    }
}
