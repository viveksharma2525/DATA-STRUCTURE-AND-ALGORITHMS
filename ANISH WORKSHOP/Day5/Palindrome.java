import java.util.Scanner;
public class Palindrome {
    private static final Scanner scanner = new Scanner((System.in));
    public static void main(String[] args) {
        int length = scanner.nextInt();
        int[] array = getArray(length);
        System.out.println(isPalindrome(array) ? "Palidrome":"Not Palidrome");
    }
    /*
      Array is anagram
      mom 
      hah
      a 
      aaa 
      {1,2,2,1}
      {} - true
      {1,2,3} - false
      {1,x,1} - true it only compares 1 and 1.
     */
    private static boolean isPalindrome(int[] array){
      for (int i = 0; i < array.length/2; i++) {
        if(array[i] != array[array.length-i-1]){
          return false;
        }
      }
      return true;
    } 

    private static int[] getArray(int length){
      int[] array = new int[length];
      for (int index = 0; index < array.length; index++) {
        array[index] = scanner.nextInt();
      }
      return array;
    }
}
