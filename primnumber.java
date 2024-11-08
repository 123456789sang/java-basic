public class primnumber {
 
    public static void prime_Range(int k){
        int count=0;
        for(int i=2;i<=k;i++){
            for(int j=1;j<20;j++) {
                if (i%j==0) {
                    count++;
                   
                }
            }
            if(count<=1){
                System.out.print(" prime");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        int n=20;
        prime_Range(n);
    }
}
