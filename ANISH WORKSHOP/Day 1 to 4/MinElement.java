import java.util.Scanner;
public class MinElement {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(minimum(new int[] {34,56,78,89}));
        // Scanner scanner = new int[]
        int length = scanner.nextInt();
        int [] array = getArray(length);


    }
    private static int minimum(int[] array){
        int min = Integer.MAX_VALUE;
        for(int element:array){
            if(element<min){
                min = element;
            }
        }
        return min;
    }
    private static int[] getArray(int length){
        int[] array = new int[length];
        for (int index = 0; index < array.length; index++) {
            array[index] = scanner.nextInt();
        }
        return array;
    }
}
