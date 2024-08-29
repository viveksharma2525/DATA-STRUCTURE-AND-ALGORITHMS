import java.util.Scanner;

public class RotationArray {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int length = scanner.nextInt();
        int[] array = getArray(length);
        shift(array, 2);
        print(array);
    }
    private static void print(int[] array){
        for(int element:array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] getArray(int length){
        int[] array = new int[length];
        for (int index = 0; index< array.length; index++) {
            array[index] = scanner.nextInt();
        }
        return array;
    }
    private static void shift(int[] array,int rotations){
        while(rotations--> 0){
            rightShift(array);
        }
    }
    private static void rightShift(int[] array){
        int lastIndex = array[array.length-1];
        for(int index = array.length-1;index>0;index--){
            array[index] = array[index-1];
        }
        array[0] = lastIndex;
    }
}
