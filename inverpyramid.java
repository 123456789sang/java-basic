public class inverpyramid {
    public static  void inVerted_half_pyramid_with_numbers(int m){
        for(int i=1;i<=m;i++){
             //for inner numbers
             //   for (int j=1;j<=m-1+i ; j++) 
             
             for(int j=1;j<=m-i+1; j++) {
                System.out.print(j);
             }
             System.out.println();
          }
       }
       
       public static void main(String[] args) {
          int n=6;
          inVerted_half_pyramid_with_numbers(n) ;  
      }
}
