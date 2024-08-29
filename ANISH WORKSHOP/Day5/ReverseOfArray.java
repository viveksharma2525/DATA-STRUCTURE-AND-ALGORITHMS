import java.util.Arrays;
public class ReverseOfArray {
    public static void main(String[] args) {
        int[] array = {2,3,5,6,7,8};
        System.out.println((Arrays.toString(reverseArray(array))));
        print(reverseArray(array));
        print(reverseArray(new int[]{11,14,15,16}));
    }
    /*
     {109,90,65,45} -> {45,65,90,109}
     */
    private static int[] reverseArray(int[] array){
        int[] result = new int[array.length];
        //logic
        int j = 0;
        for(int i = array.length - 1; i>=0;i--){
            result[j] = array[i];
            j++;
        }
        return result;
    }
    private static void print(int[] array){
        for(int element:array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
