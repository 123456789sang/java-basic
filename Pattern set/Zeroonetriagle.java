public class Zeroonetriagle {
    public static void zero_Onetriagle(int m){
         for (int i= 0; i<=m; i++) {
              for(int j=1;j<=i;j++){
                   //even 
                   if((i+j)%2==0){
                        System.out.print("1"+" ");
                   }
                   else{
                        System.out.print("0"+" ");
                  }
              }
              System.out.println();
         }
    }
    public static void main(String[] args) {
         int n=5;
         zero_Onetriagle(n);
    }
    
}

    

