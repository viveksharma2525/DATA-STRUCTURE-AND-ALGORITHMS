import java.util.Scanner;
public class Pascaltrinagle {
    /*
     0c0
     1c0 1c1
     2c0 2c1 2c2
     3c0 3c1 3c2 3c3
     nPr=n!/(n-r)!
     nCr = n!/(n-r)!*r!
     */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for(int i=0;i<rows;i++){
            for(int j-0;j<i+1;j++){
                System.out.print(combination(i,j)+" ");
            }
            System.out.println();
        }
    }
    private static int combination(int n,int r){
        return factorial(n)/(factorial(number:n-r)*factorial(r))
    }
    private static int factorial(int number){
        int
    }

}
