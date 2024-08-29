import java.util.Scanner;
public class Patterns3{
    public static void main(String[] args){
        /*
        n=5(>=2)
        
        ----*
        ---*-*
        --*---*
        -*----*
        *********
        main pattern
        f:-1 1 3 5 7 9
        i:0 1 2 3 4 5 
        spaces:2i-1

        stars:i==0?0:1

        
        
         */

         Scanner scanner = new Scanner(System.in);
         int row = scanner.nextInt();

         for(int row=0; row<rows-1;row++){
            for(int i=0;i<rows-row-1;i++){
                System.out.print(' ');
            }
            System.out.println('*');
            for(int i=0;i < 2 * row-1;i++){
                System.out.print(' ');
            }
            System.out.println(row==0 ? ' ':'*');
         }
        // last row
         for(int i=0;i<2*rows-1;i++){
            System.out.println('*');
         }
    }
}