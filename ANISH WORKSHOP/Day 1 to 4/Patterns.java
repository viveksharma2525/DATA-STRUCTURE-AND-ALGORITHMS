/*
Kunal pattern tricks to solve pattern
1) No. of lines = no, of rows = No. of time outer loop will 
run 
  *
  * *
  * * *
  * * * *
2) identify for every rows no.
-> how many columns are there
-> types of elements in columns
3) what do you need to print 


import java.util.Scanner;
public class Patterns{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int row=1; row<=n;row++){ //outer loop-> no. of lines
            for(int col=1; col<=row;col++){
                System.out.print("*");
               }
               // when one row is printed we need new line
               System.out.println();
            }
    }
}


/*problem 2
****
****
****
****



import java.util.Scanner;
public class Patterns{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/
/* problem 3
*****
****
***
**
*
try to find the formula for row and column

C=N+1-R  WHERE C=COLUMN


import java.util.Scanner;
public class Patterns{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

/*
problem 4
1
12
123
1234
1234


import java.util.Scanner;
public class Patterns{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1; col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}



import java.util.Scanner;
public class Patterns{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int row=0;row<2*n-1;row++){
            int toalColsInRow=row>n?2*n-row:row;
            for(int col=0;col<toalColsInRow;col++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
/*

    
 */
import java.util.Scanner;
public class Patterns{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int row=0;row<n;row++){
            for(int col=0;col<row;col++){
                System.out.print(' ');
            }
            for(int col=0;col<=row;col++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}












































