public class hollowrec {
    public static void hollowRectangle(int row,int col) {
        for (int i = 1; i <=row; i++) {//inner row
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                    
                }
                System.out.println();
            }
        }
    }
        public static void main(String[] args) {
            int totalrow=5;
            int totalcol=5;
        hollowRectangle(totalrow ,totalcol);
    
    }
}
  

