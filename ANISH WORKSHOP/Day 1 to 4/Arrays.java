import java.util.Scanner;
public class Arrays {
    /*
     type[] variable_name = new type[length];
     */
    public static void main(String[] args){
        int[] numbers = new int[10];
        // Scanner scanner = new Scanner(System.in);
        // int number = scanner.nextInt();
        System.out.println(java.util.Arrays.toString(numbers));
        numbers[0] =100;
        System.out.println(java.util.Arrays.toString(numbers));
        numbers[3] = -78;
        System.out.println(java.util.Arrays.toString(numbers));
        numbers[2] = 40;
        System.out.println(java.util.Arrays.toString(numbers));
        numbers[1] = 21;
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println(numbers.length);
        numbers[11] = 22;
         System.out.println(java.util.Arrays.toString(numbers));
    }
}
  /*
   
   */
