import java.util.Scanner;

public class CircularShiftInArray {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int length = scanner.nextInt();
        int [] array = getArray(length);
        /*
         circular right shift in an array.
         {1,2,3,4,5} r=1 {5,1,2,3,4}
         {1,2,3,4,5} r=2 {4,5,1,2,3}
         */

    }
    private static int[] getArray(int length){
        int[] array = new int[length];
        for (int index = 0; index < array.length; index++) {
            array[index] = scanner.nextInt();
        }
        return array;
    }
    
}
