import java.util.Scanner;
public class sumElements{
    public static void main(String[] args){
        //return sum of all elements
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for(int index=0;index<array.length;index++){
            array[index] = scanner.nextInt();
        }
        System.out.println(sumElements(array));
    }
        private static int sumElements(int[] array){
            int sum=0;
            for(int element:array){
                sum += element;
            }
            return sum;
        }
    
}