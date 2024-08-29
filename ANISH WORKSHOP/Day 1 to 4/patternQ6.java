/*
 main pattern 
 spaces: n-i-1
 star:i
 spaces:2i-1
 last row:2n-1
 f:_ 1 3 5 7 0
 i:0 1 2 3 4 5
*/


import java.util.Scanner;
public class patternQ6{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int row=0;row<n-1;row++){
            for(int col=0;col<n-row-1;col++){
                System.out.print(' ');
            }
            System.out.print("*");

           for(int col=0;col<2*row-1;col++){
                System.out.print("*");
            }
            if(row!=0){
                System.out.print("*");
            }
            System.out.println();
        }
        //Last row
        for(int row=0;row<2*n-1;row++){
            System.out.print("*");
        }
    }
}