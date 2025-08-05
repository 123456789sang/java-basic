public class patternrevesenum {
    public static void pattern_Set_with_number(int n ) {
     
        for(int k=0;k<n;k++){
            for(int i=n;i>0;i--){
                for(int j=0;j<n-k;j++){
                    System.out.print(i+" ");
                }
            } 
            System.out.print("$");
            System.out.println();    
        }
   }

   public static void main(String[] args) {
       int n=3;
       pattern_Set_with_number(n);
   }
   
}
