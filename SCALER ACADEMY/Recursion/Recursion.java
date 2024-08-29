/*Recursion: 
int              //basic case
int main(){

}              // recursion call
 */ 
// import java.util.Arrays;
// import java.util.Scanner;
public class Recursion {
    /* 
    problem  : Factorial of n numbers;

    public static void main(String[] args) {
        int result = Factorial(4);
        System.out.println(result);
    }   
    private static int  Factorial(int n){
        if(n==0 ){     // base case
            return 1;
        }
        else{
            return n*Factorial(n-1);  // recursive calls
        }
    }
    */

    /*
     problem2 : sum of n natural numbers using recursion


    public static void main(String[] args) {
        int result = Numbers(5);
        System.out.println(result);
    }
    private static int Numbers(int n){
        if (n == 1){       // base condition
            return 1; 
        }
        else{
            return n+Numbers(n-1);  //recursive call
        }
    }
    */
     
     /* 
     problem: pow(x,n)

     expantation: x^n = x*x^n-1
                  3^4  =  3*3^3
                  3x3x3x3 = 3*27
                   
     */ 


     // method 1 
     /* 
    public static void main(String[] args) {
        int result = Power(3, 4);

        System.out.println(result);
    }
    private static int Power(int x,int n){
        if(n==0){
            return 1;
        }
        else{
            return x*Power(x, n-1);
        }
    }

    // method 2 
    /*
     second approach:   1. x^n/2 + x^n/2 = x^n if n is even
                        2. x*x^n-1 = x^n if n is odd
                        3. x^n = 1 if n=0
     
    public static void main(String[] args) {
        int result = Power(9, 7);
        System.out.println(result);
    }
    private static int Power(int x,int n){
        if(n==0){
            return 1;
        }
        else{
            if (n%2==0) {
                return Power(x, n/2)*Power(x, n/2);
            }
            else{
                return x*Power(x, n-1);
            }
        }
    }
    */

    /*
     Valid Palindrome or not using recursion
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string:");
        String palindrom = scanner.nextLine();
        boolean result = CheckPalindrom(palindrom);
        System.out.println(result);
    }
    private static boolean CheckPalindrom(String palindrom){
        if(palindrom.length() <= 1){
            return true;    //base condition
        }
        else{   //recusive calls
            if(palindrom.charAt(0) == palindrom.charAt(palindrom.length()-1)){
                return CheckPalindrom(palindrom.substring(1,palindrom.length()-1));
            }
            else{
                return false;
            }
        }
    }
}
*/





}
























