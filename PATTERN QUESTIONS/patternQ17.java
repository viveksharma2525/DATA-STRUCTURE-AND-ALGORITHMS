import java.util.Scanner;
public class patternQ17{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /*
        1
        2*3
        4*5*6
        7*8*9*10
        7*8*9*10
        4*5*6
        2*3
        1        
         

        // increasing:
        rows:n
        number:i+1
        

        //decreasing:

    */ 
        //increasing
        for(int row=0;number=1;row<n;row++){
            for(int column=0;column<row+1;column++){
                System.out.print(number++ + (column==row ? "" : "*"));
            }
            System.out.println();
        }
    }
}