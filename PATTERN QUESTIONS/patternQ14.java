import java.util.Scanner;
public class patternQ14{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       /*
       incrasing: n-(n/2)  //toughst part of pattrn q is to make logics.
       stars:i+1;
       decreasing:n/2
       stars:(n/2-i,1)
        */
        for(int row=0;row<n-n/2;row++){
            for(int column=0;column<row+1;column++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row=0;row<n/2;row++){
            for(int column=0;column<n/2-row;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}