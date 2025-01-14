import java.util.Scanner;
public class Binomial{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = binomial(number);
        print(array);
        
    }
        private static void print(int[] array){
            for(int element:array){
                System.out.print(element + " ");
            }
        }
        private static int factorial(int number){
            if (number == 0){
                return 1;
            }
            return number*factorial(number -1);
        }
        private static int permutation(int n,int r){
            return factorial(n)/factorial(n-r);
        }
        private static int combination(int n,int r){
            return permutation(n, r)/factorial(r);
        }
        private static int[] binomial(int n){
            int[] result = new int[n+1];
            for(int index = 0;index<result.length;index++){
                result[index] = combination(n, index);
            }
            return result;
        }
        private static void printPascalTriangle(int rows){
            for(int i =0;i<rows;i++){
                binomial(i)
            }
        }
}