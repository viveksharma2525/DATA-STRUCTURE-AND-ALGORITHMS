import java.util.Scanner;
public class SumNNaturalNumber{
    //N
    //1+2+3+4+-----+N
    //s(n-1)
    //s(n) = n+(n-1)
    //base case
    // number == 1?1
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(sumNNaturalNumber(number));
        System.out.println(sumSquares(number));
    }
    private static long sumNNaturalNumber(int number){
        // if (number == 1){
        //     return 1;
        // }
        return number ==1?1:number+ sumNNaturalNumber(number-1);
    }
    //N
    //s(n)=1^2+2^2
    //s(n-1)=given
    private static long sumSquares(int number){
        return number ==1?1:sumSquares(number-1)+number*number;
    }

}