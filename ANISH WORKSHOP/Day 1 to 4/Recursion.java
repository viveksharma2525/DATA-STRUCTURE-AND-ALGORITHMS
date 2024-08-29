public class Recursion{
    //inception
    // famous error during printing factorial using recursion
    // There is only two case in the recursion 
    //recursive step
    //n! = n*(n-1)!
    //base case
    //0! = 1
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    private static long factorial(int number){
        if (number == 0) {
            return 1;
        }
        return number*factorial(number-1);
    }
    //factorial
    //func number=3
    //return 3*factorial(2)
    //factorial(2)
    //return 2*factorial(1)
    //factorial(1)
    //return 1*factorial(0)
    //factorial(0)
}