public class NumberPatern {
    public static  void numberPattern( int m ) {
          
        for (int i= 1; i<=m ; i++) {
              int count =i-1;
            for (int j=1; j<=2*i-1; j++) {
                if (j<=i) {
                    System.out.print(j+" ");
                }
                else {
                    System.out.print(count+" ");
                    count--;
                  
                }
            }
            System.out.println();
        }
   }
   public static void main(String[] args) {
        int n=10;
        numberPattern(n);
   }
   
}
