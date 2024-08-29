import java.util.Scanner;
public class PrimeNumbers{
    //2:true
    //3:true
    //1:false
    //4:false()
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isPrime(number));
    }
    private static boolean isPrime(int number){
       for(int divisor=2;divisor<number-1;divisor++){
            if(number%divisor==0){
            return false;
            }
        }
        return number !=1;
    }
    private static int factors(int number){
        int factors = 0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                factors++;
            }
        }
        return factors;
    }
    private static void printPrimes(int a,int b){
        
    }
}