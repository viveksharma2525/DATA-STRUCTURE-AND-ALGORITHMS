import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // stack: LIFO
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(4));
        System.out.println(factorial(8));
        return;
    }
   /* private static long factorial(int n){
        long result =1;
        for(int i=1;i<n;i++){
            result *= i;
        }
        return result;
    }
}