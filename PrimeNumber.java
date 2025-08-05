public class PrimeNumber {
 
    public static void prime_Range(int k){
        
        for(int i=2; i<=k; i++){
            
            int count=0;

            for(int j=1 ;j<=i; j++) {             //for (int j=1;j<=i;j++)
                       
                if ( i%j == 0) {   // for check the divisibility
                    count++;
                }   
           }

           if (count==2){      // if number is prime the it has only two factor 

                System.out.print(i+" ");     
           }
          
        }
        
      
    }
    public static void main(String[]args) {
        int n=20;
        prime_Range(n);
    }
}
