import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for(int index=0;index<array.length;index++){
            array[index] = scanner.nextInt();
        }
        System.out.println(array);
    } 
    // for(int index=0; index<array.length;index++){
    // }
    // private static void print(int[] array){
    //     for (int index = 0; index< array.length; index++) {
    //         System.out.print(array[index] + " ");
    //     }
    // }

}