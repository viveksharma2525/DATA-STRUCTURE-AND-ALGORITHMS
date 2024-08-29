import java.util.Scanner;
public class DeepDiveArrays {
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
        // char characters = scanner.nextLine();
        char[] characters = new char[3];
        int[] array = new int[10];
        int[] numbers = {2,3,4,5,11,9};
        String[] messages ={"hello","world","yeaahhh"};
        // starting address + index*4bytes
        // System.out.println(characters[3]);
        // System.out.println(Integers[3]);
        print(numbers);
        print(messages);
        
    }
    private static void print(int[] array ){
    for(int index=0;index<array.length;index++){
        System.out.print(array[index] + " ");
            }
        }
    private static void print(String[] array){
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}
