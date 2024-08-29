import java.util.Scanner;
public class Function {
    /*
     [accessModifier] [static]?[return typr] functionName(arg1,arg2,arg3...)
      code
      return value;(not compulsory)
     */
    public static void main(String[]args){
        // Scanner scanner = new Scanner(System.in);
        // int number =  scanner.nextInt();
        helloWorld();
        System.out.println("function is ended");
        String name = fullName("lakshay","Vivek");
        System.out.println(name);
        // int n = sumNaturalNumbers(10);
        // System.out.println(n);
        System.out.println(factorial(8));
    }
    private static void helloWorld(){
        System.out.println("Hello World");
        System.out.println("hi i am inside function");
    }
    private static String fullName( String firstName, String lastName){        return firstName + " " + lastName;
    }
    private static int numberIncrement(){
        int val=10;
        return val;
    }
    private static int sumNaturalNumbers(int number){
        return(number*(number+1))/2;
    }
    private static long factorial(int number){
        long result = 1;
        for(int i=0;i<=number;i++){
            result *= i;
        }
        return result;
    }
}