import java.util.*;
public class Booleansearch {

   
    public static boolean Search(int num[][],int k){
        for(int i=0; i< num.length;i++ ){
            for (int j=0; j<num[0].length; j++) {
                if (num[i][j] == k) {
                   System.out.print("found at cell (" +i+ "," +j+ ")" ); 
                   return true;
                }
            }
       }
       System.out.println("key not found");
       return false;
       
    }           
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int mat[][]=new int [3][3];
        int n=mat.length;
        int  m=mat[0].length;

        System.out.println("enter the number: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
    
       //output
        for(int i=0;i<n;i++){
            for (int j=0; j<m ; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
       }
       System.out.println("enter key for search");
       int key=96;
      boolean found =Search(mat,key);
    }
}
