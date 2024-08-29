/*
******  
 ****
  ***
   **
    *

    no. of spaces=rows-n

*/






import java.util.Scanner;
public class patternQ1{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int row=0;row<=n;row++){
            //int totalStars=row>n?2*n-row:row;
            for(int col=0;col<n;col++){ //for spaces
                System.out.print(' ');
            }
            for(int col=0;col<n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}