public class upperdiagonal {
    public static void main(String[] args) {
        int n=4;
        //for row
        for (int i = 1; i <=n ; i++) {
            //for space   method-1

            // for (int j = 1; j <=n-i; j++) {
            //     System.out.print(" ");
            // }
            
            //star
            // for (int k= 1; k<=2*i-1; k++) {
            //     System.out.print("*");
            // }
            // System.out.println();

        

            //methd-2
            for (int j = 1; j <= 2*n-1; j++) { // Inner loop for columns
                if (j >= (n - i + 1) && j <= (n + i - 1)) { // Condition to print *
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }

        
    }
}
