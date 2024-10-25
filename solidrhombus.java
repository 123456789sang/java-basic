public class solidrhombus {
    public static void solidRhombus(int m){
        //line
        for(int i=1;i<=m;i++){
             //spaces
             for(int j=1;j<=m-i;j++){
               System.out.print(" ");
             }
             //stars
             for(int k=1;k<=m;k++){
                  System.out.print("*"+" ");
             }
             System.out.println();
        }
   }
   public static void main(String[] args) {
        int n=5;
        solidRhombus(n);
   }
}
