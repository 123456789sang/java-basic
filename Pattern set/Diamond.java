public class Diamond {
    public static void diamondPattern(int m){
        for(int i=1;i<=m;i++){
            //spaces
            for(int j=1;j<=m-i;j++ ){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //line
        for(int i=m;i>=1;i--){
            //spaces
            for(int j=1;j<=m-i;j++ ){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=3;
        diamondPattern(n);
    }
    
}