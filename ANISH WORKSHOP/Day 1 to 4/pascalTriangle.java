import java.util.Scanner;
public class pascalTriangle{
    public class void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /*
        0c0
        1c0 1c1
        2c0 2c1 2c2
        3c0 3c1 3c2 3c3

        factorial(n)
        nPr = n!/(n-r)!
        nCr = n!/(n-r)!*r!
         */
        for(int i=0; i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(combination(i,j)+ " ");
            }
            System.out.println();
        }

    }

    private static int combination(int n,int r){
        return factorial(n)/(factorial(number:n-r)*factorial(r));
    }

    private static int factorial(int number){
        int result = 1;
        for(int i=1;i<=number;i++){
            result*=i;
        }
        return result;
        }
}