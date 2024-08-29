import java.util.Scanner;
public class fibonacci{
    //f(n) = f(n-1) + f(n-2) (n>=2)
    public static void main(String[] args){  
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Fibonacci(number));
    }
    private static int Fibonacci(int number){
        System.out.println("fibo: " + number);
        if (number == 0 || number == 1) {
            return 1;
        }
        return Fibonacci(number-1)+Fibonacci(number-2);
    }
}